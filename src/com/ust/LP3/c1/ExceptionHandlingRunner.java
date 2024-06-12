package com.ust.LP3.c1;

public class ExceptionHandlingRunner {
    public static void main(String[] args) {
        method3();
    }
    private static void method3() {
        String s = null;
        s.length();
    }
}
