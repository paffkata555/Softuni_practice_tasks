package com.company;

import java.util.Scanner;

public class _02_Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();

        String enterPassword = scanner.nextLine();

        while (!enterPassword.equals(password)){
            enterPassword = scanner.nextLine();



        }
//        System.out.println("Welcome " + username + "!");
        System.out.printf("Welcome %s!",username);


    }
}
