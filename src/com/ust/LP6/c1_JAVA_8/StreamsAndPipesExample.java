package com.ust.LP6.c1_JAVA_8;

import java.util.stream.Stream;

public class StreamsAndPipesExample {
    public static void main(String[] args) {
        Stream.of("viswa","axel","janani","anu","saran")
                .map(name -> name.toUpperCase())
                .filter(s -> s.length() > 3)
                .sorted()
                .distinct()
                .forEach(System.out::println);
    }
}
