package com.potatochip;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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


//        System.out.println("What is your name?");
//        String input = scanner.nextLine();
//        System.out.println("Hello " + input.toUpperCase());
//        System.out.println("Pick an number");
//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//        boolean flag = false;
//
//        for(int i = 2; i <= input/2; ++i){
//            if(input % i == 0){
//                flag = true;
//                break;
//            }
//        }
//        if (!flag)
//            System.out.println(input + " is a prime number.");
//        else
//            System.out.println(input + " is not a prime number.");
//
//        scanner.close();

//        // Check if the program was run with arguments
//        if(args.length == 0){
//            System.out.println("Please provide numbers as program arguments");
//            return;
//        }
//        // Iterate through each argument and check if it's even or odd
//        for(String arg: args) {
//            try {
//                int number = Integer.parseInt(arg);
//                System.out.println(number);
//                if(number % 2 == 0){
//                    System.out.println(number + " is even!");
//                } else{
//                    System.out.println(number + " is odd!");
//                }
//            } catch (NumberFormatException e) {
//                System.out.println(arg + "is not a valid integer");
//            }
//        }

        String[] jokes = {"joke1", "joke2", "joke3"};
        System.out.println("Wanna hear a joke? Yes/No");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        // use the code below to generate random numbers. In this case from 0 to 9
        int randomNumber = random.nextInt(jokes.length);
//        System.out.println(jokes[randomNumber]);

        // You need to change random.nextInt(9); accordingly to match your jokes array length

        if(input.equals("Yes")){
            System.out.println(jokes[randomNumber]);
        } else if(input.equals("No")){
            scanner.close();
        }
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
