package com.company;

import java.util.Scanner;

public class _02_EqualSumEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStart = Integer.parseInt(scanner.nextLine());
        int numEnd = Integer.parseInt(scanner.nextLine());

//   for cycle to see interval between start number and end number .
//   declare current number ,which is in this interval

        for (int i = numStart; i <= numEnd ; i++) {
            int currentNum = i;

//            add sum even number and sum odd number

            int sumEvenNumber = 0;
            int sumOddNumber = 0;


//      make inner for cycle to check for every one digit  in 1 /0 /0 /0 /0 /0
//            take last digit as modular divide current number  to 10
//            and then divide current number to 10 to remove one digit from behind of -> 10000/ 0

            for (int j = 0; j < 6; j++) {
                int lastDigit = currentNum % 10;
                currentNum = currentNum / 10;


//                if else condition to check even or odd;
//                if is even we increase last digit +1
//                else  -> odd and increase last digit +1


                if (j % 2 == 0) {
                    sumEvenNumber += lastDigit;


                }else {
                    sumOddNumber += lastDigit;
                }

            }
            if (sumEvenNumber == sumOddNumber){

                System.out.print(i + " ");
            }

        }

    }
}

// ***  could be also ->  for (int j = 6; j >= 1; j--) {