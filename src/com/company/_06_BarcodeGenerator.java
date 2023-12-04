package com.company;

import java.util.Scanner;

public class _06_BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        2345
        int start = Integer.parseInt(scanner.nextLine());

//        6789
        int end = Integer.parseInt(scanner.nextLine());


//*** Convert to String
//        String startString = String.valueOf(start);
//*** Take first element from String
//        String startFirstNumber = startString.substring(0,1);
////        convert  String to int
//        int firstStart = Integer.parseInt(startFirstNumber);

        int firstStart = Integer.parseInt(Integer.toString(start).substring(0, 1));
        int secondStart = Integer.parseInt(Integer.toString(start).substring(1, 2));
        int thirdStart = Integer.parseInt(Integer.toString(start).substring(2, 3));
        int fourthStart = Integer.parseInt(Integer.toString(start).substring(3, 4));


//        String endString = String.valueOf(end);
//        String endFirstNumber = endString.substring(0,1);
//        int firstEnd = Integer.parseInt(endFirstNumber);

        int firstEnd = Integer.parseInt(Integer.toString(end).substring(0, 1));
        int secondEnd = Integer.parseInt(Integer.toString(end).substring(1, 2));
        int thirdEnd = Integer.parseInt(Integer.toString(end).substring(2, 3));
        int fourthEnd = Integer.parseInt(Integer.toString(end).substring(3, 4));

        for (int i = firstStart; i <= firstEnd; i++) {
            for (int j = secondStart; j <= secondEnd; j++) {
                for (int k = thirdStart; k <= thirdEnd; k++) {
                    for (int l = fourthStart; l <= fourthEnd; l++) {

                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {

                            System.out.print(i);
                            System.out.print(j);
                            System.out.print(k);
                            System.out.print(l);
                            System.out.print(" ");
                        }

                    }

                }

            }

        }

    }
}


// VARIANT 2

//
//        int startRange = Integer.parseInt(scanner.nextLine());
//        int endRange = Integer.parseInt(scanner.nextLine());

//        for (int i = startRange; i <= endRange; i++) {
//            if (hasNoEvenDigits(i)) {
//                System.out.print(i + " ");
//            }
//        }
//    }
//
//    private static boolean hasNoEvenDigits(int number) {
//        while (number > 0) {
//            int digit = number % 10;
//            if (digit % 2 == 0) {
//                return false;
//            }
//            number /= 10;
//        }
//        return true;

