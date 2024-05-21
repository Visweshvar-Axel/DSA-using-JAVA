package livesession;

import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a table number: ");
        t =sc.nextInt();
        for(int i = 1;i <=10;i++) System.out.println(t+" x "+i+" = "+(t*i));
    }
}
