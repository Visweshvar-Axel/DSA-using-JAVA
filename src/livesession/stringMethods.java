package livesession;

import java.util.Scanner;

public class stringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "viswa";
        String lastName = new String(new char[]{'a','x','e','l'});
        System.out.println(name+lastName);
        System.out.println(name.concat(lastName));
        System.out.print("Enter a string to compare:");
        String inp = sc.nextLine();
        String val = "abc";
        String cap = "ABC";
        System.out.println(val.equals(inp));
        System.out.println(cap.equalsIgnoreCase(inp));
        System.out.println(val.compareTo(inp));
        System.out.println(cap.compareToIgnoreCase(inp));
        String sen = sc.nextLine();
        String[] word = sen.split(" ");
        System.out.println(word.toString()+": count : "+word.length);
    }
}
