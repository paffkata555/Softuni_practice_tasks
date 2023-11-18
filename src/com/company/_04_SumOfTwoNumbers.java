package com.company;

import java.util.Scanner;

public class _04_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int combinationCounter = 0;
        boolean isMagicNumberFound = false;

        for (int firstNumber = start; firstNumber <= end; firstNumber++) {
            for (int secondNumber = start; secondNumber <= end; secondNumber++) {
                combinationCounter++;

                if ((firstNumber + secondNumber) == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinationCounter, firstNumber, secondNumber, magicNumber);
                    isMagicNumberFound = true;
                    break;
                }

            }
            if (isMagicNumberFound) {
                break;
            }

        }
        if (!isMagicNumberFound) {
            System.out.printf("%d combinations - neither equals %d", combinationCounter, magicNumber);
        }

    }
}
