package com.company;

import java.util.Scanner;

public class _06_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordTime = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeFor1Meter = Double.parseDouble(scanner.nextLine());

        double swimmingTime = distance * timeFor1Meter;
        double intervals = Math.floor(distance/15);
        swimmingTime = swimmingTime + (intervals * 12.5);


        if (swimmingTime < recordTime){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",swimmingTime);

        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",swimmingTime - recordTime);
        }

    }
}
