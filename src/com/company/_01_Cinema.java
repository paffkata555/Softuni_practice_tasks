package com.company;

import java.util.Scanner;

public class _01_Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String typeShow = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());


        int allSeats = rows * columns;

        double income = 0.0;
        switch (typeShow) {
            case "Premiere":
                income = allSeats * 12.00;

                break;

            case "Normal":
                income = allSeats * 7.50;
                break;

            case "Discount":
                income = allSeats * 5.00;
                break;
        }
        System.out.printf("%.2f", income);

//        · Premiere – премиерна прожекция, на цена 12.00 лева.
//
//· Normal – стандартна прожекция, на цена 7.50 лева.
//
//· Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева

    }


}
