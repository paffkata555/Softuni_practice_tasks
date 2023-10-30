package com.company;

import java.util.Scanner;

public class _06_OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        char numberOperator = scanner.nextLine().charAt(0);


        int result = 0;
        switch (numberOperator) {
            case '+':
                result = N1 + N2;

                if (result % 2 == 0) {
                    System.out.printf("%d %c %d = %d - even", N1, numberOperator, N2, result);

                } else {
                    System.out.printf("%d %c %d = %d - odd", N1, numberOperator, N2, result);
                }
                break;

            case '-':
                result = N1 - N2;

                if (result % 2 == 0) {
                    System.out.printf("%d %c %d = %d - even", N1, numberOperator, N2, result);

                } else {
                    System.out.printf("%d %c %d = %d - odd", N1, numberOperator, N2, result);
                }

                break;

            case '*':
                result = N1 * N2;

                if (result % 2 == 0) {
                    System.out.printf("%d %c %d = %d - even", N1, numberOperator, N2, result);

                } else {
                    System.out.printf("%d %c %d = %d - odd", N1, numberOperator, N2, result);
                }
                break;

            case '/':
                double reminder = (N1 * 1.0) / N2;

                if (N2 == 0) {
                    System.out.printf("Cannot divide %d by zero", N1);


                } else {
                    System.out.printf("%d / %d = %.2f", N1, N2, reminder);


                }

                break;

            case '%':
                double remainder = (1.0 * N1) % N2;

                if (N2 == 0) {
                    System.out.printf("Cannot divide %d by zero", N1);


                } else {
                    System.out.printf("%d %% %d = %.0f", N1, N2, remainder);

                }
                break;

        }


    }
}
