package com.company;

import java.util.Scanner;

public class AluminiumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantity = Integer.parseInt(scanner.nextLine());
        String windowType = scanner.nextLine();
        String deliveryOption = scanner.nextLine();

        if (quantity < 10) {
            System.out.println("Invalid order");
            return;
        }

        double pricePerWindow = 0;

        switch (windowType) {
            case "90X130":
                pricePerWindow = 110;
                break;
            case "100X150":
                pricePerWindow = 140;
                break;
            case "130X180":
                pricePerWindow = 190;
                break;
            case "200X300":
                pricePerWindow = 250;
                break;
        }

        double discount = 0;

        if (quantity > 30 && quantity <= 60) {
            discount = 0.05;
        } else if (quantity > 60 && quantity <= 80) {
            discount = (windowType.equals("100X150") || windowType.equals("130X180")) ? 0.08 : 0.1;
        } else if (quantity > 80) {
            discount = (windowType.equals("100X150") || windowType.equals("130X180")) ? 0.1 : 0.14;
        }

        double totalPrice = quantity * pricePerWindow * (1 - discount);

        if (deliveryOption.equals("With delivery")) {
            totalPrice += 60;
        }

        if (quantity > 99) {
            totalPrice *= 0.96;
        }

        System.out.printf("%.2f BGN", totalPrice);

        scanner.close();
    }
}


// zadachata ne pokazva 100 % uspeh ,




