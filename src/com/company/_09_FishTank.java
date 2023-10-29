package com.company;

import java.util.Scanner;

public class _09_FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent  = Double.parseDouble(scanner.nextLine());

        int volumeInCm = length * width * height;

        //   1l = 10 dm3
        //   1dm = 10 cm
        //   1dm3 = 10 cm * 10cm * 10cm = 1000cm3

        double volumeInLiters = volumeInCm/1000.0;
        double finalVolume = volumeInLiters - (volumeInLiters* (percent/100));
        System.out.println(finalVolume);
    }
}
