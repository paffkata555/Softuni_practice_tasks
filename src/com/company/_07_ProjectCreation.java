package com.company;

import java.util.Scanner;

public class _07_ProjectCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String theArchitectName = scanner.nextLine();
        int numberOfProjects = Integer.parseInt(scanner.nextLine());
        int requiredHours = numberOfProjects * 3;


        //  "The architect {name of architect} will need {needing hours} hours
        // to complete {count of project} project/s."

        System.out.printf("The architect %s will need %d hours to complete %d project/s.",
                theArchitectName, requiredHours, numberOfProjects);
    }
}
