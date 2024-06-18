package com.ust.LP3.c2.runningTaskParallel.a5;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class ThreadsTester {
    private static final ForkJoinPool pool = new ForkJoinPool();
    private static final List<String> ToDo = List.of(
            "Task: Face wash",
            "Task: Drink water",
            "Task: do exercise",
            "Task: Review code"
    );
    public static void main(String[] args) {
        Thread seqThread = new Thread(() -> SequentialStream(ToDo));
        Thread paraThread = new Thread(() -> parallelStream(ToDo));

        seqThread.start();
        paraThread.start();

        try {
            seqThread.join();
            paraThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("All tasks completed.");
    }
    public static void SequentialStream(List<String> tasks) {
        synchronized (lock) {
            tasks.stream().forEach(task -> {
                System.out.println("started: " + task);
                completed(task);
            });
            isSecComplete = true;
            lock.notifyAll();
        }
    }
    public static void parallelStream(List<String> tasks) {
        synchronized (lock) {
            while (!isSecComplete) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            tasks.stream().forEach(task -> {
                System.out.println("started: " + task);
                completed(task);
            });
            isParaComplete = true;
            lock.notifyAll();
        }
    }
    private static void completed(String task) {
        try {
            Thread.sleep(400);
            System.out.println(task+" completed ✅");
        } catch (InterruptedException e) {
            System.out.println(task+" cant be completed ❌");
            throw new RuntimeException(e);
        }
    }
/* *
 * started: Task: Face wash
 * Task: Face wash completed ✅
 * started: Task: Drink water
 * Task: Drink water completed ✅
 * started: Task: do exercise
 * Task: do exercise completed ✅
 * started: Task: Review code
 * Task: Review code completed ✅
 * started: Task: Face wash
 * Task: Face wash completed ✅
 * started: Task: Drink water
 * Task: Drink water completed ✅
 * started: Task: do exercise
 * Task: do exercise completed ✅
 * started: Task: Review code
 * Task: Review code completed ✅
 * All tasks completed.
 *
 * Process finished with exit code 0
 * */
}
