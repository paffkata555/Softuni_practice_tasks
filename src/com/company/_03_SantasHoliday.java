package com.company;

import java.util.Scanner;

public class _03_SantasHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String feedback = scanner.nextLine();

        int overnight = days - 1;
        double roomPrice = 18.00;
        double apartmentPrice = 25.00;
        double presidentApartmentPrice = 35.00;

        double totalPrice = 0;

        if (roomType.equals("room for one person")) {
            totalPrice = overnight * roomPrice;
        } else if (roomType.equals("apartment")) {
            totalPrice = overnight * apartmentPrice;

            if (overnight < 10) {

                totalPrice *= 0.70; // 30% discount

            } else if (overnight <= 15) {

                totalPrice *= 0.65; // 35% discount

            } else {
                totalPrice *= 0.50; // 50% discount
            }


        } else if (roomType.equals("president apartment")) {
            totalPrice = overnight * presidentApartmentPrice;


            if (overnight < 10) {
                totalPrice *= 0.90; // 10% discount

            } else if (overnight <= 15) {
                totalPrice *= 0.85; // 15% discount

            } else {
                totalPrice *= 0.80; // 20% discount
            }
        }

        if (feedback.equals("positive")) {

            totalPrice *= 1.25; // 25% add

        } else if (feedback.equals("negative")) {
            totalPrice *= 0.90; // 10% remove

        }

        System.out.printf("%.2f", totalPrice);
    }
}



