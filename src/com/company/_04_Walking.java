package com.company;

import java.util.Scanner;

public class _04_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int dailyGoal = 10000;

        String command = scanner.nextLine();
        while (!command.equals("Going home")) {

            int steps = Integer.parseInt(command);


            dailyGoal = dailyGoal - steps;

            if (dailyGoal <= 0) {
                break;

            }
            command = scanner.nextLine();

        }
        if (command.equals("Going home")) {
            int stepsToHome = Integer.parseInt(scanner.nextLine());

            dailyGoal -= stepsToHome;
        }

        if (dailyGoal <= 0) {

            System.out.printf("Goal reached! Good job!%n" + "%d steps over the goal!", Math.abs(dailyGoal));


        } else {

            System.out.printf("%d more steps to reach goal.", Math.abs(dailyGoal));


        }

    }
}
