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

    public static void main(String[] args) {
        doingTask doTask = new doingTask(ToDo)
    }
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

        private void processTask(String task) {
            System.out.println("Started: "+task);
            try {
                Thread.sleep(400);
                System.out.println(task+" completed ✅");
            } catch (InterruptedException e) {
                System.out.println(task+" cant be completed ❌");
                throw new RuntimeException(e);
            }
        }
    }
}
