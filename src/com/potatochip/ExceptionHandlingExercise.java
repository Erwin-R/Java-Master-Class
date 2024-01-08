package com.potatochip;

public class ExceptionHandlingExercise {
    public static void main(String[] args) {
        int sum = 0;
        StringBuilder nonInt = new StringBuilder();

        for(String arg: args){
            try{
                int num = Integer.parseInt(arg);
                sum += num;
            }catch(NumberFormatException e){
                if(nonInt.length() > 0){
                    nonInt.append(", ");
                }
                nonInt.append(arg);
            }
        }

        System.out.println("Sum: " + sum);
        if(nonInt.length() > 0){
            System.out.println("and " + nonInt + " are not numbers");
        }

        try {
            int result = 10 / 0;
        }catch (ArithmeticException e){
            System.out.println("Cannot Divide by 0");
        }


    }

}
