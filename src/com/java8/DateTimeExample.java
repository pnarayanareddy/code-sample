package com.java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        // Current date and time
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        
        System.out.println("LocalDate : " + currentDate);
        System.out.println("LocalTime : " + currentTime);


        // Formatting date and time
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String formattedDateTime = currentDate + " " + currentTime.format(formatter);
//        System.out.println("Formatted DateTime: " + formattedDateTime);
    }
}
