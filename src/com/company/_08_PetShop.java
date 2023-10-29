package com.company;

import java.util.Scanner;

public class _08_PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberOfDogFood = scanner.nextDouble();
        double numberOfCatFood = scanner.nextDouble();

        double finalPrice = (numberOfDogFood * 2.50 + numberOfCatFood * 4.0);

        //  "{final price} lv."

        System.out.printf("%f lv.",finalPrice);


    }
}
