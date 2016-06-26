package com.restaff.moonpark.services;

import com.restaff.moonpark.dao.MoonParkDao;
import com.restaff.moonpark.model.*;
import com.restaff.moonpark.vo.PriceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import javax.ws.rs.core.Response;
import java.util.Date;

/**
 * Created by DHLE on 6/27/2016.
 */
public class MoonParkServiceImpl implements MoonParkService {

    @Autowired
    private MoonParkDao moonParkDao;

    public Response getPrice(Date checkInDate, Date checkOutDate, String moonParkCode) {
        if (checkInDate == null || checkOutDate == null || StringUtils.isEmpty(moonParkCode)) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }

        ParkZone parkZone = moonParkDao.getParkZone(moonParkCode);
        if (parkZone == null) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }

        RangeDate rangeDate = new RangeDate(new CheckInDate(checkInDate), new CheckOutDate(checkOutDate));
        try {
            float price = parkZone.calculatePrice(rangeDate);
            PriceResponse priceResponse = new PriceResponse();
            priceResponse.setPrice(price);

            return Response.ok(priceResponse).build();
        } catch (MoonParkException e) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }

    }
}
