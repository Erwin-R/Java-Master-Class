package com.potatochip;

import java.awt.*;

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
        //Changes both x and y coordinates of both points since both reference the same object
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
    }
}