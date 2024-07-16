package com.ust.LP6.c1_JAVA_8;

import java.io.PrintStream;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodReferencesExample {
    public static void main(String[] args) {
        Consumer<String> fun1 = System.out::println;  //bounded instance static reference
        fun1.accept("viswa");

        BiConsumer<PrintStream, String> printStreamBiConsumer = PrintStream::print; //unbound there instance should pass as parameter
        printStreamBiConsumer.accept(System.out,"hiiii");

        Supplier<Thread> currentThread = Thread::currentThread; //Static method
        System.out.println("current thread "+currentThread.get());

        // constructor method reference
    }
}
