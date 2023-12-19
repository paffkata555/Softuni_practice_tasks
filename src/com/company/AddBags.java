package com.company;

import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double luggagePriceAbove20Kg = Double.parseDouble(scanner.nextLine());
        double luggageWeightInKg = Double.parseDouble(scanner.nextLine());
        int daysToTravel = Integer.parseInt(scanner.nextLine());
        int luggageCount = Integer.parseInt(scanner.nextLine());

        double luggageFee = 0.0;

        if (luggageWeightInKg > 20) {
            luggageFee = luggagePriceAbove20Kg;

        } else if (luggageWeightInKg < 10) {
            luggageFee = luggagePriceAbove20Kg * 0.20;

        } else {
            luggageFee = luggagePriceAbove20Kg * 0.50;

        }

        if (daysToTravel > 30) {
//            luggageFee = luggageFee + (luggageFee * 0.10);  or we can make it short :
            luggageFee *= 1.10;

        } else if (daysToTravel < 7) {
            luggageFee = luggageFee + (luggageFee * 0.40);

        } else {
            luggageFee = luggageFee + (luggageFee * 0.15);

        }


        double totalPrice = luggageCount * luggageFee;

        System.out.printf(" The total price of bags is: %.2f lv.%n", totalPrice);
    }
}
//Цената на багаж над 20кг - реално число в диапазона [10.0…80.0]
//2. Килограми на багажа – реално число в диапазона [1.0…32.0]
//3. Дни до пътуването – цяло число в диапазона [1…60]
//4. Брой багажи – цяло число в диапазона [1…10]


