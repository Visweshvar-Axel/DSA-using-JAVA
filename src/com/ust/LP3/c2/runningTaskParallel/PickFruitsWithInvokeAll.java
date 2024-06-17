package com.ust.LP3.c2.runningTaskParallel;

import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;

import static java.util.Arrays.asList;

public class PickFruitsWithInvokeAll {
    public static void main(String[] args) {
        AppleTree[] appleTrees = AppleTree.newTreeGarden(6);

        Callable<void> applePicker1 = createApplePicker(appleTrees, 0, 2, "viswa");
        Callable<void> applePicker2 = createApplePicker(appleTrees, 2, 4, "Axel");
        Callable<void> applePicker3 = createApplePicker(appleTrees, 4, 6, "anu");

        ForkJoinPool.commonPool().invokeAll(asList(applePicker1,applePicker2,applePicker2));
        /*ForkJoinPool.invokeAll(asList(applePicker1,applePicker2,applePicker2));// in efficient */

        System.out.println();
        System.out.println("All fruits collected");
    }

    public static Callable<void> createApplePicker(AppleTree[] appleTrees, int fromIndexInclusive, int toIndexExclusive, String workerName) {
        return () -> {
            return null;
        };
    }
}
