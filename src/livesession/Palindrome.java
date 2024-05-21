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
        //alt one
        char arr[] = inp.toCharArray();
        int size = arr.length;
        boolean f=true;
        for(int i = 0; i<size/2;i++){
            if(arr[i]!=arr[size-1-i]){
                f=false;
                break;
            }
        }
        if(f) System.out.println("the given string is palindrome");
        else System.out.println("the given string is not a palindrome");
    }
}
