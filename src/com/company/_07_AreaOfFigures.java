package com.company;

import java.util.Scanner;

public class _07_AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeFigure = scanner.nextLine();

//        double squareArea = side * side;
//        double rectangleArea = Width * Length;
//        double circleArea = Math.PI * radius * radius;
//        double triangleArea = base * height / 2;

        double area = 0;
        if (typeFigure.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            area = side * side;


        } else if (typeFigure.equals("rectangle")) {
            double width = Double.parseDouble(scanner.nextLine());
            double length = Double.parseDouble(scanner.nextLine());
            area = width * length;


        } else if (typeFigure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            area = Math.PI * radius * radius;


        } else if (typeFigure.equals("triangle")) {
            double base = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            area = base * height / 2;


        }
        System.out.printf("%.3f", area);


    }
}
