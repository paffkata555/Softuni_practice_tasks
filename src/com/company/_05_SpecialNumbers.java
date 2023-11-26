package com.company;

import java.util.Scanner;

public class _05_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {

                        if (number % i == 0 && number % j == 0 && number % k == 0 && number % l == 0) {

                            System.out.print("" + i + j + k + l + " ");


                        }

                    }

                }

            }

        }


    }

}


// VARIANT 2 SAME TASK

//    int number = Integer.parseInt(scanner.nextLine());
//
// *       input number in console
//  *      create for cycle to roll all numbers in interval 1111 - 9999
//    *    in for cycle create boolean and set true if the number we are looking is  a special
//
//
//        for (int i = 1111; i <= 9999 ; i++) {
//                boolean isNumberSpecial = true;
//
// *          create current number and set to be same as a number in for cycle
//   *         do while cycle until current number is more than 0
//     *       digit will be modular divide by 10 to find reminder
//       *        set current number to be  divided by 10 to cut the last part of digit
//
//
//                int currentNumber = i;
//                while (currentNumber > 0){
//                int digit =  currentNumber % 10;
//                currentNumber = currentNumber / 10;
//
// ***               make if statement to say that we look when  digit is equal 0 or modular divide number by digit is not 0
// ***               and  we change flag - boolean to false,break and get out from cycle
//
//                if (digit == 0 ||  number % digit != 0){
//                isNumberSpecial = false;
//                break;
//
//                }
//
//                }
// ***         in case we have special number -> we print it in console
//
//                if (isNumberSpecial) {
//
//                System.out.print(i + " ");
//                }
//
//
//                }
