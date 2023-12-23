package com.company;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfBalls = Integer.parseInt(scanner.nextLine());

        int totalPoints = 0;
        int redBalls = 0;
        int orangeBalls = 0;
        int yellowBalls = 0;
        int whiteBalls = 0;
        int otherColors = 0;
        int blackDivides = 0;
        for (int i = 0; i < numberOfBalls; i++) {
            String colorOfBall = scanner.nextLine();


            switch (colorOfBall) {
                case "red":
                    totalPoints += 5;
                    redBalls++;

                    break;
                case "orange":
                    totalPoints += 10;
                    orangeBalls++;

                    break;
                case "yellow":
                    totalPoints += 15;
                    yellowBalls++;

                    break;
                case "white":
                    totalPoints += 20;
                    whiteBalls++;

                    break;
                case "black":
                    totalPoints /= 2;
                    blackDivides++;

                    break;
                default:
                    otherColors++;

                    break;
            }


        }

        System.out.println("Total points: " + totalPoints);
        System.out.println("Red balls: " + redBalls);
        System.out.println("Orange balls: " + orangeBalls);
        System.out.println("Yellow balls: " + yellowBalls);
        System.out.println("White balls: " + whiteBalls);
        System.out.println("Other colors picked: " + otherColors);
        System.out.println("Divides from black balls: " + blackDivides);

    }

}

// "Total points: {всичките събрани точки}"
//"Red balls: {броят червени топки}"
//"Orange balls: {броят оранжеви топки}"
//"Yellow balls: {броят жълти топки}"
//"White balls: {броят бели топки}"
//"Other colors picked: {броят на избраните топки извън зададените цветове}"
//"Divides from black balls: {броят на пътите, в които точките са били разделяни на 2}"

//От конзолата се чете 1 цяло число N, което е броят на топките в диапазон (0-1000).
//2. След това се четат N на брой цветове.

//Ако топката е “red” точките ни се повишават с 5.
// Ако топката е “orange” точките ни се повишават с 10.
// Ако топката е “yellow” точките ни се повишават с 15.
// Ако топката е “white” точките ни се повишават с 20.
// Ако топката е “black” точките ни се делят на 2, като закръгляме към по-малкото цяло число.
//Ако топката е с какъвто и да е цвят, различен от по-горните, точките не се манипулират и програмата
//продължава да работи.



