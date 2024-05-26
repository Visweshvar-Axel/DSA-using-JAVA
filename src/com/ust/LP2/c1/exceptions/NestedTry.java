package com.ust.LP2.c1.exceptions;

public class NestedTry {
    public static void main(String[] args) {
        try {
            try {
                int[] a = new int[5];
                a[5] = 0;
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            try {
                System.out.println(10/0);
            } catch (ArithmeticException e){
                System.out.println(e);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
