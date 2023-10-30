package com.company;

import java.util.Scanner;

public class _04_PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        String genderType = scanner.nextLine();

        if (genderType.equals("m")){
            if (age >= 16){
                System.out.println("Mr.");
            }else if(age < 16){
                System.out.println("Master");
            }

        }
        if (genderType.equals("f")){
            if (age >= 16){
                System.out.println("Ms.");
            }else if(age < 16){
                System.out.println("Miss");
            }
        }

    }
}
