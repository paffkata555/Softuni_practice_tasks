package com.company;

import java.util.Scanner;

public class _07_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalGroup = Integer.parseInt(scanner.nextLine());


        int musalaClimb = 0;
        int monblanClimb = 0;
        int kilimanjaroClimb = 0;
        int k2Climb = 0;
        int everestClimb = 0;

        for (int i = 1; i <= totalGroup; i++) {

            int groupSize = Integer.parseInt(scanner.nextLine());

            if (groupSize <= 5) {
                musalaClimb += groupSize;

            } else if (groupSize <= 12) {
                monblanClimb += groupSize;


            } else if (groupSize <= 25) {
                kilimanjaroClimb += groupSize;


            } else if (groupSize <= 40) {
                k2Climb += groupSize;


            } else {
                everestClimb += groupSize;


            }

        }

        double totalClimb = (musalaClimb + monblanClimb + kilimanjaroClimb + k2Climb + everestClimb);

        System.out.printf("%.2f%%%n", ((1.0 * musalaClimb) / totalClimb) * 100);
        System.out.printf("%.2f%%%n", ((1.0 * monblanClimb) / totalClimb) * 100);
        System.out.printf("%.2f%%%n", ((1.0 * kilimanjaroClimb) / totalClimb) * 100);
        System.out.printf("%.2f%%%n", ((1.0 * k2Climb) / totalClimb) * 100);
        System.out.printf("%.2f%%%n", ((1.0 * everestClimb) / totalClimb) * 100);

    }
}
