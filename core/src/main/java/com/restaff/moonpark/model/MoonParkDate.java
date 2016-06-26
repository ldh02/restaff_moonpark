package com.restaff.moonpark.model;

import org.apache.commons.lang3.time.DateUtils;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by DHLE on 6/26/2016.
 */
public abstract class MoonParkDate {

    static final long TOTAL_HOURS_IN_DATE = 24;
    static final long TOTAL_MINUTES_IN_DATE = TOTAL_HOURS_IN_DATE * 60;

    private Date date;

    public MoonParkDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isValid() {
        return date != null;
    }

    public long getTotalHoursInDay() {
        return TOTAL_HOURS_IN_DATE;
    }

    public long getTotalMinutesInDay() {
        return TOTAL_MINUTES_IN_DATE;
    }

    public Date getStartOfDay() {
        return DateUtils.truncate(getDate(), Calendar.DATE);
    }

    public Date getEndOfDay() {
        return DateUtils.addMilliseconds(DateUtils.ceiling(getDate(), Calendar.DATE), -1);
    }

    public boolean isWeekday() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int dayOfWeek = calendar.get (Calendar.DAY_OF_WEEK);
        boolean isWeekday = ((dayOfWeek >= Calendar.MONDAY) && (dayOfWeek <= Calendar.FRIDAY));

        return isWeekday;
    }

    public boolean isSunday() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int dayOfWeek = calendar.get (Calendar.DAY_OF_WEEK);
        return dayOfWeek == Calendar.SUNDAY;
    }
}
