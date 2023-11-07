package com.company;

import java.util.Scanner;

public class _07_MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();

        int min = Integer.MAX_VALUE;

        while (!command.equals("Stop")) {

            int number = Integer.parseInt(command);

            if (number < min) {
                min = number;

            }
            command = scanner.nextLine();

        }
        System.out.println(min);


    }
}
