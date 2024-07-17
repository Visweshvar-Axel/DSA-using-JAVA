package com.ust.LP6.c1_JAVA_8.a;

import jdk.jshell.JShell;
import jdk.jshell.SnippetEvent;
import jdk.jshell.Snippet.Status;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class JShellAdvanceEvaluator {
    public static void main(String[] args) {
        // Create a JShell instance
        JShell jshell = JShell.create();
        Scanner scanner = new Scanner(System.in);
        List<String> history = new ArrayList<>();
        String input;

        while (true) {
            // Prompt the user to input a mathematical expression
            System.out.print("Enter a mathematical expression (or type 'exit' to quit, 'history' to view past expressions): ");
            input = scanner.nextLine().trim();

            // Check if the user wants to exit
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            // Check if the user wants to view history
            if (input.equalsIgnoreCase("history")) {
                System.out.println("History of expressions:");
                for (String entry : history) {
                    System.out.println(entry);
                }
                continue;
            }

            // Evaluate the input expression using JShell
            List<SnippetEvent> events = jshell.eval(input);

            // Handle JShell events
            boolean validExpression = false;
            for (SnippetEvent event : events) {
                if (event.status() == Status.VALID) {
                    // Display the result
                    System.out.println("Result: " + event.value());
                    // Store the expression and its result in history
                    history.add(input + " = " + event.value());
                    validExpression = true;
                } else {
                    // Handle invalid expressions
                    System.out.println("Invalid expression: " + input);
                    break;
                }
            }

            if (!validExpression) {
                System.out.println("Please enter a valid mathematical expression.");
            }
        }

        // Close the JShell instance
        jshell.close();
        scanner.close();
    }
}
