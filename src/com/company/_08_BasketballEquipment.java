package com.company;

import java.util.Scanner;

public class _08_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int annualFee = Integer.parseInt(scanner.nextLine());


        double shoesPrice = annualFee - (annualFee * 0.40);
        double equipmentPrice = shoesPrice - (shoesPrice * 0.20);
        double ballPrice = equipmentPrice * 0.25;
        double accessoriesPrice = ballPrice * 0.2;
        double totalPrice = annualFee + shoesPrice + equipmentPrice + ballPrice + accessoriesPrice;

        System.out.println(totalPrice);

    }
}
