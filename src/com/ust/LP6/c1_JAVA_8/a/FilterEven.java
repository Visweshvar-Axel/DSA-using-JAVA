package com.ust.LP6.c1_JAVA_8.a;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEven {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> even = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        even.forEach(System.out::println);
    }
}
