package com.company;

import java.util.Scanner;

public class BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMatches = 0;
        int wins = 0;
        int losses = 0;

        String tournamentName = scanner.nextLine();

        while (!tournamentName.equals("End of tournaments")) {
            int tournamentMatches = Integer.parseInt(scanner.nextLine());

            for (int match = 1; match <= tournamentMatches; match++) {
                int desisTeamPoints = Integer.parseInt(scanner.nextLine());
                int opponentsPoints = Integer.parseInt(scanner.nextLine());

                totalMatches++;

                if (desisTeamPoints > opponentsPoints) {
                    wins++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", match, tournamentName, desisTeamPoints - opponentsPoints);
                } else {
                    losses++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", match, tournamentName, opponentsPoints - desisTeamPoints);
                }
            }

            tournamentName = scanner.nextLine();
        }

        double percentageWins = (double) wins / totalMatches * 100;
        double percentageLosses = (double) losses / totalMatches * 100;

        System.out.printf("%.2f%% matches win%n", percentageWins);
        System.out.printf("%.2f%% matches lost", percentageLosses);
    }
}




