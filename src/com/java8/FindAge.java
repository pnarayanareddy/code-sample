package com.java8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
 
public class FindAge 
{
    public static void main(String[] args) 
    {
        LocalDate birthDay = LocalDate.of(1986, 07, 01);
        LocalDate today = LocalDate.now();
         
        System.out.println(ChronoUnit.MONTHS.between(birthDay, today));
    }
}