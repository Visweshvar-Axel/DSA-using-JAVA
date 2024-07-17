package com.ust.LP6.c1_JAVA_8.a;

import java.util.Scanner;

public class DayOfWeekFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to representing a day of the week  (1 for Monday, 2 for Tuesday, etc.): ");
        int dayOfWeek = sc.nextInt();

        String dayName = switch (dayOfWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day number. enter a number between 1 and 7!!!";
        };

        System.out.println("The day of the week is: " + dayName);

        sc.close();
    }
}
