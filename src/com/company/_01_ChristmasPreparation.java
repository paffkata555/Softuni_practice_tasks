package com.company;

import java.util.Scanner;

public class _01_ChristmasPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        materials price for roll

        double paperPriceForRoll = 5.80;
        double fabricPriceForRoll = 7.20;
        double gluePriceForLiter = 1.20;

//        quantity
        int paperRolls = Integer.parseInt(scanner.nextLine());
        int fabricRolls = Integer.parseInt(scanner.nextLine());
        double glueLiters = Double.parseDouble(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

//        calculate sum NO DISCOUNT

        double totalSumNoDiscount = (paperRolls * paperPriceForRoll) +
                (fabricRolls * fabricPriceForRoll) +
                (glueLiters * gluePriceForLiter);

//        calculate discount
        double discount = (totalSumNoDiscount * percentDiscount) / 100;

        double finalSumWithDiscount = totalSumNoDiscount - discount;


        System.out.printf("%.3f", finalSumWithDiscount);

    }
}



