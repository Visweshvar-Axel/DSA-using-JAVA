package USTPraxis;

import java.util.Scanner;

public class BreachCountWithSemicolon {
    private static int findBreachCount(String logs) {
        int c = 0;
        logs = logs.toLowerCase();
        String[] slogs = logs.split(";");
        for (String log : slogs) if (log.contains("breach")) c++;
        return c;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String logs = scan.nextLine();
        int result = findBreachCount(logs);
        System.out.println(result);
    }
}
/*
Service Initiated;Data breach detected at jpm; Service terminated

Successful login;Breach attempt detected;Unauthorized access breach;User logged out
*/