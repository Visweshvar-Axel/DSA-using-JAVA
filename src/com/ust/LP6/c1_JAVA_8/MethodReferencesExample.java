package com.ust.LP6.c1_JAVA_8;

import java.io.PrintStream;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MethodReferencesExample {
    public static void main(String[] args) {
        Consumer<String> fun1 = System.out::println;
        fun1.accept("viswa");

        BiConsumer<PrintStream, String> printStreamBiConsumer = PrintStream::print;
        printStreamBiConsumer.accept("HI..!");
    }
}
