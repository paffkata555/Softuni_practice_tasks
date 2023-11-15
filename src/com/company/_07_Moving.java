package com.company;

import java.util.Scanner;

public class _07_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());

//        find a volume of the room
        int volume = length * width * high;
//        put boolean flag to check is it enough free space
        boolean isEmptySpaceLeft = true;
//create command which to write in console
        String command = scanner.nextLine();

//        do while loop to roll cycle until we set command "Done"
//        in cycle we set boxes , parse and insert command
        while (!command.equals("Done")) {
            int boxes = Integer.parseInt(command);

//            we take out the chests from the volume
            volume -= boxes;
//      check if the room is full and no more empty space,then break cycle
            if (volume <= 0) {
                isEmptySpaceLeft = false;
                break;
            }

//      set command
            command = scanner.nextLine();

        }
//        check if no more space and print result,using Math.abs to remove negative result value
        if (!isEmptySpaceLeft) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volume));
//        or if still have empty space and print left one volume
        } else {
            System.out.printf("%d Cubic meters left.", volume);
        }

    }
}
