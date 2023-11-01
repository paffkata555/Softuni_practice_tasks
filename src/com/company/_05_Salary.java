package com.company;

import java.util.Scanner;

public class _05_Salary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tabCount = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());


        int totalFine = 0;

        for (int n = 1; n <= tabCount; n++) {
            String webSite = scanner.nextLine();


            if (webSite.equals("Facebook")) {
                totalFine += 150;


            } else if (webSite.equals("Instagram")) {
                totalFine += 100;


            } else if (webSite.equals("Reddit")) {
                totalFine += 50;

            }

        }

        if (totalFine >= salary) {
            System.out.println("You have lost your salary.");

        } else {

            int diff = salary - totalFine;
            System.out.printf("%d", diff);
        }

    }
}
