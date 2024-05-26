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
/**
 * Enter a table number: 10
 * 10 x 1 = 10
 * 10 x 2 = 20
 * 10 x 3 = 30
 * 10 x 4 = 40
 * 10 x 5 = 50
 * 10 x 6 = 60
 * 10 x 7 = 70
 * 10 x 8 = 80
 * 10 x 9 = 90
 * 10 x 10 = 100
 * */