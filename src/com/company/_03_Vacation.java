package com.company;

import java.util.Scanner;

public class _03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vacationPrice = Double.parseDouble(scanner.nextLine());
        double moneyOwned = Double.parseDouble(scanner.nextLine());

        int counterDays = 0;
        int counterSpend = 0;

        while (moneyOwned < vacationPrice && counterSpend < 5) {
            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            counterDays++;

            if ("save".equals(action)) {
                moneyOwned += money;
                counterSpend = 0;


            } else if ("spend".equals(action)) {
                moneyOwned -= money;
                counterSpend += 1;


                if (moneyOwned < 0) {
                    moneyOwned = 0;
                }


            }

        }

        if (counterSpend == 5) {
            System.out.println("You can't save the money.");
            System.out.println(counterDays);
        } else {
            System.out.printf("You saved the money for %d days.%n", counterDays);
        }

    }
}