package com.company;

import java.util.Scanner;

public class _01_OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String annysBook = scanner.nextLine();

//        do counter
        int counter = 0;

//        set command readBook as a string in console
        String readBook = scanner.nextLine();
//        do while cycle to roll all books until we find a needing name
        while (!readBook.equals("No More Books")) {

//        check if the name of book is equal to searching one and in this case break
            if (readBook.equals(annysBook)) {
                System.out.printf("You checked %d books and found it.", counter);
                break;

            }
//            do counter and increase for every cycle
            counter++;

//          set command
            readBook = scanner.nextLine();

//            check if searching book is equal to name,and if the books finished and still not found
//            print the message and how many books are checked ,and break the cycle

            if (readBook.equals("No More Books")) {
                System.out.printf("The book you search is not here!%n" + "You checked %d books.", counter);
                break;
            }
        }


    }
}
