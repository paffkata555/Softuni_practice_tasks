package com.company;

import java.util.Scanner;

public class _04_Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int number = 1;

        while (number <= n ){
            System.out.println(number);
            number = (number * 2) + 1;

        }
    }
}
//Напишете програма, която чете число n, въведено от потребителя,
// и отпечатва всички числа ≤ n от редицата: 1, 3, 7, 15, 31, ….
// Всяко следващо число се изчислява като умножим предишното с 2 и добавим 1.
