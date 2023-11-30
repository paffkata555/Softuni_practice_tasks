package com.company;

import java.util.Scanner;

public class _03_MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());


        double pricePerDay = 0;

        if (season.equals("Summer")) {

            switch (destination) {
                case "Dubai":
                    pricePerDay = 40000;
                    break;
                case "Sofia":
                    pricePerDay = 12500;
                    break;
                case "London":
                    pricePerDay = 20_250;
                    break;
            }

        }
        if (season.equals("Winter")) {


            switch (destination) {
                case "Dubai":
                    pricePerDay = 45000;
                    break;
                case "Sofia":
                    pricePerDay = 17000;
                    break;
                case "London":
                    pricePerDay = 24000;
                    break;
            }


        }

        double totalCost = days * pricePerDay;

        if (destination.equals("Dubai")) {

            totalCost = totalCost - (totalCost * 0.30);

        } else if (destination.equals("Sofia")) {

            totalCost = totalCost + (totalCost * 0.25);
        }

        double remainingBudget = budget - totalCost;
        double needingBudget = Math.abs(budget - totalCost);

        if (remainingBudget >= 0) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!%n", remainingBudget);

        } else

            System.out.printf("The director needs %.2f leva more!%n", needingBudget);

    }

}
