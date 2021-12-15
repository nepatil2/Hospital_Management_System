package com.bl.hms;

import java.util.Map;

public class Doctor {

    enum weekDays{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    String name;
    String Id;
    String specialisation;
    long mobileNumber;
    String emailId;
    Map<weekDays, String> availability;
}
