package com.company;

import java.util.Scanner;

public class _03_FootballSouvenirs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();
        String souvenirType = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (team) {
            case "Argentina":
                switch (souvenirType) {
                    case "flags":
                        price = 3.25;
                        break;
                    case "caps":
                        price = 7.20;
                        break;
                    case "posters":
                        price = 5.10;
                        break;
                    case "stickers":
                        price = 1.25;
                        break;
                    default:
                        System.out.println("Invalid stock!");
                        return;
                }
                break;
            case "Brazil":
                switch (souvenirType) {
                    case "flags":
                        price = 4.20;
                        break;
                    case "caps":
                        price = 8.50;
                        break;
                    case "posters":
                        price = 5.35;
                        break;
                    case "stickers":
                        price = 1.20;
                        break;
                    default:
                        System.out.println("Invalid stock!");
                        return;
                }
                break;
            case "Croatia":
                switch (souvenirType) {
                    case "flags":
                        price = 2.75;
                        break;
                    case "caps":
                        price = 6.90;
                        break;
                    case "posters":
                        price = 4.95;
                        break;
                    case "stickers":
                        price = 1.10;
                        break;
                    default:
                        System.out.println("Invalid stock!");
                        return;
                }
                break;
            case "Denmark":
                switch (souvenirType) {
                    case "flags":
                        price = 3.10;
                        break;
                    case "caps":
                        price = 6.50;
                        break;
                    case "posters":
                        price = 4.80;
                        break;
                    case "stickers":
                        price = 0.90;
                        break;
                    default:
                        System.out.println("Invalid stock!");
                        return;
                }
                break;
            default:
                System.out.println("Invalid country!");
                return;
        }

        double totalPrice = quantity * price;

        System.out.printf("Pepi bought %d %s of %s for %.2f lv.",
                quantity, souvenirType, team, totalPrice);
    }
}






