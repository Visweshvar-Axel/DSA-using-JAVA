package com.ust.LP6.c1_JAVA_8;

import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

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
        Consumer<String> oneArgument = name -> System.out.println("viswa"+name);
        StringRunnable usingCustom = name -> System.out.println("viswa"+name);
        oneArgument.accept("AXEL");
        usingCustom.run("Axel");



        IntBinaryOperator c =  (int a, int b) -> a * b;
        IntBinaryOperator d = (a, b) -> a * b;
        System.out.println(c.applyAsInt(5,5));
        System.out.println(d.applyAsInt(10,10));
        Supplier<String> str = () -> "im viswa";
        System.out.println(str.get());
    }
    @FunctionalInterface
    public interface StringRunnable {
        void run(String s);
    }
}
