package com.company;

import java.util.Scanner;

public class _05_SuppliesForSchools {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int packsOfPens = Integer.parseInt(scanner.nextLine());
        int packsOfMarkers = Integer.parseInt(scanner.nextLine());
        int detergentLiters = Integer.parseInt(scanner.nextLine());
        int discountPrice = Integer.parseInt(scanner.nextLine());

//        find unit price of products

        double priceOfPens = packsOfPens * 5.80;

        double priceOfMarkers = packsOfMarkers * 7.20;

        double priceDetergent = detergentLiters * 1.20;

//          sum total price from all unit price
//          calculate discount price and print searching price with discount

        double totalPrice = priceOfPens + priceOfMarkers + priceDetergent;
        double finalDiscountPrice = totalPrice -(totalPrice * discountPrice / 100);

        System.out.println(finalDiscountPrice);


    }
}
