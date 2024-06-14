package com.ust.LP3.c1;

public class CheckedExceptionRunner {
    public static void main(String[] args) {
        try {
            someOtherMethod1();
            someOtherMethod2();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private static void someOtherMethod2() throws RuntimeException {
        String str = null;
        str.length();
    }

    private static void someOtherMethod1() throws InterruptedException {
        Thread.sleep(2000);
    }
}
