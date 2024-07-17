package com.ust.LP6.c1_JAVA_8.a;

import jdk.jshell.JShell;
import jdk.jshell.Snippet;
import jdk.jshell.SnippetEvent;

import java.util.List;
import java.util.Scanner;

public class JShellEvaluator {
    public static void main(String[] args) {
        JShell jShell = JShell.create();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a mathematical expression (or type 'exit' to quit): ");
            String input = sc.nextLine();
            List<SnippetEvent> events = jShell.eval(input);

            if (input.equalsIgnoreCase("exit")) break;

            boolean validExpression = false;
            for (SnippetEvent event : events) {
                if (event.status() == Snippet.Status.VALID) {
                    System.out.println("Result: " + event.value());
                    validExpression = true;
                } else {
                    System.out.println("Invalid input: " + input);
                    break;
                }
            }

            if (!validExpression) {
                System.out.println("Please enter a valid mathematical expression.");
            }
        }

        jShell.close();
        sc.close();
    }
    /* *
     * Enter a mathematical expression (or type 'exit' to quit): 5 * 8
     * Result: 40
     * Enter a mathematical expression (or type 'exit' to quit): 1+2
     * Result: 3
     * Enter a mathematical expression (or type 'exit' to quit): exit
     *
     * Process finished with exit code 0
     * */
}
