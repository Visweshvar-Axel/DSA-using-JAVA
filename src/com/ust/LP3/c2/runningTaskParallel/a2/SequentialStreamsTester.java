package com.ust.LP3.c2.runningTaskParallel.a2;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class SequentialStreamsTester {
    private static final ForkJoinPool pool = new ForkJoinPool();
    private static final List<String> ToDo = List.of(
            "Task: Face wash",
            "Task: Drink water",
            "Task: do exercise"
    ) ;
    public static void SequentialStream(List<String> task) {
        task.stream().forEach(t -> {
            System.out.println("started: "+t);
            completed(t);
        });
    }

}
