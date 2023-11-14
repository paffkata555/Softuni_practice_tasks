package com.company;

import java.util.Scanner;

public class _05_Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
// turns change from euro -> cents ,multiply by 100
        change = change * 100;
//        defined counter
        int coinsCount = 0;
//     start while loop to roll until we still have change
        while (change > 0){
//            make nested checking if we can return the change and
//            in this case we withdraw the amount and keep to next check
            if (change >= 200){
                change -= 200;

            }else if (change >= 100){
                change -= 100;

            }else if (change >= 50){
                change -= 50;

            }else if (change >= 20){
                change -= 20;

            }else if (change >= 10){
                change -= 10;

            }else if (change >= 5){
                change -= 5;

            }else if (change >= 2){
                change -= 2;

            }else if (change >= 1){
                change -= 1;
//     when change finished break the cycle and print how many coins we turns
            }else{
                break;
            }
            coinsCount++;

        }
        System.out.println(coinsCount);

    }
}
