package com.ust.LP3.c1;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int arr[] = new int[3];
            a=a/b;
        } catch (ArithmeticException e) {
            e.getMessage();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.getMessage();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
