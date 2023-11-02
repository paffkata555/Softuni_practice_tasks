package com.company;

import java.util.Scanner;

public class _06_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.nextLine();
        double actorPoints = Double.parseDouble(scanner.nextLine());
        int juryCount = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= juryCount; i++) {

            String juryName = scanner.nextLine();
            double juryPoints = Double.parseDouble(scanner.nextLine());

            actorPoints += (juryName.length() * juryPoints) / 2;

//            actorPoints = actorPoints + (juryName.length() * juryPoints) / 2;

            if (actorPoints > 1250.5) {
                break;
            }

        }
        if (actorPoints > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, actorPoints);

        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - actorPoints);
        }
    }
}
