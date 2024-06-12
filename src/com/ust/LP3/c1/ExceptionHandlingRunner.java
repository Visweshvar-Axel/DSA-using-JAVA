package com.ust.LP3.c1;

public class ExceptionHandlingRunner {
    public static void main(String[] args) {
        method1();
    }
    private static void method1() {
        method2();
    }

    private static void method2() {
        String s = null;
        s.length();
    }
}
