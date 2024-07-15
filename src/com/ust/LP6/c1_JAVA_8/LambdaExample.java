package com.ust.LP6.c1_JAVA_8;

import java.util.function.IntFunction;

public class LambdaExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("viswa"));
        Runnable r = () -> System.out.println("viswa");
        Thread t2 = new Thread(() -> {
            System.out.println("viswa");
            System.out.println("axel");
        });
        t1.start();
        t2.start();
        r.run();
        Runnable c =  (int a, int b) -> a * b;
        (a, b) -> a * b;
    }
}
