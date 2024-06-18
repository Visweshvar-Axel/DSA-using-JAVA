package com.ust.LP3.c2.runningTaskParallel.a6;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkJoinPoolTester {
    private static final ForkJoinPool pool = new ForkJoinPool();
    private static final List<String> ToDo = List.of(
            "Task: Face wash",
            "Task: Drink water",
            "Task: do exercise",
            "Task: Review code"
    );
    static class doingTask extends RecursiveAction {
        private static final int tsize = 2;
        private final List<String> tasks;

        doingTask(List<String> tasks) {
            this.tasks = tasks;
        }

        @Override
        protected void compute() {
            if (tasks.size() <- tsize) {
                tasks.forEach(this::processTask);
            }
        }

        private void processTask(String s) {
            System.out.println("Started: "+s);
        }
    }
}
