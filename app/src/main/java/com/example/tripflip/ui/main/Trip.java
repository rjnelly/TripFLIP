package com.example.tripflip.ui.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Trip {
    private String name;
    private Date startDate;
    private Date endDate;

    public Trip(){

    }

    public Trip(String name) {
        this.name = name;
    }

    public Trip(String name, Date startDate) {
        this.name = name;
        this.startDate = startDate;
    }

    public Trip(String name, Date startDate, Date endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public String getDateString() {
        SimpleDateFormat format =new SimpleDateFormat("MMM dd, yyyy", Locale.US);
        String date = format.format(startDate) + " - " + format.format(endDate);
        return date;
    }
}
