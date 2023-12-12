package com.potatochip;

import java.util.Locale;

public class Compile {
    public static void main(String[] args) {
        System.out.println("I love cats");
//        System.out.println("I hate cats");

        int numberOne = 1;
        int numberTwo = 2;
        String result;

        if (numberOne < numberTwo){
            result = numberOne + " is less than " + numberTwo;
        } else if (numberOne > numberTwo){
            result = numberOne + " is greater than " + numberTwo;
        } else{
            result = numberOne + " is equal to " + numberTwo;
        }
        System.out.println(result);


        String string1 = "dog";
        String string2 = "cat";
        String result2;

        if (string1 == string2){ // or (string1.equals(string2))
            result2 = "These are the same word";
        } else{
            result2 = "These words are different";
        }

        System.out.println(result2);

        String amigosCode = "amigoscode";
        System.out.println(amigosCode.toUpperCase());
        System.out.println(amigosCode.substring(0,1).toUpperCase() + amigosCode.substring(1));
    }
}
