package com.restaff.moonpark.model;

/**
 * Created by DHLE on 6/26/2016.
 */
public abstract class MoonParkTime {
    static final int MIN_HOUR = 0;
    static final int MAX_HOUR = 23;

    static final int MIN_MUNUTE = 0;
    static final int MAX_MINUTE = 59;

    static final int MIN_SECOND = 0;
    static final int MAX_SECOND = 59;

    private int hour;
    private int minute;
    private int second;

    public MoonParkTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
