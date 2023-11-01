package com.company;

import java.util.Scanner;

public class _04_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years = Integer.parseInt(scanner.nextLine());
        double laundryPrice = Double.parseDouble(scanner.nextLine());
        int toysPrice = Integer.parseInt(scanner.nextLine());



        int toysCount = 0;
        int savedMoney = 0;
        int birthdayMoney = 10;

        for (int i = 1; i <= years; i++) {

            if (i % 2 == 0){
                savedMoney += birthdayMoney;
                birthdayMoney += 10;
                savedMoney -= 1;

            }else {
                toysCount++;

            }

        }
        int soldToysForMoney = toysCount * toysPrice;

        savedMoney += soldToysForMoney;


        double diff = Math.abs(savedMoney - laundryPrice);
        if (savedMoney >= laundryPrice){

            System.out.printf("Yes! %.2f",diff);

        }else {
            System.out.printf("No! %.2f",diff);
        }

    }
}
