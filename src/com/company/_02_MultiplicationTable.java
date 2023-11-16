package com.company;

public class _02_MultiplicationTable {
    public static void main(String[] args) {


        for (int firstMultiplier = 1; firstMultiplier <= 10; firstMultiplier++) {
            for (int secondMultiplier = 1; secondMultiplier <= 10; secondMultiplier++) {

                System.out.println(firstMultiplier + " * " + secondMultiplier + " " + "= "
                        + (firstMultiplier * secondMultiplier));


            }

        }

    }
}

//    MULTIPLICATION TABLE VARIANT 2 :


//        for (int a = 1; a <= 10; a++) {
//            for (int b = 1; b <= 10; b++) {
//                int result = a * b;
//
//                System.out.printf("%d * %d = %d%n",a,b,result);
//
//            }
//
//        }