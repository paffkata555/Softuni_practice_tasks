package com.company;

import java.util.Scanner;

public class _12_TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double salesVolume = Double.parseDouble(scanner.nextLine());


        double commission = 0.00;
        boolean isValid = true;
        switch (city) {
            case "Sofia":
                if (salesVolume >= 0 && salesVolume <= 500) {
                    commission = 0.05;

                } else if (salesVolume > 500 && salesVolume <= 1000) {
                    commission = 0.07;

                } else if (salesVolume > 1000 && salesVolume <= 10000) {
                    commission = 0.08;

                } else if (salesVolume > 10000) {
                    commission = 0.12;
                } else {
                    isValid = false;
                }
                break;


            case "Varna":
                if (salesVolume >= 0 && salesVolume <= 500) {
                    commission = 0.045;

                } else if (salesVolume > 500 && salesVolume <= 1000) {
                    commission = 0.075;

                } else if (salesVolume > 1000 && salesVolume <= 10000) {
                    commission = 0.10;

                } else if (salesVolume > 10000) {
                    commission = 0.13;

                } else {
                    isValid = false;
                }
                break;


            case "Plovdiv":
                if (salesVolume >= 0 && salesVolume <= 500) {
                    commission = 0.055;

                } else if (salesVolume > 500 && salesVolume <= 1000) {
                    commission = 0.08;

                } else if (salesVolume > 1000 && salesVolume <= 10000) {
                    commission = 0.12;

                } else if (salesVolume > 10000) {
                    commission = 0.145;

                } else {
                    isValid = false;
                }
                break;
            default:
                isValid = false;
                break;
        }
        if (isValid) {

            double result = commission * salesVolume;
            System.out.printf("%.2f", result);


        } else {
            System.out.println("error");

        }

    }
}
