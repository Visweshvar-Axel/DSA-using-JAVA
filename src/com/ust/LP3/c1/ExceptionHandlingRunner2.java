package com.ust.LP3.c1;

public class ExceptionHandlingRunner2 {
    public static void main(String[] args) {
        method1();
        System.out.println("Main");
    }
    private static void method1() {
        method2();
        System.out.println("Method1");
    }
    private static void method2() {
        method3();
        System.out.println("Method2");
    }
    private static void method3() {
        String s = null;
        try {
        s.length();
        } catch (Exception e)
        System.out.println("Method3");
    }
}
