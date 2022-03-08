package com.demopackage;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        char operator;
        Double number1, number2 = null, result;

        DecimalFormat format = new DecimalFormat("0.#");
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Choose an operator: +, -, *, /, root(^) or (2)second degree");
            operator = input.next().charAt(0);

            System.out.println("Enter first number");
            number1 = input.nextDouble();

            if (operator != '^') {
                System.out.println("Enter second number");
                number2 = input.nextDouble();
            }
            
            switch (operator) {
                case '+':
                    result = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + format.format(result));
                    break;
                case '-':
                    result = number1 - number2;
                    System.out.println(number1 + " - " + number2 + " = " + format.format(result));
                    break;
                case '*':
                    result = number1 * number2;
                    System.out.println(number1 + " * " + number2 + " = " + format.format(result));
                    break;
                case '/':
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + format.format(result));
                    break;
                case '^':
                    result = Math.sqrt(number1);
                    System.out.println("sqrt(" + number1 + ") = " + format.format(result));
                    break;
                case '2':
                    result = Math.pow(number1, number2);
                    System.out.println(number1 + " ^ " + number2 + " = " + format.format(result));
                    break;
                default:
                    System.out.println("Invalid operator!");
                    break;
            }
        }
    }
}
