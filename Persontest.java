package com.company;


import java.util.Scanner;

public class Persontest {
    public static void main(String[] args) {

        Scanner myDiscaount = new Scanner(System.in);
        System.out.println("Calculate");


        int Price = myDiscaount.nextInt();
        System.out.println("price :" + Price);

        Scanner discount = new Scanner(System.in);
        System.out.println("discount?");

        double Discount = discount.nextDouble();
        System.out.println(" discount is :" + Discount);


        Object finalPrice = Discount * Price;
        System.out.println("Total price :" + finalPrice);







    }



        }






















