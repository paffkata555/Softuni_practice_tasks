package com.company;

import java.util.Scanner;

public class _05_AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String payment = scanner.nextLine();

        double sum = 0.0;
        while (!payment.equals("NoMoreMoney")){

            double money = Double.parseDouble(payment);

            if (money < 0) {
                System.out.println("Invalid operation!");
                break;

            }
            System.out.printf("Increase: %.2f%n",money);
            sum += money;
            payment = scanner.nextLine();

        }
        System.out.printf("Total: %.2f",sum);

    }
}
// 1 It starts by creating a Scanner object to read user input.
// 2 It reads the payment variable as a string.
// 3 It initializes the sum variable to 0.0.
// 4 It while loop that continues as long
// 5 Inside payment string  to a double-precisionDouble.parseDouble(payment) and stores money variable.
// 6 It checks if the money value is negative.
// 7 If money value is positive i.e., a System.out.printf, and sum variable
// 8 It reads the next
// 9 Once the userSystem.out.printf.
// 10 Finally, it closes the `Scanner object to release resources.