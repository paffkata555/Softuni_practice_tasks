package com.company;

import java.util.Scanner;

public class _05_PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodQuantity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int totalFoodEaten = 0;

        while (!input.equals("Adopted")) {
            int foodEaten = Integer.parseInt(input);
            totalFoodEaten += foodEaten;

            input = scanner.nextLine();
        }

        int leftovers = foodQuantity * 1000 - totalFoodEaten;

        if (leftovers >= 0) {
            System.out.printf("Food is enough! Leftovers: %d grams.", leftovers);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(leftovers));
        }
    }
}


