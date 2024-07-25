package com.ust.LP6.c3_DESIGN_PATTERN.Decorator.a3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Circle");
            System.out.println("2. Ellipse");
            System.out.println("3. Exit");
            System.out.print("Enter choice (1-3): ");
            int choice = scanner.nextInt();

            Shape shape = null;

            switch (choice) {
                case 1:
                    System.out.print("Enter radius of the circle: ");
                    double radius = scanner.nextDouble();
                    shape = ShapeFactory.getShapeFactory(radius);
                    break;
                case 2:
                    System.out.print("Enter long radius of the ellipse: ");
                    double longRadius = scanner.nextDouble();
                    System.out.print("Enter short radius of the ellipse: ");
                    double shortRadius = scanner.nextDouble();
                    shape = ShapeFactory.getShapeFactory(longRadius, shortRadius);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                    continue;
            }

            System.out.println("Perimeter: " + shape.perimeterCalculation());
            System.out.println("Area: " + shape.areaCalculation());
        }
    }
}
