package com.ust.LP3.c2.runningTaskParallel.a6;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinPoolTester {
    private static final ForkJoinPool pool = new ForkJoinPool();
    private static final List<String> ToDo = List.of(
            "Task: Face wash",
            "Task: Drink water",
            "Task: do exercise",
            "Task: Review code"
    );
}
