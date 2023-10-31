package com.company;

import java.util.Scanner;

public class _08_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivingHour = Integer.parseInt(scanner.nextLine());
        int arrivingMinute = Integer.parseInt(scanner.nextLine());

        int timeExam = (examHour * 60) + examMinute;
        int timeArriving = (arrivingHour * 60) + arrivingMinute;

        int diff = Math.abs(timeArriving - timeExam);

//        check student late,early or arriving on time
        if (timeArriving > timeExam) {
            System.out.println("Late");


//            check minutes < 10 insert 0 -> 09 min ,05 min ect.
            if (diff >= 60) {

//            convert hour/ minutes
                int hour = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours after the start", hour, minutes);

            } else {
                System.out.printf("%d minutes after the start", diff);

            }


        } else if (timeArriving == timeExam || diff <= 30) {
            System.out.println("On time");

            if (diff >= 1 && diff <= 30) {
                System.out.printf("%d minutes before the start", diff);

            }

        } else {
            System.out.println("Early");

            if (diff >= 60) {

                int hour = diff / 60;
                int minutes = diff % 60;

// %02d -> check if minutes are < 10, then insert 0 infront, if not - don't do anything
                System.out.printf("%d:%02d hours before the start", hour, minutes);


            } else {
                System.out.printf("%d minutes before the start", diff);


            }


        }

    }

}
