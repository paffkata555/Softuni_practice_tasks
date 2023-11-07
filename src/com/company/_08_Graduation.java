package com.company;

import java.util.Scanner;

public class _08_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();

        int counter = 1;
        double sum = 0;
        int excluded = 0;
        boolean isGraduated = true;

        while (counter <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4.00) {
                excluded++;
                if (excluded == 2) {
                    isGraduated = false;
                    System.out.printf("%s has been excluded at %d grade", studentName, counter);
                    break;
                }
                continue;


            }
            sum += grade;
            counter++;

        }
        if (isGraduated) {
            System.out.printf("%s graduated. Average grade: %.2f", studentName, sum / 12);

        }

    }
}
