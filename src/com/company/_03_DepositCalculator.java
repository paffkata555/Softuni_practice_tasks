package com.company;

import java.util.Scanner;

public class _03_DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountDeposited = Double.parseDouble(scanner.nextLine());
        int termOfDeposit = Integer.parseInt(scanner.nextLine());
        double annualInterestRate = Double.parseDouble(scanner.nextLine());

        double annualInterest = amountDeposited * (annualInterestRate / 100);
        double monthlyInterest = annualInterest / 12;
        double totalSum = amountDeposited + termOfDeposit * monthlyInterest;
        System.out.println(totalSum);


    }
}
