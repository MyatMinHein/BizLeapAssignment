package com.bizleap.assignment.three;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by M2h_Laptop on 1/15/2018.
 */
public class ShowCalendar {
    public static void main(String[] args) {
        int dayOfYear = 112;
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(java.util.Calendar.DAY_OF_YEAR, dayOfYear);
        System.out.println("Day " + dayOfYear + " of the current year = "
                + calendar.getTime());

        // If you want to get the date for a specific day of year and for
        // a specific year, you can also pass the year information to the
        // calendar object.
        int year = 2020;
        calendar.set(java.util.Calendar.YEAR, year);
        System.out.println("Day " + dayOfYear + " in year " + year
                + " = " + calendar.getTime());
    }
}
