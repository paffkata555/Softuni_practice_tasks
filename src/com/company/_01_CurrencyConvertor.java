package com.company;

import java.util.Scanner;

public class _01_CurrencyConvertor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd = Double.parseDouble(scanner.nextLine());

        double bgn = usd * 1.7954;

        System.out.println(bgn);
    }
}

// create scanner
// create currency variable and parse it
// declared searching variable in double
// multiply currency value according bank rate exchange value
// print searching