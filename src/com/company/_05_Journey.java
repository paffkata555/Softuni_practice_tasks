package com.company;

import java.util.Scanner;

public class _05_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String seasonType = scanner.nextLine();


        String typeVacation = "";
        String destination = "";
        double moneySpend = 0.0;
        switch (seasonType) {
            case "summer":
                typeVacation = "Camp";
                if (budget <= 100) {
                    destination = "Bulgaria";
                    moneySpend = budget * 0.30;
                } else if (budget <= 1000) {
                    destination = "Balkans";
                    moneySpend = budget * 0.40;
                }

                break;

            case "winter":
                typeVacation = "Hotel";

                if (budget <= 100) {
                    destination = "Bulgaria";
                    moneySpend = budget * 0.70;

                } else if (budget <= 1000) {
                    destination = "Balkans";
                    moneySpend = budget * 0.80;

                }
                break;

        }

        if (budget > 1000) {
            typeVacation = "Hotel";
            destination = "Europe";
            moneySpend = budget * 0.90;

        }
        System.out.printf("Somewhere in %s ", destination);
        System.out.println();
        System.out.printf("%s - %.2f ", typeVacation, moneySpend);
    }
}
