package com.potatochip;

import java.util.Arrays;
import java.util.Locale;

public class Compile {
    public static void main(String[] args) {
//        System.out.println("I love cats");
////        System.out.println("I hate cats");
//
//        int numberOne = 1;
//        int numberTwo = 2;
//        String result;
//
//        if (numberOne < numberTwo){
//            result = numberOne + " is less than " + numberTwo;
//        } else if (numberOne > numberTwo){
//            result = numberOne + " is greater than " + numberTwo;
//        } else{
//            result = numberOne + " is equal to " + numberTwo;
//        }
//        System.out.println(result);
//
//
//        String string1 = "dog";
//        String string2 = "cat";
//        String result2;
//
//        if (string1 == string2){ // or (string1.equals(string2))
//            result2 = "These are the same word";
//        } else{
//            result2 = "These words are different";
//        }
//
//        System.out.println(result2);
//
//        String amigosCode = "amigoscode";
//        System.out.println(amigosCode.toUpperCase());
//        System.out.println(amigosCode.substring(0,1).toUpperCase() + amigosCode.substring(1));
//
//        //Exercises for Loops and Arrays
//        int[] numbers = new int[3];
//        Arrays.fill(numbers, 4);
//        numbers[1] = 17;
//        for(int i = 0; i < numbers.length; i++){
//            System.out.println(numbers[i]);
//        }
//        System.out.println(Arrays.toString(numbers));
//
//        String[] letters = {"a", "b", "c", "d"};
////        for(String letter: letters){
////            System.out.println(letter);
////        }
//        System.out.println("Original Array:");
//        for (int i = 0; i < letters.length; i++) {
//            System.out.println("Element at index " + i + ": " + letters[i]);
//        }
//
//        String[] newArray = letters;
//        newArray[0] = "z";
////        for(String letter: newArray){
////            System.out.println(letter);
////        }
//        System.out.println("\nNew Array:");
//        for (int i = 0; i < newArray.length; i++) {
//            System.out.println("Element at index " + i + ": " + newArray[i]);
//        }
//
//        //copyOf(), needs the array it is copying and new length of copied array
//        String[] copyArray = Arrays.copyOf(letters, 4); //can also put letters.length for newLength
//        copyArray[0] = "z";
//        System.out.println("\nCopy Array:");
//        for (int i = 0; i < copyArray.length; i++) {
//            System.out.println("Element at index " + i + ": " + copyArray[i]);
//        }


//        for(int i = 10; i >= 0; i--){
//            System.out.println(i);
//        }
//
//        int[] numbers2 = new int[11];
//
//        for(int i = 0; i < numbers2.length; i++){
//            numbers2[i] = i;
//        }
//
//        System.out.println(Arrays.toString(numbers2));
//
//        int[] sumArray = {1,2,3,4};
//        int sum = 0;
//
//        for(int i = 0; i < sumArray.length; i++){
//            sum += sumArray[i];
//        }
//
//        System.out.println(sum);
//
////        String[] words = {"I", "sure", "do", "love", "bees"};
//        String[] words = {"i", "sure", "do", "love", "bees"};
//
//
//        for(int i = 0; i < words.length; i++){
////            words[i] = words[i].toUpperCase();
//            String word = words[i];
//            //Character wrapper class with methods. Captures a char and makes it into an object with methods
//            words[i]= Character.toUpperCase(word.charAt(0)) + word.substring(1);
//        }
//
//        System.out.println(Arrays.toString(words));
//
//        String[] content = {"you", "are", "how", "hello"};
//        // Reverse the array using a for loop
//        for (int i = content.length - 1; i >= 0; i--) {
//            System.out.print(content[i]);
//            if (i != 0) {
//                System.out.print(" ");
//            }
//        }
//
//        System.out.print("?");
//
//        String input = "0.90, 1.00, 9.00, 8.78, 0.01";
//        double result = 0;
//        String[] numbers = input.split(",");
//
//        for(int i = 0; i < numbers.length; i++){
//            double convert = Double.parseDouble(numbers[i]);
//            result += convert;
//        }
//
//        System.out.println(result);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }

        //Boolean

    }
}
