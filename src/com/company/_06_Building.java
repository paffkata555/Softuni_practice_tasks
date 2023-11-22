package com.company;

import java.util.Scanner;

public class _06_Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countFloors = Integer.parseInt(scanner.nextLine());
        int countRooms = Integer.parseInt(scanner.nextLine());

// 1*        do for cycle -> floor  and step is decrease
// 2*        inner cycle -> room  and step is increase
        for (int floor = countFloors; floor >= 1 ; floor--) {
            for (int room = 0; room < countRooms; room++) {

//        make if else statement
//        if  top floor is last floor -> "L" large
                if (floor == countFloors) {
                    System.out.print("L");

//        if floor is even -> "O"         office

                } else if (floor % 2 == 0) {
                    System.out.print("O");

//        if floor is odd -> "A"         apartment
                } else {
                    System.out.print("A");
                }

//                 inner "room"s cycle print floor and room

                System.out.printf("%d%d ", floor, room);

            }
//            outer "floor"  cycle  print to move on the new line
            System.out.println();
        }

    }
}
