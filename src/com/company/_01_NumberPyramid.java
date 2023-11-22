package com.company;

import java.util.Scanner;

public class _01_NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int numCounter = 1;
        boolean isBiggerThanN = false;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(numCounter + " ");
                numCounter++;

                if (numCounter > n) {
                    isBiggerThanN = true;
                    break;
                }

            }
            if (isBiggerThanN) {
                break;
            }
            System.out.println();
        }


    }
}
