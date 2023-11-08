package com.company;

public class _01_Clock {
    public static void main(String[] args) {

        for (int h = 0; h <= 23; h++) {

            for (int m = 0; m <= 59; m++) {
                System.out.printf("%d:%d%n",h,m);

            }

        }
    }
}

// 2 VARIANT ,more detail and specific digital clock

//        DIGITAL CLOCK

//        for (int hour = 0; hour <= 23; hour++) {
//            for loop hour will roll  with 1 when inner for loop minute reached 59
//
//                for (int minute = 0; minute <= 59; minute++) {
//
// *              apply condition when hour < 10 to show 0 in front of hour
//                if (hour < 10) {
//
// *                   insert condition also to set 0 in front of hour when < 10
// *                  or else  -> print the hour and minute with no change

//        if (minute < 10) {
//        System.out.printf("0%d:0%d%n", hour, minute);
//        } else {
//        System.out.printf("0%d:%d%n", hour, minute);
//
//        }
//   *         apply another condition and insert inner if- else condition to set 0 in front of minute when < 10
//   *      or else -> print with no change
//
//
//        } else {
//
//        if (minute < 10) {
//        System.out.printf("%d:0%d%n", hour, minute);
//
//        } else {
//        System.out.printf("%d:%d%n", hour, minute);
//
//        }


// 3 VARIANT
//   DIGITAL CLOCK   /hours/ minutes/ seconds
//
//
//        for (int h = 0; h <= 23; h++) {
//
//            for (int m = 0; m <= 59; m++) {
//
//                for (int s = 0; s <= 59; s++) {
//
//                    System.out.printf("%02d:%02d:%02d%n", h, m, s);
//
//                }
//
//            }
//
//        }
