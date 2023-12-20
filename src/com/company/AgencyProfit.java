package com.company;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String airlineName = scanner.nextLine();
        int adultTicketsCount = Integer.parseInt(scanner.nextLine());
        int childTicketsCount = Integer.parseInt(scanner.nextLine());
        double adultTicketPrice = Double.parseDouble(scanner.nextLine());
        double serviceFee = Double.parseDouble(scanner.nextLine());

        double totalAdultPrice = adultTicketsCount * adultTicketPrice;
        double totalChildPrice = childTicketsCount * (adultTicketPrice - (adultTicketPrice * 0.7));

        double totalTicketPrice = totalAdultPrice + totalChildPrice + (serviceFee * (adultTicketsCount + childTicketsCount));
        double agencyProfit = 0.2 * totalTicketPrice;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", airlineName, agencyProfit);
    }
}





