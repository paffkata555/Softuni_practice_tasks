package com.company;

import java.util.Scanner;

public class _03_SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int sumPrimeNumbers = 0;
        int sumNonPrimeNumbers = 0;


        String command = scanner.nextLine();
        while (!command.equals("stop")) {
            int num = Integer.parseInt(command);
            int dividerCount = 0;

            if (num < 0) {
                System.out.printf("Number is negative.%n");
                command = scanner.nextLine();
                continue;
            }

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    dividerCount++;

                }

            }
            if (dividerCount > 2) {
//     non prime number
                sumNonPrimeNumbers += num;

            } else {
//     prime number
                sumPrimeNumbers += num;
            }


            command = scanner.nextLine();
        }


        System.out.printf("Sum of all prime numbers is: %d%n" +
                "Sum of all non prime numbers is: %d", sumPrimeNumbers, sumNonPrimeNumbers);
    }
}

// do while cycle to read all numbers in console  until we set command stop
// turns all numbers in integer to work with
// we define variable divide counter
//check our current number is negative , read next command and CONTINUE next iteration ,skipping the code below
// -> in case is positive number we go into for cycle and tour all condition in details
// in if else statement we check now many dividers have number,increase + 1  by counter
// if else condition -> check if dividers are less than 2 or equal 2  ===> increase Non Prime sum with number
// else  -> number is Prime and add number to Prime sum
//at last print sum of all ,using templates

