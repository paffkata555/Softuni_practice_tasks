package com.company;

import java.util.Scanner;

public class _09_SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysToStay = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String grade = scanner.nextLine();


        int overnight = daysToStay - 1;
        double finalPrice = 0.0;


        if (typeRoom.equals("room for one person")) {
            finalPrice = 18.0 * overnight;


        } else if (typeRoom.equals("apartment")) {
            finalPrice = 25.0 * overnight;

            if (daysToStay < 10) {
                finalPrice = finalPrice * 0.70;

            } else if (daysToStay >= 10 && daysToStay <= 15) {
                finalPrice = finalPrice * 0.65;

            } else if (daysToStay > 15) {
                finalPrice = finalPrice * 0.50;

            }

        } else if (typeRoom.equals("president apartment")) {
            finalPrice = 35.0 * overnight;


            if (daysToStay < 10) {
                finalPrice = finalPrice * 0.90;

            } else if (daysToStay >= 10 && daysToStay <= 15) {
                finalPrice = finalPrice * 0.85;

            } else if (daysToStay > 15) {
                finalPrice = finalPrice * 0.80;

            }

        }

        switch (grade) {
            case "positive":
                finalPrice = finalPrice * 1.25;
                break;
//            add 25 % to price after discount

            case "negative":
                finalPrice = finalPrice * 0.90;
                break;
//            take 0.10 % from price after discount
        }

        System.out.printf("%.2f", finalPrice);
    }
}







