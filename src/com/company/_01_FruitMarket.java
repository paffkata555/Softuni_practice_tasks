package com.company;

import java.util.Scanner;

public class _01_FruitMarket {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananasQuantity = Double.parseDouble(scanner.nextLine());
        double orangeQuantity = Double.parseDouble(scanner.nextLine());
        double raspberryQuantity = Double.parseDouble(scanner.nextLine());
        double strawberryQuantity = Double.parseDouble(scanner.nextLine());


        double raspberryPrice = strawberryPrice / 2.0;
        double orangePrice = raspberryPrice - (raspberryPrice * 0.4);
        double bananaPrice = raspberryPrice - (raspberryPrice * 0.8);

        double totalPrice = ((strawberryPrice * strawberryQuantity) + (bananaPrice * bananasQuantity)
                + (orangePrice * orangeQuantity) + (raspberryPrice * raspberryQuantity));

        System.out.printf("%.2f", totalPrice);
    }
}


