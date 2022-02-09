package com.demopackage;

import java.util.Scanner;

public class LoopExample {
    public static void main(String[] args) {
        // 7. Write a Java program that takes a number
        // as input and
        // prints its multiplication table upto 10
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please enter int: ");
//        int number = scanner.nextInt();
//
//        System.out.println(number + "x1=" + (number * 1));
//        System.out.println(number + "x2=" + (number * 2));
//        System.out.println(number + "x3=" + (number * 3));
//        System.out.println(number + "x4=" + (number * 4));
//        System.out.println(number + "x5=" + (number * 5));
//        System.out.println(number + "x6=" + (number * 6));
//        System.out.println(number + "x7=" + (number * 7));
//        System.out.println(number + "x8=" + (number * 8));
//        System.out.println(number + "x9=" + (number * 9));
//        System.out.println(number + "x10=" + (number * 10));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number: ");
        int number = scanner.nextInt();

        for(int i = -3; i < 5; i++) {
            System.out.println(number + "x"
                    + (i + 1) + "=" + (number * (i + 1)));
        }

        System.out.println("End of loop");

        // 7. Write a Java program that takes numbers X and Y
        // as input and
        // prints multiplication table for X multiplied by number
        // from 1 to Y
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please enter X: ");
//        int x = scanner.nextInt();
//        System.out.println("Please enter Y: ");
//        int y = scanner.nextInt();
//
//        for(int i = 1; i <= 10; i = i + 1) {
//            System.out.println(number + "x" + i + "=" + (number * i));
//        }

//        int number = 5;
//        int i = 2;
//        System.out.println(number * (i + 1)); // 15
//        System.out.println(number * i + 1); // 11

        // ..
    }
}
