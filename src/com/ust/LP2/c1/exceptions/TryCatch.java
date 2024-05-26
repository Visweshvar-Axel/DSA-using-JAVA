package com.ust.LP2.c1.exceptions;

public class TryCatch {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        } catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
