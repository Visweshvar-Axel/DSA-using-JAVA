package com.ust.LP6.c1_JAVA_8.a;

import jdk.jshell.JShell;
import jdk.jshell.SnippetEvent;
import jdk.jshell.Snippet.Status;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class JShellAdvanceEvaluator {
    public static void main(String[] args) {
        JShell jshell = JShell.create();
        Scanner sc = new Scanner(System.in);
        List<String> his = new ArrayList<>();
        String inp;

        while (true) {
            System.out.print("Enter a mathematical expression (or type 'exit' to quit, 'history' to view past expressions): ");
            inp = sc.nextLine().trim();

            if (inp.equalsIgnoreCase("exit")) {
                break;
            }

            if (inp.equalsIgnoreCase("history")) {
                System.out.println("History of expressions:");
                for (String entry : his) {
                    System.out.println(entry);
                }
                continue;
            }

            List<SnippetEvent> events = jshell.eval(inp);

            boolean validExpression = false;
            for (SnippetEvent event : events) {
                if (event.status() == Status.VALID) {
                    System.out.println("Result: " + event.value());
                    his.add(inp + " = " + event.value());
                    validExpression = true;
                } else {
                    System.out.println("Invalid expression: " + inp);
                    break;
                }
            }

            if (!validExpression) {
                System.out.println("Please enter a valid expression.");
            }
        }

        jshell.close();
        sc.close();
    }
    /* *
     * Enter a mathematical expression (or type 'exit' to quit, 'history' to view past expressions): Math.pow(5, 2)
     * Result: 25.0
     * Enter a mathematical expression (or type 'exit' to quit, 'history' to view past expressions):  Math.sqrt(25)
     * Result: 5.0
     * Enter a mathematical expression (or type 'exit' to quit, 'history' to view past expressions): history
     * History of expressions:
     * Math.pow(5, 2) = 25.0
     * Math.sqrt(25) = 5.0
     * Enter a mathematical expression (or type 'exit' to quit, 'history' to view past expressions): exit
     *
     * Process finished with exit code 0
     * */
}
