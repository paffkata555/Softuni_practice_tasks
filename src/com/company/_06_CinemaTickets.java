package com.company;

import java.util.Scanner;

public class _06_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int studentCounter = 0;
        int standardCounter = 0;
        int kidsCounter = 0;
        int allTickets = 0;

        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            String movieName = command;
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int ticketCounter = 0;


            String ticketType = scanner.nextLine();
            while (!ticketType.equals("End")) {

                switch (ticketType) {
                    case "student":
                        studentCounter++;
                        break;
                    case "standard":
                        standardCounter++;
                        break;
                    case "kid":
                        kidsCounter++;
                        break;

                }

                ticketCounter++;
                allTickets++;

                if (ticketCounter >= freeSeats) {
                    break;

                }

                ticketType = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movieName, ((1.0 * ticketCounter) / freeSeats) * 100);
            command = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", allTickets);
        System.out.printf("%.2f%% student tickets.%n", ((1.0 * studentCounter) / allTickets) * 100);
        System.out.printf("%.2f%% standard tickets.%n", ((1.0 * standardCounter) / allTickets) * 100);
        System.out.printf("%.2f%% kids tickets.", ((1.0 * kidsCounter) / allTickets) * 100);
    }
}
