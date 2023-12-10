package com.company;

import java.util.Scanner;

public class _01_Moon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double speed = Double.parseDouble(scanner.nextLine());
        double fuelConsumption = Double.parseDouble(scanner.nextLine());

        int distanceToMoon = 384_400;
        int timeOnMoon = 3;

        double totalDistance = 2 * distanceToMoon;
        double totalTime = Math.ceil((totalDistance / speed) + timeOnMoon);
        double totalFuelNeeded = (totalDistance / 100) * fuelConsumption;

        System.out.printf("%d%n", (int) totalTime);
        System.out.printf("%.0f%n", totalFuelNeeded);
    }
}

