package livesession.L14_16;

import java.util.Scanner;
import java.util.Stack;

public class StackInBuild {
    static Scanner sc = new Scanner(System.in);
    static void reverseString(String st){
        Stack<Character> temp = new Stack<>();
        for(char c : st.toCharArray()) temp.push(c);
        String rev = "";
        for(char c : st.toCharArray()) rev += temp.pop();
        System.out.println("Entered: "+st+"\nReversed:"+rev);
    }
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String st = sc.nextLine();
        Stack<Character> temp = new Stack<>();
        for(char c : st.toCharArray()) temp.push(c);
        String rev = "";
        for(char c : st.toCharArray()) rev += temp.pop();
        System.out.println("Entered: "+st+"\nReversed:"+rev);
        reverseString("Jeswin");
        reverseString("Saran");
        reverseString("Janani");
        sc.close();
    }
}
