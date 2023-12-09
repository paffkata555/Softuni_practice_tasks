package com.company;

import java.util.Scanner;

public class _06_MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int thirdDigit = number % 10;
        int secondDigit = (number / 10) % 10;
        int firstDigit = number / 100;

        for (int i = 1; i <= thirdDigit; i++) {
            for (int j = 1; j <= secondDigit; j++) {
                for (int k = 1; k <= firstDigit; k++) {
                    int result = i * j * k;

                    System.out.printf("%d * %d * %d  = %d;%n", i, j, k, result);
                }
            }
        }
    }
}




