package com.company;

import java.util.Scanner;

public class _04_TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juryCount = Integer.parseInt(scanner.nextLine());

        int allGradesCount = 0;
        double allGradesSum = 0;

        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            String namePresentation = command;
            double sumGrades = 0.0;


            for (int i = 1; i <= juryCount; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                sumGrades += grade;

                allGradesCount++;
                allGradesSum += grade;

            }

            System.out.printf("%s - %.2f.%n", namePresentation, sumGrades / juryCount);
            command = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", allGradesSum / allGradesCount);

    }
}
