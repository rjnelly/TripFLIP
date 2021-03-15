package com.example.tripflip.ui.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Trip {
    private String name;
    private Date startDate;
    private Date endDate;

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

    public String getDateString() {
        SimpleDateFormat format =new SimpleDateFormat("MMM dd, yyyy", Locale.US);
        String date = format.format(startDate) + " - " + format.format(endDate);
        return date;
    }
}
