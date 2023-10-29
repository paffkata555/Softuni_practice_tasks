package com.company;

import java.util.Scanner;

public class _06_Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int protectiveNylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinnerPaint = Integer.parseInt(scanner.nextLine());
        int workingHours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (protectiveNylon + 2) * 1.50;
        double paintPrice = (paint + (paint * 0.10)) * 14.50;
        double thinnerPrice = thinnerPaint * 5.00;
        double bags = 0.40;

        double totalPrice = nylonPrice + paintPrice + thinnerPrice + bags;
        double hoursPrice = totalPrice * 0.30;

        double workersFinalPrice = hoursPrice * workingHours;
        double finalPrice = (totalPrice + workersFinalPrice);

        System.out.println(finalPrice);
    }
}
