package com.company;

import java.util.Scanner;

public class _08_NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

//        int minNumber = 0; pri otricatelno chislo 0 e max ,zatova se vzema MAX_VALUE
//        int maxNumber = 0; prisvoqvame naj-golqmoto polojitelno chislo ,zatova se vzema MIN_VALUE

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;


        for (int i = 1; i <= n; i++) {

            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;

            }
            if (currentNumber < minNumber) {
                minNumber = currentNumber;

            }
        }
        System.out.println("Max number: " + maxNumber);
        System.out.println("Min number: " + minNumber);

    }
}
