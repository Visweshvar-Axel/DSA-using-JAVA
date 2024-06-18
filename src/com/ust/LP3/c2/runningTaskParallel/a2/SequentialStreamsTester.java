package com.ust.LP3.c2.runningTaskParallel.a2;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class SequentialStreamsTester {
    private static final ForkJoinPool pool = new ForkJoinPool();
    private static final List<String> ToDo = List.of(
            "Task: Face wash",
            "Task: Drink water",
            "Task: do exercise"
    );

    public static void main(String[] args) {
        SequentialStream(ToDo);
    }
    public static void SequentialStream(List<String> tasks) {
//        tasks.stream().forEach(task -> {
        tasks.parallelStream().forEach(task -> {
            System.out.println("started: "+task);
            completed(task);
        });
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
/* * stream
 * started: Task: Face wash
 * Task: Face wash completed ✅
 * started: Task: Drink water
 * Task: Drink water completed ✅
 * started: Task: do exercise
 * Task: do exercise completed ✅
* */
/* * parallelStream
* started: Task: Drink water
* started: Task: do exercise
* started: Task: Face wash
* Task: Drink water completed ✅
* Task: Face wash completed ✅
* Task: do exercise completed ✅
* */
}
