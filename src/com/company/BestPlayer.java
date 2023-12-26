package com.company;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bestPlayer = "";
        int maxGoals = Integer.MIN_VALUE;
        boolean hasHatTrick = false;

        while (true) {
            String playerName = scanner.nextLine();

            if (playerName.equals("END")) {
                break;
            }

            int goalsScored = Integer.parseInt(scanner.nextLine());

            if (goalsScored > maxGoals) {
                maxGoals = goalsScored;
                bestPlayer = playerName;
                hasHatTrick = goalsScored >= 3;
            }

            if (maxGoals >= 10) {
                break;
            }
        }

        System.out.printf("%s is the best player!%n", bestPlayer);
        System.out.printf("He has scored %d goals", maxGoals);

        if (hasHatTrick) {
            System.out.println(" and made a hat-trick !!!");
        } else {
            System.out.println(".");
        }

    }
}

