package com.company;

import java.util.Scanner;

public class _04_CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int catCount = Integer.parseInt(scanner.nextLine());

        int smallCats = 0;
        int mediumCats = 0;
        int largeCats = 0;
        double totalFoodPrice = 0.0;

        for (int i = 0; i < catCount; i++) {
            double foodGrams = Double.parseDouble(scanner.nextLine());

            if (foodGrams >= 100 && foodGrams < 200) {
                smallCats++;
            } else if (foodGrams >= 200 && foodGrams < 300) {
                mediumCats++;
            } else if (foodGrams >= 300 && foodGrams < 400) {
                largeCats++;
            }

            totalFoodPrice += foodGrams / 1000 * 12.45;


        }

        System.out.printf("Group 1: %d cats.%n", smallCats);
        System.out.printf("Group 2: %d cats.%n", mediumCats);
        System.out.printf("Group 3: %d cats.%n", largeCats);
        System.out.printf("Price for food per day: %.2f lv.", totalFoodPrice);
    }
}





//В приют за животни има определен брой котки, които изяждат различно количество храна на ден. Задачата
//ви е да изчислите колко е броят на котките във всяка група и парите, които са нужни на собственика за
//храната им за един ден, ако 1 кг храна = 12.45 лева.
//• Ако котката изяжда от 100 (вкл.) до 200 грама, то тя попада в група 1: малки котки.
//• Ако котката изяжда от 200 (вкл.) до 300 грама, то тя попада в група 2: големи котки.
//• Ако котката изяжда от 300 (вкл.) до 400 грама, то тя попада в група 3: огромни котки.
//Вход:
//• На първи ред - броят на котките - цяло число в интервала [1..100]
//• На всеки следващ ред за всяка котка - Х грама храна - реално число в интервала [100.00..400.00]
//Изход:
//Отпечатват се следните редове:
//"Group 1: {броят на котките в група 1: малки котки} cats."
//"Group 2: {броят на котките в група 2: големи котки} cats."
//"Group 3: {броят на котките в група 3: огромни котки} cats."
//"Price for food per day: {цената за храната} lv."
//Цената на храната трябва да бъде закръглена до втория знак след десетичната запетая
