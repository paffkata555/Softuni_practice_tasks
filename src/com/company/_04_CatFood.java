package com.company;

import java.util.Scanner;

public class _04_CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int catCount = Integer.parseInt(scanner.nextLine());

        int smallCats = 0;
        int mediumCats = 0;
        int largeCats = 0;
        double totalFoodPrice = 0.0;

        for (int i = 0; i < catCount; i++) {
            double foodGrams = Double.parseDouble(scanner.nextLine());

            if (foodGrams >= 100 && foodGrams < 200) {
                smallCats++;
            } else if (foodGrams >= 200 && foodGrams < 300) {
                mediumCats++;
            } else if (foodGrams >= 300 && foodGrams < 400) {
                largeCats++;
            }

            totalFoodPrice += foodGrams / 1000 * 12.45;


        }

        System.out.printf("Group 1: %d cats.%n", smallCats);
        System.out.printf("Group 2: %d cats.%n", mediumCats);
        System.out.printf("Group 3: %d cats.%n", largeCats);
        System.out.printf("Price for food per day: %.2f lv.", totalFoodPrice);
    }
}



