package com.company;

import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutesWalkingPerDay = Integer.parseInt(scanner.nextLine());
        int countWalkingPerDay = Integer.parseInt(scanner.nextLine());
        int caloriesPerDay = Integer.parseInt(scanner.nextLine());


        int totalBurnedCalories = minutesWalkingPerDay * countWalkingPerDay * 5;

        if (totalBurnedCalories >= caloriesPerDay * 0.5) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.%n", totalBurnedCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.%n", totalBurnedCalories);
        }
    }
}




//На първия ред - минути разходка на ден - цяло число в интервала [1...50]
// На втория ред - броят на разходките дневно - цяло число в интервала [1…10]
// На третия ред - приетите от котката калории на ден – цяло число в интервала [100…4000]



