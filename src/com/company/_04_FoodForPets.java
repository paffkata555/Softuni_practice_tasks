package com.company;

import java.util.Scanner;


public class _04_FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());

        double totalBiscuits = 0;
        double totalDogFood = 0;
        double totalCatFood = 0;


        for (int day = 1; day <= days; day++) {
            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());

            totalDogFood += dogFood;
            totalCatFood += catFood;


            if (day % 3 == 0) {
                totalBiscuits += (dogFood + catFood) * 0.1;

            }
        }

        double totalEatenFood = totalDogFood + totalCatFood;
        double percentageOfFoodEaten = (totalEatenFood / totalFood) * 100;
        double percentageDogFood = (totalDogFood / totalEatenFood) * 100;
        double percentageCatFood = (totalCatFood / totalEatenFood) * 100;


        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(totalBiscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", percentageOfFoodEaten);
        System.out.printf("%.2f%% eaten from the dog.%n", percentageDogFood);
        System.out.printf("%.2f%% eaten from the cat.%n", percentageCatFood);


    }

}





