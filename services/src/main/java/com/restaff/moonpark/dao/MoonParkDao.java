package com.restaff.moonpark.dao;

import com.restaff.moonpark.model.ParkZone;
import com.restaff.moonpark.model.ParkZone1;
import com.restaff.moonpark.model.ParkZone2;
import com.restaff.moonpark.model.ParkZone3;

/**
 * Created by DHLE on 6/27/2016.
 */
public class MoonParkDao {

    public ParkZone getParkZone(String code) {
        if ("M1".equalsIgnoreCase(code)) {
            return new ParkZone1(code);
        } else if ("M2".equalsIgnoreCase(code)) {
            return new ParkZone2(code);
        } else if ("M3".equalsIgnoreCase(code)) {
            return new ParkZone3(code);
        } else {
            return null;
        }
    }
}
