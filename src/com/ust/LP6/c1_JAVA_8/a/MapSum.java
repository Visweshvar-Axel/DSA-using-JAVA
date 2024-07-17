package com.ust.LP6.c1_JAVA_8.a;

import java.util.Arrays;
import java.util.List;

public class MapSum {
    public static void main(String[] args) {
        List<String> numberStrings = Arrays.asList("1", "2", "3", "4", "5");
        int sum = numberStrings.stream().mapToInt(Integer::parseInt).sum();
        System.out.println("sum of all numbers: "+sum);
    }
}
