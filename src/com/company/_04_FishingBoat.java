package com.company;

import java.util.Scanner;

public class _04_FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherCount = Integer.parseInt(scanner.nextLine());


        double rentalPrice = 0.0;
        switch (season) {
            case "Spring":
                rentalPrice = 3000.0;

                break;

            case "Summer":
            case "Autumn":
                rentalPrice = 4200.0;

                break;

            case "Winter":
                rentalPrice = 2600.0;

                break;
        }

        if (fisherCount <=6){
            rentalPrice = rentalPrice * 0.90;

        }else if (fisherCount > 7 && fisherCount <= 11){
            rentalPrice = rentalPrice * 0.85;

        }else if (fisherCount > 12){
            rentalPrice = rentalPrice * 0.75;

        }

        if (fisherCount %2 == 0 && !(season.equals("Autumn"))){
            rentalPrice = rentalPrice * 0.95;


        }
        double diff = Math.abs(budget - rentalPrice);
        if (budget >= rentalPrice){
            System.out.printf("Yes! You have %.2f leva left.",diff);

        }else {
            System.out.printf("Not enough money! You need %.2f leva.",diff);
        }


    }

}
