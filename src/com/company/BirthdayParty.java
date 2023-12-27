package com.company;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rentOfTheHall = Double.parseDouble(scanner.nextLine());

        double cakePrice = rentOfTheHall * 0.20;
        double drinkPrice = cakePrice - (cakePrice * 0.45);
        double animatorPrice = rentOfTheHall / 3;

        double budget = rentOfTheHall + cakePrice + drinkPrice + animatorPrice;

        System.out.println(budget);


    }
}
//Торта – цената ѝ е 20% от наема на залата
//• Напитки – цената им е 45% по-малко от тази на тортата
//• Аниматор – цената му е 1/3 от цената за наема на залат


