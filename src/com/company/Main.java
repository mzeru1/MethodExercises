package com.company;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scann = new Scanner(System.in);
        int  choice;
        double x,y;
        System.out.println("press 1 for addition of two number\t" +
                "press 2 for division of tow numbers");
        choice = scann.nextInt();
        scann.nextLine();

        System.out.println("enter the two numbers");
        x = scann.nextDouble();
        y = scann.nextDouble();
        scann.nextLine();

        switch (choice){
            case 1:
                System.out.println("thier result of addition is :" + addNumbers(x,y));
                break;
            case 2:
                System.out.println("thier result of division is :" + divider(x,y));
                break;
        }
        // System.out.println("enter two numbers");


    }
    // what is the concept of static
    /*
      Add two numbers given by the user.
    */

    public static double addNumbers (double x,double y){
        return x + y;
    }

    /* 2, *Write an application to divide 2 numbers. Prompt the user to enter two numbers.
    Take the first number and divide it by the second number and print that result
    to the screen. If the second number is a zero, print "Undefined" to the screen,
    otherwise just print the result.*/

    public static double divider (double x, double y){
        return x/y;
    }

    /*Get 5 letters from the user, output them sorted
      (Hint: Use ArrayList and Collections.sort())
    */
    public static void soringLeter (){
        ArrayList<Character> strs = new ArrayList<Character>();
        Scanner scr = new Scanner(System.in);
        System.out.println("enter 5 leters");
        for (int i = 0; i < 5; i++){
            char y;
            y = scr.next().charAt(0);
            strs.add(y);
            Collections.sort(strs);

        }
        for(Character carac: strs){
            System.out.println();
        }
    }
}
