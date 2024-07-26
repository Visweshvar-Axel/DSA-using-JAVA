package com.ust.LP6.c3_DESIGN_PATTERN.Decorator.a6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CharacterFactory factory = null;

        while (true) {
            System.out.println("Choose a character type to create:");
            System.out.println("1. Warrior");
            System.out.println("2. Mage");
            System.out.println("3. Archer");
            System.out.println("4. Exit");
            System.out.print("Enter choice (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    factory = new WarriorFactory();
                    break;
                case 2:
                    factory = new MageFactory();
                    break;
                case 3:
                    factory = new ArcherFactory();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    continue;
            }

            Character character = factory.createCharacter();
            character.attack();
            character.defend();
        }
    }
}
