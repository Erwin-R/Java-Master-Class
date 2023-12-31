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
        String myString = new String("Hello");
        String myString2 = new String("Hello");
        // using equals() makes the two objects equal.
        // if just "==" then it will say they are not equal
        if(myString.equals(myString2)){
            System.out.println("These strings are equal");
        } else{
            System.out.println("They are not equal");
        }

        int numberOne = 10;
        int numberTwo = 20;
        int numberThree = 30;

        if(numberTwo > numberOne || numberTwo < numberThree){
            System.out.println("Number is in between");
        } else{
            System.out.println("NUmber is not in between");
        }

        String string1 = "hello";
        char character = 'D';
        char specifiedChar = Character.toLowerCase(character);
        boolean characterFound = false;
        for(int i = 0; i < string1.length(); i++) {
            //Makes it case insensitive when converting before comparison
            char string1Char = Character.toLowerCase(string1.charAt(i));

            if (string1Char == specifiedChar) {
                characterFound = true;
                break;
            }
        }

        if(characterFound){
            System.out.println("Found specific character");
        } else{
            System.out.println("Did not find character");
        }


        for(int i = 0; i < 21; i+= 2){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

        String stringVar = "hello";

        for(int i = stringVar.length() -1; i >= 0; i--){
            System.out.println(stringVar);
        }

        String amigos = "   amig os cod e  ";

        addNumbers(1, 2);
        oppositeSign(-5);
        oppositeSign(1);
        System.out.println(negate(-5));
        System.out.println(negate(1));
        System.out.println(equalNumber(1,1));
        System.out.println(equalNumber(1,2));
        comparingNum(5,10);
        System.out.println(capitalizeString("hello world"));

        String[] names = {"Alice", "Walter", "Adam", "Ryan"};
        System.out.println(arrayLength(names));

        String sentence1 = "Hello, this is a sample sentence.";
        System.out.println(numOfWords(sentence1));


    }
    public static void addNumbers(int n1, int n2){
        int sum = n1 + n2;
        System.out.println(sum);
    }

    public static void oppositeSign(int num){
        if(num < 0){
            System.out.println(Math.abs(num));
        } else{
            System.out.println(-num);
        }
    }

    public static int negate(int num){
        return -num;
    }

    public static boolean equalNumber(int n1, int n2){
        if(n1 == n2){
            return true;
        }
        return false;
    }

    public static void comparingNum(int n1, int n2){
        if(n1 == n2){
            System.out.println("numbers are equal");
        }else if(n1 > n2){
            System.out.println(n1 + " is greater than " + n2);
        } else{
            System.out.println(n1 + " is less than " + n2);
        }
    }

    public static String capitalizeString(String word){
        String firstLetter = word.substring(0,1).toUpperCase();
        String secondHalf = word.substring(1);
        return firstLetter + secondHalf;
    }

    public static int arrayLength(String[] arr){
        return arr.length;
    }

    public static int numOfWords(String sentence){
        String[] splitSentence = sentence.split(" ");
        return splitSentence.length;
    }

}
