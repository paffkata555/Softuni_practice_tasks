package com.company;

import java.util.Scanner;

public class _04_Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsCount = Integer.parseInt(scanner.nextLine());

        int topStudents = 0;
        int between4And5 = 0;
        int between3And4 = 0;
        int failStudents = 0;
        double totalGrades = 0;

        for (int i = 0; i < studentsCount; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            totalGrades += grade;

            if (grade >= 5.00) {
                topStudents++;

            } else if (grade >= 4.00) {
                between4And5++;

            } else if (grade >= 3.00) {
                between3And4++;

            } else {
                failStudents++;
            }
        }
        double topStudentPercent = 1.0 * topStudents / studentsCount * 100;
        double between4And5Percent = 1.0 * between4And5 / studentsCount * 100;
        double between3And4Percent = 1.0 * between3And4 / studentsCount * 100;
        double failStudentsPercent = 1.0 * failStudents / studentsCount * 100;

        double averageGrade = totalGrades / studentsCount;


        System.out.printf("Top students: %.2f%%%n", topStudentPercent);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", between4And5Percent);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", between3And4Percent);
        System.out.printf("Fail: %.2f%%%n", failStudentsPercent);
        System.out.printf("Average: %.2f%n", averageGrade);
    }
}



