package com.company.Main;

public class MarsWeightCalc {
    public static void main(String[] args) {

        float w_on_earth;
        float w_on_mars;
        double w_on_marsInDouble;
        int w_on_marsInInt;
        char w_on_marsInChar;

        //Introduction
        System.out.println("Hi, Welcome to Mars Weight Calculator\n");

        //weight on Mars in float
        w_on_earth = 64;
        w_on_mars = (w_on_earth * 0.38F);
        System.out.println("Your weight on mars is (in Float value): " + w_on_mars);

        //weight on Mars in double
        w_on_marsInDouble = w_on_mars;
        System.out.println("Your weight on mars is (in Double value): " + w_on_marsInDouble);

        //weight on Mars in double while limiting the decimal places to 4
        System.out.printf("Your weight on mars is (4 decimal places): %.4f %n" , w_on_marsInDouble);

        //weight on Mars in Int
        w_on_marsInInt = (int) w_on_mars;
        System.out.println("Your weight on mars is (in Int value): " + w_on_marsInInt);

        //weight on Mars in Char
        w_on_marsInChar = (char) w_on_mars;
        System.out.println("Your weight on mars is (in Char value): " + w_on_marsInChar);

        //assign the value of performing some mathematical operation on the char character to the new int variable
        int ExampleOfMath_on_Char = w_on_marsInChar * w_on_marsInChar;
        System.out.println("example of mathematical operation on char is: " + ExampleOfMath_on_Char);

    }
}
