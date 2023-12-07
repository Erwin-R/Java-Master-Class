package com.potatochip;

public class Main {
    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = 3;
        System.out.println(numberOne + numberTwo);
        System.out.println(numberOne - numberTwo);
        System.out.println(numberOne * numberTwo);
        System.out.println(numberOne / numberTwo);
        System.out.println(numberOne % numberTwo);
        System.out.println((2+2) * 3 * 2);
        /*
        BODMAS
        B - Brackets
        O - Orders(powers/indices or roots)
        D - Division
        M - Multiplication
        A - Addition
        S - Subtraction
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
    }
}