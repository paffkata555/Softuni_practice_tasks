package com.company;

import java.util.Scanner;

public class _06_VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vowelText = scanner.nextLine();

        int sumOfVowels = 0;
        for (int i = 0; i < vowelText.length(); i++) {

            char currentSymbol = vowelText.charAt(i);

            if (currentSymbol == 'a') {
                sumOfVowels = sumOfVowels + 1;

            } else if (currentSymbol == 'e') {
                sumOfVowels = sumOfVowels + 2;

            } else if (currentSymbol == 'i') {
                sumOfVowels = sumOfVowels + 3;

            } else if (currentSymbol == 'o') {
                sumOfVowels = sumOfVowels + 4;

            } else if (currentSymbol == 'u') {
                sumOfVowels = sumOfVowels + 5;
            }

        }
        System.out.println(sumOfVowels);
    }
}
