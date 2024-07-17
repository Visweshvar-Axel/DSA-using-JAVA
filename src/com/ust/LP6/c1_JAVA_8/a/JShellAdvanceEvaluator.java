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
            System.out.print("Enter a mathematical expression (or type 'exit' to quit, 'history' to view past expressions): ");
            input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            if (input.equalsIgnoreCase("history")) {
                System.out.println("History of expressions:");
                for (String entry : history) {
                    System.out.println(entry);
                }
                continue;
            }

            List<SnippetEvent> events = jshell.eval(input);

            boolean validExpression = false;
            for (SnippetEvent event : events) {
                if (event.status() == Status.VALID) {
                    System.out.println("Result: " + event.value());
                    history.add(input + " = " + event.value());
                    validExpression = true;
                } else {
                    System.out.println("Invalid expression: " + input);
                    break;
                }
            }

            if (!validExpression) {
                System.out.println("Please enter a valid mathematical expression.");
            }
        }

        jshell.close();
        scanner.close();
    }
}
