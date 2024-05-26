package com.ust.LP2.c1.exceptions;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            a[5] = 0;
            System.out.println(10/0);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        } catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
