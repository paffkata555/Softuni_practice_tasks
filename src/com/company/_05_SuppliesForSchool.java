package com.company;

import java.util.Scanner;

public class _05_SuppliesForSchool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int packsOfPens = Integer.parseInt(scanner.nextLine());
        int packsOfMarkers = Integer.parseInt(scanner.nextLine());
        int detergentLiters = Integer.parseInt(scanner.nextLine());
        int discountPrice = Integer.parseInt(scanner.nextLine());

        double priceOfPens = packsOfPens * 5.80;
        double priceOfMarkers = packsOfMarkers * 7.20;
        double priceDetergent = detergentLiters * 1.20;

        double totalPrice = priceOfPens + priceOfMarkers + priceDetergent;
        double finalDiscountPrice = totalPrice - (totalPrice * discountPrice / 100);

        System.out.println(finalDiscountPrice);


    }
}
