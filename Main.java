
package com.company;

import java.util.Arrays;
import java.util.Scanner;

                   public class Main {
                       //Homework

    /*1)
        Create a program that keeps asking for a password
        Make sure you are using the Scanner Class/Object
        Once the user gets the password correct
        Print out a message to the user eg: logged in
        Keep track of how many wrong attempts they made
        Then display their number of wrong attempts*/
/*2)
    Created a method that takes a price and a discount amount
    Calculate the final price after discounts*/
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

/*3)
    Complete this method*/
                               public int lengthOfStringMethod(String x) {
                                   return x.length();
                               }

    /*4)
        Write a method that takes one parameter/argument and squares the number*/
                               public double SquareTheNumber(int x) {
                                   double product = Math.pow(x, 2);
                                   return x;



                               }

/*5)
    Write a while loop that prints only even numbers from 10 - 0 but once the loop gets to 5 break out of the loop*/


                               int x = 11;
                               while (x > 0) {
                                   x++;
                                   if(x == 5);
                                   break;


/*6)
    Create a program that scans for a student's number grade number prints a student's letter grade based on the following conditions:
            if a student's grade is between 90 and 100 then print you got an A
            if a student's grade is between 89 and 80 then print you got a B
            if a student's grade is between 79 and 70 then print you got a C
            if a student's grade is between 69 and 60 then print you got an D
            if a student's grade is  59 and below then print you got an F*/

                                   public class Persontest {

                                       public static void main(String[] args) {
                                           Scanner myGrade = new Scanner(System.in);
                                           System.out.println(" Get Grade");

                                           String userGrade = myGrade.nextLine();


                                           int x = myGrade.nextInt();
                                           if (x > 90 && x < 100) {
                                               System.out.println("you got an A");
                                           }
                                           if (x > 80 && x < 89) ;{
                                               System.out.println("you got a B");

                                           }
                                           if (x > 70 && x < 79);{
                                               System.out.println("you got a C");
                                           }
                                           if (x > 60 && x < 69);{
                                               System.out.println("you got a D");*/



           /* 7)
    Create a method that prints from 45 - 0 however it should print the following:
            1 - print Year if the number is divisible by 3
            2 - print Up if the number is divisible by 5
            3 - Print YearUp if the number is divisible by both 3 and 5*/
                                               for (int x = 45; x > 0; x--) ;{
                                                   int x = 45;
                                                   if (x % 3 == 0);*/

        /* 8)
    Create an array of your top 5 artist

             public static void printArtist(String[] favoriteArtist){

        for(int p = 0; p < favoriteArtist.length; p++);
        System.out.println(favoriteArtist[p]);
    }




    public static void main(String[] args) {

        String[] favoriteAtrist = {"Meghan Trainor", "Charlie Puth", "Lizzo", "Cardi B", "Logic"};
                printArtist(favoriteAtrist);
    }




    public static void main(String[] args) {



    Write a loop to print them all out!*/
            /*9)
    Write a while loop that prints only even numbers from 10 - 0 but once the loop gets to 5 break out of the loop*/
/*10)
    Create a method that calculates the circumference of a circle*/

    /*static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.print("Radius: ");

        double radius = sc.nextDouble();

        double area = Math.PI * (radius * radius);
        System.out.println("Area of circle: " + area);

        double circumference= Math.PI * 2*radius;
        System.out.println( "Circumference of circle:"+circumference) ;
    }*/




    















