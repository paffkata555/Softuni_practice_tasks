package com.company;

import java.util.Scanner;

public class _05_EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int playerOneEggs = Integer.parseInt(scanner.nextLine());
        int playerTwoEggs = Integer.parseInt(scanner.nextLine());

        while (true) {
            String winner = scanner.nextLine();

            if (winner.equals("one")) {
                playerTwoEggs--;
            } else if (winner.equals("two")) {
                playerOneEggs--;
            } else if (winner.equals("End")) {
                break;
            }

            if (playerOneEggs == 0) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.%n", playerTwoEggs);
                return;
            } else if (playerTwoEggs == 0) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.%n", playerOneEggs);
                return;
            }
        }

        System.out.printf("Player one has %d eggs left.%n", playerOneEggs);
        System.out.printf("Player two has %d eggs left.%n", playerTwoEggs);
    }
}



