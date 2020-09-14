package com.codersbay;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Which number you want to now the fibionnaci thing ?");
        int zahl = s.nextInt();

        int zahl1 = 0;
        int zahl2 = 1;
        int zahl3;

        for (int i = 1; i < zahl; ++i) {
            zahl3 = zahl1 + zahl2;
            zahl1 = zahl2;
            zahl2 = zahl3;
        }

        System.out.println(zahl2);
    }

}
