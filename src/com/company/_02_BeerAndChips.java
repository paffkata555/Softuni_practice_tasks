package com.company;

import java.util.Scanner;

public class _02_BeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fanName = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int beerCount = Integer.parseInt(scanner.nextLine());
        int chipsCount = Integer.parseInt(scanner.nextLine());

        double beerPrice = 1.20;
        double chipsPrice = (beerPrice * beerCount) * 0.45;
        double totalCost = (beerPrice * beerCount) + Math.ceil(chipsPrice * chipsCount);

        if (budget >= totalCost) {
            System.out.printf("%s bought a snack and has %.2f leva left.%n", fanName, (budget - totalCost));
        } else {
            System.out.printf("%s needs %.2f more leva!%n", fanName, (totalCost - budget));
        }
    }
}






