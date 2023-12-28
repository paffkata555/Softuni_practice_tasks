package com.company;

import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodQuantityInKg = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int totalEatenFood = 0;

        while (!command.equals("Adopted")) {
            int eatenFoodForEachFeeding = Integer.parseInt(command);
            totalEatenFood += eatenFoodForEachFeeding;

            command = scanner.nextLine();
        }
        int leftoverFood = foodQuantityInKg * 1000 - totalEatenFood;

        if (leftoverFood >= 0) {

            System.out.printf("Food is enough! Leftovers: %d grams.%n", leftoverFood);

        } else {

            System.out.printf("Food is not enough. You need %d grams more.%n", Math.abs(leftoverFood));

        }

    }
}
//Закупеното количество храна за кученцето в килограми – цяло число в интервала [1 …100]
//• На всеки следващ ред до получаване на команда Adopted ще получавате колко грама изяжда
//кученцето на всяко хранене - цяло число в интервала [10 …1000]

