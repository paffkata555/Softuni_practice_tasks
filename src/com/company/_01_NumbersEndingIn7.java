package com.company;


public class _01_NumbersEndingIn7 {
    public static void main(String[] args) {

        for (int i = 7; i <= 997; i += 10) {

            if (i % 10 == 7) {
                System.out.println(i);

            }
        }
    }
}