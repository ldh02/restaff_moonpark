package com.restaff.moonpark.model;

import com.restaff.moonpark.util.MoonParkUtil;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static com.restaff.moonpark.model.ParkZone2.PRICE_PER_HOUR_ON_WEEKDAY;
import static com.restaff.moonpark.model.ParkZone2.PRICE_PER_HOUR_ON_WEEKEND;

/**
 * Created by DHLE on 6/25/2016.
 */
public class ParkZone3 extends ParkZone {

    static final Float PRICE_PER_MINUTE_IN_8_16 = 2F;
    static final Float PRICE_PER_MINUTE_IN_8_16_FOR_FIRST_HOUR = 0F;
    static final Float PRICE_PER_MINUTE_OUT_8_16 = 3F;
    static final Float PRICE_PER_MINUTE_FOR_SUNDAY = 0F;

    static final StartTime startTime = new StartTime(8, 0, 0);
    static final EndTime endTime = new EndTime(16, 0, 0);
    static final RangeTime rangeTime = new RangeTime(startTime, endTime);

    public ParkZone3(String code) {
        super(code);
    }

    public Float calculatePrice(RangeDate rangeDate) throws MoonParkException {
        return null;
    }
}
