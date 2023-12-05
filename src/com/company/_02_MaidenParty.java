package com.company;

import java.util.Scanner;

public class _02_MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//         input party price and articles count
        double partyPrice = Double.parseDouble(scanner.nextLine());
        int loveMessages = Integer.parseInt(scanner.nextLine());
        int waxRoses = Integer.parseInt(scanner.nextLine());
        int keyHolders = Integer.parseInt(scanner.nextLine());
        int caricatures = Integer.parseInt(scanner.nextLine());
        int surpriseLuck = Integer.parseInt(scanner.nextLine());

// articles price for each one
        double loveMessagePrice = 0.60;
        double waxRosePrice = 7.20;
        double keyHolderPrice = 3.60;
        double caricaturePrice = 18.20;
        double surpriseLuckPrice = 22.00;


        double totalPrice = (loveMessages * loveMessagePrice) +
                (waxRoses * waxRosePrice) + (keyHolders * keyHolderPrice) +
                (caricatures * caricaturePrice) + (surpriseLuck * surpriseLuckPrice);


        if (loveMessages + waxRoses + keyHolders + caricatures + surpriseLuck >= 25) {

            totalPrice *= 0.65;
        }
//        add hosting spending from whole price


        double hostingSpendMoney = totalPrice * 0.10;
        totalPrice -= hostingSpendMoney;

//        if money are enough
        if (totalPrice >= partyPrice) {
            System.out.printf("Yes! %.2f lv left.%n", Math.abs(partyPrice - totalPrice));

        } else {
            System.out.printf("Not enough money! %.2f lv needed.%n", Math.abs(totalPrice - partyPrice));

        }
    }
}
//Сума: 20 * 0.60 + 25 * 7.20 + 30 * 3.60 + 50 * 18.20 + 10 * 22 = 1430 лв.
//        Брой на артикулите: 20 + 25 + 30 + 50 + 10 = 135
//        Проверяваме дали има отстъпка: 135 > 25 => 35% отстъпка
//        Отстъпка: 35% от 1430 = 500.50 лв.
//        Крайна цена: 1430 – 500.50 = 929.50 лв.
//        Разход за хостинг: 10% от 929.50 лв. = 92.95 лв.
//        Печалба: 929.50 – 92.95 = 836.55 лв.
//        836.55 > 40.80 => 836.55 – 40.80 = 795.75 лв. остават


