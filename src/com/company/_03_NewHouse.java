package com.company;

import java.util.Scanner;

public class _03_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeFlowers = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());


        double finalPrice = 0.0;
        if ("Roses".equals(typeFlowers)) {
            finalPrice = flowerCount * 5.0;
            if (flowerCount > 80) {
                finalPrice = finalPrice - (finalPrice * 0.10);

            }


        } else if ("Dahlias".equals(typeFlowers)) {
            finalPrice = flowerCount * 3.80;

            if (flowerCount > 90) {
                finalPrice = finalPrice - (finalPrice * 0.15);
                //finalPrice * 0.85;
            }

        } else if ("Tulips".equals(typeFlowers)) {
            finalPrice = flowerCount * 2.80;

            if (flowerCount > 80) {
                finalPrice = finalPrice - (finalPrice * 0.15);
            }


        } else if ("Narcissus".equals(typeFlowers)) {
            finalPrice = flowerCount * 3.0;

            if (flowerCount < 120) {
                finalPrice = finalPrice + (finalPrice * 0.15);
                //finalPrice = finalPrice * 1.15;

            }


        } else if ("Gladiolus".equals(typeFlowers)) {
            finalPrice = flowerCount * 2.50;

            if (flowerCount < 80) {
                finalPrice = finalPrice + (finalPrice * 0.20);

            }


        }
        double diff = Math.abs(budget - finalPrice);
        if (budget >= finalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    flowerCount, typeFlowers, diff);

        } else {
            System.out.printf("Not enough money, you need %.2f leva more.",
                    diff);
        }
    }
//        · Вид цветя - текст с възможности - "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
}