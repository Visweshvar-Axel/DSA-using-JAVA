package livesession;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string");
        String inp = sc.nextLine();
        String rev = "";
        for(char c: inp.toCharArray()){
            rev = c + rev;
        }
        if(inp.equals(rev)) System.out.println("the given string is palindrome");
        else System.out.println("the given string is not a palindrome");
    }
}
