package com.ust.LP3.c2.runningTaskParallel;

import java.util.concurrent.ForkJoinPool;

public class PickFruitsWithRecursiveTask {
    public static void main(String[] args) {
        AppleTree[] appleTrees = AppleTree.newTreeGarden(12);
        ForkJoinPool pool = ForkJoinPool.commonPool();

        PickFruitTask task = new
    }
    public static class PickFruitTask {
        private final AppleTree[] appleTrees;
        private final int startInclusive;
        private final int endInclusive;
        private final int taskThreadsHold = 4;

        public PickFruitTask(AppleTree[] appleTrees, int startInclusive, int endInclusive) {
            this.appleTrees = appleTrees;
            this.startInclusive = startInclusive;
            this.endInclusive = endInclusive;
        }
    }
}
