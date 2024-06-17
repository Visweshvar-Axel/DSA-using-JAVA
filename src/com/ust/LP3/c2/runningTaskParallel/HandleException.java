package com.ust.LP3.c2.runningTaskParallel;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.IntStream;

public class HandleException {
    public static void main(String[] args) {
        AppleTree[] appleTrees = AppleTree.newTreeGarden(12);
        ForkJoinPool pool = ForkJoinPool.commonPool();

        PickFruitsWithRecursiveTask.PickFruitTask task = new PickFruitsWithRecursiveTask.PickFruitTask(appleTrees, 0 ,appleTrees.length - 1);
        int result = pool.invoke(task);

        System.out.println();
        System.out.println("Total applies picked: "+result);
    }
    public static class PickFruitTask extends RecursiveTask<Integer> {
        private final AppleTree[] appleTrees;
        private final int startInclusive;
        private final int endInclusive;
        private final int taskThreadsHold = 4;
        public PickFruitTask(AppleTree[] appleTrees, int startInclusive, int endInclusive) {
            this.appleTrees = appleTrees;
            this.startInclusive = startInclusive;
            this.endInclusive = endInclusive;
        }
        @Override
        protected Integer compute() {
            if (startInclusive == 2) {
                int throwException = 10/0;
            }
            if (endInclusive - startInclusive < taskThreadsHold){
                return deCompute();
            }
            int midpoint = startInclusive + (endInclusive - startInclusive) / 2;

            PickFruitsWithRecursiveTask.PickFruitTask leftSum = new PickFruitsWithRecursiveTask.PickFruitTask(appleTrees, startInclusive, midpoint);
            PickFruitsWithRecursiveTask.PickFruitTask rightSum = new PickFruitsWithRecursiveTask.PickFruitTask(appleTrees, midpoint+1, endInclusive);

            rightSum.fork();
            return leftSum.compute() + rightSum.join();
        }
        protected Integer deCompute() {
            return IntStream.rangeClosed(startInclusive,endInclusive)//
                    .map(i -> appleTrees[i].pickApples())
                    .sum();
        }
    }
}
