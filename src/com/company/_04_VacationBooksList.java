package com.company;

import java.util.Scanner;

public class _04_VacationBooksList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfPage = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int countOfDays = Integer.parseInt(scanner.nextLine());

        int allReadingHours = countOfPage / pagesPerHour;
        int hoursInDay  = allReadingHours / countOfDays;

        System.out.println(hoursInDay);

    }
}
