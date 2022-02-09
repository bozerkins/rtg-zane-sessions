package com.demopackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. read name from user
        System.out.println("Please enter your name: ");
        String name = in.next();

        // 2. read surname from user
        System.out.println("Please enter your surname: ");
        String surname = in.next();

        // 3. output name and surname
        System.out.println("Your full name is: ");
        System.out.println(name + " " + surname);
    }
}
