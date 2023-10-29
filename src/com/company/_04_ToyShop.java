package com.company;

import java.util.Scanner;

public class _04_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int teddyBearCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());

//all price (full sum) = priceTypeProduct  * countProduct
        double totalPrice = (puzzleCount * 2.60) + (dollsCount * 3.0)
                + (teddyBearCount * 4.10) + (minionsCount * 8.20)
                + (trucksCount * 2.0);

        // all toys sum,which are selling
        int toysCount = puzzleCount + dollsCount + teddyBearCount + minionsCount + trucksCount;


        if (toysCount >= 50) {
            //  the new totalPrice is old totalPrice - 25%
            // or direct take 75% of totalPrice  =>>> totalPrice * 0.75;
            totalPrice = totalPrice - (totalPrice * 0.25);


        }
//        we take 10% from totalPrice for rent
        totalPrice = totalPrice * 0.90;

        double diff = Math.abs(totalPrice - excursionPrice);
        if (totalPrice >= excursionPrice) {
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }


    }
}
