package com.company;

import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double chineseYuan = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double priceFor1Bitcoin = 1168;
        double priceFor1Dollar = 1.76;
        double priceFor1Euro = 1.95;
        double priceFor1ChineseYuanInDollars = 0.15;

        double priceFor1ChineseYuanInLeva = priceFor1ChineseYuanInDollars * priceFor1Dollar * chineseYuan;


        double totalPriceInLeva = bitcoin * priceFor1Bitcoin + priceFor1ChineseYuanInLeva;
        double totalPriceInEuro = totalPriceInLeva / priceFor1Euro;
        double priceWithCommission = totalPriceInEuro * commission / 100;
        double finalPrice = Math.abs(totalPriceInEuro - priceWithCommission);

        System.out.printf("%.2f", finalPrice);


    }
}
//На първия ред – броят биткойни. Цяло число в интервала [0…20]
// На втория ред – броят китайски юана. Реално число в интервала [0.00… 50 000.00]
// На третия ред – комисионната. Реално число в интервала [0.00 ... 5.00]





