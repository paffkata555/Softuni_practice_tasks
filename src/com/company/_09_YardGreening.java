package com.company;

import java.util.Scanner;

public class _09_YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double squareMeterPrice = Double.parseDouble(scanner.nextLine());

        double yardGreening = squareMeterPrice * 7.61;
        double discount = yardGreening * 0.18;
        double finalPrice = (yardGreening - discount);

        System.out.printf("The finalPrice is: %f lv.", finalPrice);
        System.out.println();
        System.out.printf("The discount is: %f lv.", discount);

        // · "The final price is: {final price } lv."
        //
        //· "The discount is: {discount} lv."

    }
}
