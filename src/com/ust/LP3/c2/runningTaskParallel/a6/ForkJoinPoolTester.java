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
        DoingTask doTask = new DoingTask(ToDo);
        pool.invoke(doTask);
    }

    static class DoingTask extends RecursiveAction {
        private static final int THRESHOLD = 2;
        private final List<String> tasks;

        DoingTask(List<String> tasks) {
            this.tasks = tasks;
        }

        @Override
        protected void compute() {
            if (tasks.size() <= THRESHOLD) {
                tasks.forEach(this::processTask);
            } else {
                int mid = tasks.size() / 2;
                DoingTask firstSubtask = new DoingTask(tasks.subList(0, mid));
                DoingTask secondSubtask = new DoingTask(tasks.subList(mid, tasks.size()));
                invokeAll(firstSubtask, secondSubtask);
            }
        }

        private void processTask(String task) {
            System.out.println("Started: " + task);
            try {
                Thread.sleep(400); // Simulate task completion time
                System.out.println(task + " completed ✅");
            } catch (InterruptedException e) {
                System.out.println(task + " can't be completed ❌");
                Thread.currentThread().interrupt();
            }
        }
    }
}
