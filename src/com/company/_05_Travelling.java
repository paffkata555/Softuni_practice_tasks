package com.company;

import java.util.Scanner;

public class _05_Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double minimumBudget = Double.parseDouble(scanner.nextLine());
            double savedMoney = 0;

            while (savedMoney < minimumBudget) {
                double needingMoney = Double.parseDouble(scanner.nextLine());
                savedMoney += needingMoney;
            }

            System.out.printf("Going to %s!%n", destination);

            destination = scanner.nextLine();
        }
    }
}
