package com.company.Main;

public class Tax {
    public static void main(String[] args){

        double net_cost = 9.99;
        float Gross_value = (float) (9.99 + 0.23);

        System.out.println("The net cost of product: " + net_cost);
        System.out.println("The gross value of product: " + Gross_value);
        System.out.println("\nAmount after selling 10000 products: " + net_cost * 10000);
    }
}
