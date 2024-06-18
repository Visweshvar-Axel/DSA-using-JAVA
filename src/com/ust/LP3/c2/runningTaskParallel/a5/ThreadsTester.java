package com.ust.LP3.c2.runningTaskParallel.a5;

import com.ust.LP3.c2.runningTaskParallel.a4.ReactiveStreamsTester;

import java.util.List;
import java.util.concurrent.Flow;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.SubmissionPublisher;

public class ThreadsTester {
    private static final ForkJoinPool pool = new ForkJoinPool();
    private static final List<String> ToDo = List.of(
            "Task: Face wash",
            "Task: Drink water",
            "Task: do exercise",
            "Task: Review code"
    );
    private static final Object lock = new Object();
    private static boolean isSecComplete = false;
    private static boolean isParaComplete = false;
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
            while ()
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
}
