package com.company;

import java.util.Scanner;

public class _06_GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int locations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < locations; i++) {
            double expectedAverageGoldPerDay = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());

            double totalGold = 0;

            for (int day = 0; day < days; day++) {
                double goldPerDay = Double.parseDouble(scanner.nextLine());
                totalGold += goldPerDay;
            }

            double averageGoldPerDay = totalGold / days;

            if (averageGoldPerDay >= expectedAverageGoldPerDay) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageGoldPerDay);
                System.out.printf("You need %.2f gold.%n", averageGoldPerDay / days);

            } else {
                double neededGold = expectedAverageGoldPerDay * days - totalGold;
                System.out.printf("You need %.2f gold.%n", neededGold);
            }
        }
    }
}
