package com.company;

import java.util.Scanner;

public class _03_Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;


        for (int i = 1; i <= n; i++) {
            int numberCount = Integer.parseInt(scanner.nextLine());

            if (numberCount < 200) {
                p1++;

            } else if (numberCount >= 200 && numberCount <= 399) {
                p2++;

            } else if (numberCount >= 400 && numberCount <= 599) {
                p3++;

            } else if (numberCount >= 600 && numberCount <= 799) {
                p4++;

            } else if (numberCount >= 800) {
                p5++;
            }


        }

        System.out.printf("%.2f%%%n", ((1.0 * p1) / n) * 100);
        System.out.printf("%.2f%%%n", ((1.0 * p2) / n) * 100);
        System.out.printf("%.2f%%%n", ((1.0 * p3) / n) * 100);
        System.out.printf("%.2f%%%n", ((1.0 * p4) / n) * 100);
        System.out.printf("%.2f%%", ((1.0 * p5) / n) * 100);

    }
}

