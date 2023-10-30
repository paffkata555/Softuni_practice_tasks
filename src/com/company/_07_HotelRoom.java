package com.company;

import java.util.Scanner;

public class _07_HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String monthsType = scanner.nextLine();
        int overnightCount = Integer.parseInt(scanner.nextLine());


        double apartmentPrice = 0.0;
        double studioPrice = 0.0;

//        За студио, при повече от 7 нощувки през май и октомври : 5% намаление.
//
//· За студио, при повече от 14 нощувки през май и октомври : 30% намаление.
//
//· За студио, при повече от 14 нощувки през юни и септември: 20% намаление.
//
//· За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление.


        switch (monthsType) {
            case "May":
            case "October":
                studioPrice = 50.0;
                apartmentPrice = 65.0;
                if (overnightCount > 7 && overnightCount <= 14) {
                    studioPrice = studioPrice * 0.95;

                } else if (overnightCount > 14) {
                    studioPrice = studioPrice * 0.70;

                }
                break;

            case "June":
            case "September":
                studioPrice = 75.20;
                apartmentPrice = 68.70;

                if (overnightCount > 14) {
                    studioPrice = studioPrice * 0.80;

                }
                break;

            case "July":
            case "August":
                studioPrice = 76.0;
                apartmentPrice = 77.0;

                break;
        }
        if (overnightCount > 14) {
            apartmentPrice = apartmentPrice * 0.90;
        }

        double totalPriceApartment = overnightCount * apartmentPrice;
        double totalPriceStudio = overnightCount * studioPrice;

        System.out.printf("Apartment: %.2f lv.", totalPriceApartment);
        System.out.println();
        System.out.printf("Studio: %.2f lv.", totalPriceStudio);

    }
}
