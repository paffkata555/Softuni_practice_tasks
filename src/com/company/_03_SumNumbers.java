package com.company;

import java.util.Scanner;

public class _03_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        while (number > sum){
            int enterNumber = Integer.parseInt(scanner.nextLine());
            sum += enterNumber;


        }
        System.out.println(sum);
    }
}
