package com.ust.LP3.c1;

import java.util.Scanner;

public class FinallyRunner {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            int[] arr = {1,2,3};
            int num = arr[3];
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Scanner closed");
            if (scanner!=null)
                scanner.close();
        }
        System.out.println("tata");
    }
}
