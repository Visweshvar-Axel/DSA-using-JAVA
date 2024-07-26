package com.ust.LP6.c3_DESIGN_PATTERN.Decorator.a7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GUIFactory factory = null;

        System.out.println("Choose a theme:");
        System.out.println("1. Light Theme");
        System.out.println("2. Dark Theme");
        System.out.print("Enter choice (1-2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                factory = new LightThemeFactory();
                break;
            case 2:
                factory = new DarkThemeFactory();
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        Button button = factory.createButton();
        TextField textField = factory.createTextField();

        button.render();
        textField.render();
    }
}
