package com.company;

import java.util.Scanner;

public class _06_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

//        find how many cake peaces total we have ,multiply length * width
        int peacesCake = length * width;
//     set boolean flag to say if cake is finished = > for now we have cake => false
        boolean isCakeEaten = false;
//     create command to say when cake finished
        String command = scanner.nextLine();
//     create while loop cycle to roll all cake peaces until no more
        while (!command.equals("STOP")){
//            do int variable to say how many peaces are taken from the guests
//            turns String command into int variable and parse to integer
            int takenPeaces = Integer.parseInt(command);
//            when the cycle starts we take peaces from total count of peaces,and reducing them
            peacesCake -= takenPeaces;

//      check is cake is eaten using boolean flag and set it to true .Then break the cycle and out
            if (peacesCake <= 0){
                isCakeEaten = true;
                break;

            }
//      set command in console
            command = scanner.nextLine();

        }
//        do checking if is  cake eaten or not and print result.Use Math.abs() to remove negative result
        if (isCakeEaten){
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(peacesCake));


        }else {
            System.out.printf("%d pieces are left.",peacesCake);
        }
    }
}


//  VARIANT 2
// Another variant to make this task ->

//        Scanner scanner = new Scanner(System.in);
//        int width = Integer.parseInt(scanner.nextLine());
//        int length = Integer.parseInt(scanner.nextLine());
//
//        int totalPieces = width * length;
//        String action = scanner.nextLine();
//
//        while (!action.equals("STOP")) {
//            int piecesTaken = Integer.parseInt(action);
//            totalPieces -= piecesTaken;
//
//            if (totalPieces < 0) {
//                System.out.printf("No more cake left! You need %d pieces more.%n", Math.abs(totalPieces));
//                return;
//            }
//
//            action = scanner.nextLine();
//        }
//
//        if (action.equals("STOP")) {
//            System.out.printf("%d pieces are left.%n", totalPieces);
//        }
//    }
//}