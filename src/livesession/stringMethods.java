package livesession;

import java.util.Scanner;

public class stringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "viswa";
        String lastName = new String(new char[]{'a','x','e','l'});
        System.out.println(name+lastName);
        System.out.println(name.contains("v"));
        System.out.println(name.replace("a","eshvar"));
        System.out.println(name.substring(3,5));
        System.out.println(name.concat(lastName));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(0));
        for(char c: name.toCharArray()) System.out.print(c+" ");
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
        for(String s: word) System.out.print(s+" ");
        System.out.println(": count : "+word.length+" : sen length : "+sen.length());
    }
}
