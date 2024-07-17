package com.ust.LP6.c1_JAVA_8.a;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class FindMax {
    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(1.5, 2.8, 3.2, 2.0, 5.1);
        OptionalDouble maxVal = doubles.stream().mapToDouble(Double::doubleValue).max();

        maxVal.ifPresent(v -> System.out.println("Maximum element is:"+v));
    }
}
