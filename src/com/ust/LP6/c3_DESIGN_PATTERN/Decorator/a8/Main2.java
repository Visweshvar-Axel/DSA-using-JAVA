package com.ust.LP6.c3_DESIGN_PATTERN.Decorator.a8;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};

        Sorter sorter = new Sorter(new BubbleSort());
        sorter.sortArray(array);
        System.out.println(Arrays.toString(array));

        sorter.setStrategy(new MergeSort());
        sorter.sortArray(array);
        System.out.println(Arrays.toString(array));

        sorter.setStrategy(new QuickSort());
        sorter.sortArray(array);
        System.out.println(Arrays.toString(array));
    }
}
