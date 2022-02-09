package com.demopackage;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter int: ");
        int number = scanner.nextInt();

        System.out.println("Please enter your name: ");
        String text = scanner.next();

        System.out.println("Your int is " + number);
        System.out.println("Your name is " + text);
    }
}
