package com.company;

import java.util.Scanner;

public class _07_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardsCount = Integer.parseInt(scanner.nextLine());
        int processorCount = Integer.parseInt(scanner.nextLine());
        int ramMemoryCount = Integer.parseInt(scanner.nextLine());

// · Видеокарта – 250 лв./бр.
//
//· Процесор – 35% от цената на закупените видеокарти/бр.
//
//· Рам памет – 10% от цената на закупените видеокарти/бр.

        double videoCardPrice = 250.0 * videoCardsCount;
        double processorPrice = (videoCardPrice * 0.35) * processorCount;
        double ramMemoryPrice = (videoCardPrice * 0.10) * ramMemoryCount;

        double totalPrice = videoCardPrice + processorPrice + ramMemoryPrice;

        if (videoCardsCount > processorCount){
            totalPrice = totalPrice - (totalPrice * 0.15);

        }
        double diff = Math.abs(budget - totalPrice);

        if (budget >= totalPrice){
            System.out.printf("You have %.2f leva left!", diff);

        }else {
            System.out.printf("Not enough money! You need %.2f leva more!",diff);
        }

    }
}
