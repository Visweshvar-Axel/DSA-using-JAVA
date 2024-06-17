package com.ust.LP3.c2.runningTaskParallel;

import java.util.concurrent.ForkJoinPool;

public class PickFruitsWithRecursiveTask {
    public static void main(String[] args) {
        AppleTree[] appleTrees = AppleTree.newTreeGarden(12);
        ForkJoinPool pool = ForkJoinPool.commonPool();
    }
}
