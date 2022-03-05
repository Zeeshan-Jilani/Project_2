package com.company.Main;

public class OddEven {
    public static void main(String[] args) {

        //generating a random number between 1 and 100
        int r_number = (int) (Math.random() * (100-1));

        //Checking odd / even
        if (r_number%2 == 0){
            System.out.println(r_number + " is an even number");
        }
        else {
            System.out.println(r_number + " is an odd number");
        }
    }
}
