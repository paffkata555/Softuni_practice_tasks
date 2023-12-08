package com.company;

import java.util.Scanner;

public class _05_Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Atanas starting from camp
        int baseCamp = 5364;
        int peak = 8848;
        int climbMeters = 0;
        int daysClimbing = 0;

        String command = "";
        while (!command.equals("END")) {
            command = scanner.nextLine();

            if (command.equals("END")) {
                break;
            }

            String willRest = command;
            climbMeters = Integer.parseInt(scanner.nextLine());

            if (willRest.equals("Yes")) {
                daysClimbing++;

            } else if (willRest.equals("No")) {
                daysClimbing -= 1;
                daysClimbing++;


                climbMeters += baseCamp;
            }


            if (climbMeters >= 8848) {
                System.out.println("Goal reached for " + daysClimbing + " days!");
                break;
            }
            if (daysClimbing > 5) {
                System.out.println("Failed!");
                System.out.println(climbMeters);
                break;
            }
            command = scanner.nextLine();

            if (command.equals("END")) {
                System.out.println("Failed!");
                System.out.println(climbMeters);
                break;

            }

        }


    }
}


//// Output the result
//        if (climbedMeters >= peak) {
//            System.out.println("Congratulations! Atanas reached the top of Everest in " + daysClimbing + " days.");
//        } else if (daysClimbing > 5) {
//            System.out.println("Atanas couldn't reach the top in 5 days. He reached " + climbedMeters + " meters.");
//        } else {
//            System.out.println("Atanas couldn't reach the top. He reached " + climbedMeters + " meters.");
//        }

//Дали преди изкачването Атанас нощува: Yes -> започва ден 2-ри
//Изкачени метри през ден 2-ри: 5 364 + 1 254 = 6 618 м
//Дали преди изкачването Атанас нощува: Yes -> започва ден 3-ти
//Изкачени метри през ден 3-ти: 6 618 + 1 402 = 8 020 м
//Дали преди изкачването Атанас нощува: No -> продължава ден 3-ти
//Изкачени метри през ден 3-ти: 8 020 + 250 = 8 270 м
//Дали преди изкачването Атанас нощува: Yes -> започва ден 4-ти
//Изкачени метри през ден 4-ти: 8 270 + 635 = 8 905 м
//Изкачените метри 8 905 м са повече от 8 848м, следователно Атанас
//е изкачил Еверест за 4 дни и програмата приключва


