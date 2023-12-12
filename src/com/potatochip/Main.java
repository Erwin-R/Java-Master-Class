package com.potatochip;

import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        BODMAS
        B - Brackets
        O - Orders(powers/indices or roots)
        D - Division
        M - Multiplication
        A - Addition
        S - Subtraction

        int numberOne = 10;
        int numberTwo = 3;
        System.out.println(numberOne + numberTwo);
        System.out.println(numberOne - numberTwo);
        System.out.println(numberOne * numberTwo);
        System.out.println(numberOne / numberTwo);
        System.out.println(numberOne % numberTwo);
        System.out.println((2+2) * 3 * 2);
         */

        // Incrementing / Decrementing in Java
        /*
        Increment Operator: ++
        int number = 0;
        System.out.println(number++); current value (0) is read and then incremented
        System.out.println(number);
        int number2 = 0;
        System.out.println(++number2); current value is incremented and then read
        System.out.println(number2);
         */

        /*
        Decrement Operator: --
        int number = 0;
        System.out.println(number--); current value (0) is read and then decremented
        System.out.println(number);
        int number2 = 0;
        System.out.println(--number2); current value is decremented and then read
        System.out.println(number2);
         */


        /*
        Slow way to do it
        int increment = number + 1;
        int decrement = number - 1;
        System.out.println(increment);
        System.out.println(decrement);
         */

        //Reference Type/Objects (allows us to store more complex info)
//        int age = 21; //Primitive
//        Point pointA = new Point(10, 10); //Object
//        System.out.println("pointA: " + pointA);

        //Pass by value (Java is pass by value)
        //If you change variable "age" then ageCopy will stay the same and vice versa
//        int age = 21;
//        int ageCopy = increment(age);
//        System.out.println(age);
//        System.out.println(ageCopy);
//        Passes a copy of age into the method and increases it
//    static int increment(int age){
//        return ++age;
//    }

        //Pass by value with Reference/Objects
//        Changes both x and y coordinates of both points since both reference the same object
        Point pointA = new Point(10,10);
        Point pointB = pointA;

        pointA.x = 100;
        pointB.y = 90;
        System.out.println(pointA);
        System.out.println(pointB);

        //Will only change one point since pointB is now referencing a new object
        pointB = new Point(100, 90);
        pointB.y = 55;
        System.out.println(pointA);
        System.out.println(pointB);


        //Arrays
        //Default value of primitives is 0
//        int[] numbers = new int[3];
//        Arrays.fill(numbers, -1); //make default value of array with whatever value you give it
//        numbers[0] = 1;
//        numbers[1] = 33;
//        numbers[2] = 6;
//        System.out.println(Arrays.toString(numbers)); //prints contents inside of string
//        System.out.println(numbers); //prints array object
//        System.out.println(numbers.length);
//
//        int[] numbers2 = {0,5,6,8,9}; //shorthand version of lines above^
//        System.out.println(numbers2.length);
//
//        //Default value of objects is null
//        String[] names = new String[3];
//        names[1] = "Jamila";
//        System.out.println(Arrays.toString(names));

        //Loops
        for(int i = 0; i <= 10; i++){
            System.out.println("Hello " + i);
        }

        //Loops and Arrays
        String[] names = {"James", "Nadia", "Sophia", "Alex", "Saleh"};

        //Regular For Loop
        //Use this type of for loop if you need access to a particular index
        System.out.println("For i Loop");
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        //Enhanced For Loop
        //This type of for loop does not give access to particular index
        System.out.println("Enhanced For Loop");
        for(String name : names){
            System.out.println(name);
        }

        //While Loop (needs an exit condition to stop looping)
        int i = 0;
        boolean keepLooping = true;
        //use do when you want to execute code at least once regardless of condition
        do{
            System.out.println("Hello" + i++);
        } while (keepLooping);
    }
}