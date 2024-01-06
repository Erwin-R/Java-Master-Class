package com.potatochip;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Arrays;

public class CompileTwo {
//    enum TShirtSize{
//    }

    public static void main(String[] args){
        TShirtSize[] sizes= TShirtSize.values();

        for(TShirtSize size: sizes){
            String currentSize = size.name().toLowerCase();
            System.out.println(currentSize);
        }
        System.out.println(TShirtSize.M);


        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.of(2000, 3, 7).plusDays(100));

        LocalDate birthdate = LocalDate.of(2000, 3,7);
        LocalDate currentDate = LocalDate.now();
        int age = calculateAge(birthdate, currentDate);
        System.out.println(age);
    }


    private static int calculateAge(LocalDate birthDate, LocalDate currentDate){
        //One way to get it with "date" as only parameter
//        int currentYear = LocalDate.now().getYear();
//        int birthday = date.getYear();
//
//        return currentYear - birthday;
        // Calculate the period between the birth date and current date
        Period period = Period.between(birthDate, currentDate);

        // Get the years from the period
        int years = period.getYears();

        // Get the months from the period
        int months = period.getMonths();

        // Get the days from the period
        int days = period.getDays();

        // Adjust the age based on the months and days
        if (months < 0 || (months == 0 && days < 0)) {
            years--;
        }

        return years;
    }

}
