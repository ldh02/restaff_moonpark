package com.restaff.moonpark.model;

/**
 * Created by DHLE on 6/26/2016.
 */
public class RangeTime {

    private StartTime startTime;
    private EndTime endTime;

    public RangeTime(StartTime startTime, EndTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public StartTime getStartTime() {
        return startTime;
    }

    public void setStartTime(StartTime startTime) {
        this.startTime = startTime;
    }

    public EndTime getEndTime() {
        return endTime;
    }

    public void setEndTime(EndTime endTime) {
        this.endTime = endTime;
    }
}
