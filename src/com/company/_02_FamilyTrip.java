package com.company;

import java.util.Scanner;

public class _02_FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int overnightCount = Integer.parseInt(scanner.nextLine());
        double overnightPrice = Double.parseDouble(scanner.nextLine());
        int percentAdditionalSpendMoney = Integer.parseInt(scanner.nextLine());


        if (overnightCount > 7) {

            overnightPrice = overnightPrice - (overnightPrice * 0.05);
        }


        double totalSpendMoney = overnightCount * overnightPrice + (percentAdditionalSpendMoney / 100.0) * budget;
        double remainMoney = budget - totalSpendMoney;

        if (remainMoney >= 0) {

            System.out.printf("Ivanovi will be left with %.2f leva after vacation.%n", remainMoney);

        } else {
            System.out.printf("%.2f leva needed.%n", Math.abs(remainMoney));
        }

    }
}