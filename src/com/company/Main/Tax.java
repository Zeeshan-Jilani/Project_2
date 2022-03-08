package com.company.Main;

import java.math.BigDecimal;

public class Tax {
    public static void main(String[] args){

        BigDecimal net_cost, Gross_value,products_sold;
        net_cost = new BigDecimal("9.99");
        Gross_value = BigDecimal.valueOf(9.99 + 0.23);
        products_sold = new BigDecimal(10000);
        //float Gross_value = (float) (9.99 + 0.23);

        System.out.println("The net cost of product: " + net_cost);
        System.out.println("The gross value of product: " + Gross_value);
        System.out.println("\nAmount after selling 10000 products: " + Gross_value.multiply(products_sold));
    }
}
