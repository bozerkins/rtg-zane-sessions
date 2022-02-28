package com.demopackage;

import java.util.Objects;
import java.util.Scanner;

public class InfiniteLoopExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Please enter some text:");
            String text = scanner.next();

            switch (text) {
                case "test":
                    System.out.println("Test statement");
                    break;
                case "hello":
                    System.out.println("Hello to you too");
                    break;
                default:
                    System.out.println("Cannot find matching response");
                    break;
            }
        }
    }
}
