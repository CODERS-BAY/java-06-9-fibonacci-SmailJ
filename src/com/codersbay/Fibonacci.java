package com.codersbay;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Which number you want to know the fibionnaci thing ?");
        int number = sc.nextInt();

        int number1 = 0;
        int number2 = 1;
        int number3;

        for (int i = 1; i < number; ++i) {
            number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
        }

        System.out.println(number2);*/
        System.out.println("Which fibonacci number do you search ?");
        Scanner sc = new Scanner(System.in);
        int fibo = sc.nextInt();
        System.out.println(fibonacciFormula(fibo));
    }

    private static int fibonacciFormula(int number) {

        if (number == 0 || number == 1) {
            return number;
        } else {
            return fibonacciFormula(number - 1) + fibonacciFormula(number - 2);
        }
    }

}
