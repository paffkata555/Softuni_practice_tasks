package com.company;

import java.util.Scanner;

public class _08_LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String serialName = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int restTimeDuration = Integer.parseInt(scanner.nextLine());

        double lunchTime = restTimeDuration / 8.0;
        double relaxTime = restTimeDuration / 4.0;

        double watchingTime = restTimeDuration - lunchTime - relaxTime;


        double diff = Math.abs(watchingTime - episodeDuration);
        if (watchingTime >= episodeDuration) {
            System.out.printf("You have enough time to watch %s and" +
                    " left with %.0f minutes free time.", serialName, Math.ceil(diff));

        } else {
            System.out.printf("You don't have enough time to watch %s," +
                    " you need %.0f more minutes.", serialName, Math.ceil(diff));
        }

    }
}
