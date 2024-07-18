package com.ust.LP6.c1_JAVA_8.a;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConcatAndGroup {
    public static void main(String[] args) {
        List<String> words1 = Arrays.asList("Java", "is", "fun", "with", "Streams");
        System.out.println(words1.stream().collect(Collectors.joining("")));

        List<String> words2 = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
        Map<Integer, List<String>> groupedByLength = words2.stream().collect(Collectors.groupingBy(String::length));

        System.out.println(groupedByLength);
    }
}
