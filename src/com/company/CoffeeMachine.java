package com.company;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int drinkCount = Integer.parseInt(scanner.nextLine());


        double price = 0.0;


        switch (drink) {
            case "Espresso":

                switch (sugar) {
                    case "Without":
                        price = 0.90;

                        break;
                    case "Normal":
                        price = 1.0;

                        break;
                    case "Extra":
                        price = 1.20;

                        break;
                }
                break;

            case "Cappuccino":
                switch (sugar) {
                    case "Without":
                        price = 1.0;

                        break;
                    case "Normal":
                        price = 1.20;

                        break;
                    case "Extra":
                        price = 1.60;

                        break;
                }

                break;
            case "Tea":

                switch (sugar) {
                    case "Without":
                        price = 0.50;

                        break;
                    case "Normal":
                        price = 0.60;

                        break;
                    case "Extra":
                        price = 0.70;

                        break;
                }
                break;

        }

        if (sugar.equals("Without")) {

            price = price - (price * 0.35);

        }
        if (drink.equals("Espresso") && drinkCount >= 5) {

            price = price - (price * 0.25);

        }


        price = price * drinkCount;

        if (price > 15.00) {

            price = price - (price * 0.20);


        }


        System.out.printf("You bought %d cups of %s for %.2f lv.%n", drinkCount, drink, price);

    }
}

// Първи ред - напитка - текст с възможности"Espresso", "Cappuccino" или "Tea"
// Втори ред - захар - текст с възможности "Without", "Normal" или "Extra"
// Трети ред - брой напитки - цяло число в интервала [1… 50]

//    При избрана напитка без захар има 35% отстъпка.
//         При избрана напитка "Espresso" и закупени поне 5 броя, има 25% отстъпка.
//         При сума надвишава 15 лева, 20% отстъпка от крайната цена,