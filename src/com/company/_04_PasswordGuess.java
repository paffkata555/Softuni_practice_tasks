package com.company;

import java.util.Scanner;

public class _04_PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        String password1 = "s3cr3t!P@ssw0rd";

        if (password.equals(password1)) {
            System.out.println("Welcome");

        } else {
            System.out.println("Wrong password!");
        }


    }
}
