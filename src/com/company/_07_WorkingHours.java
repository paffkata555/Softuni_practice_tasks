package com.company;

import java.util.Scanner;

public class _07_WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();


        if (hour < 10 || hour > 18 || dayOfWeek.equals("Sunday")) {
            System.out.println("closed");

        } else {
            System.out.println("open");

        }

    }
}
