package com.ust.LP3.c2.runningTaskParallel.a4;

import java.util.List;
import java.util.concurrent.Flow;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.SubmissionPublisher;

public class ReactiveStreamsTester {
    private static final ForkJoinPool pool = new ForkJoinPool();
    private static final List<String> ToDo = List.of(
            "Task: Face wash",
            "Task: Drink water",
            "Task: do exercise",
            "Task: Review code"
    );
    static class Person implements Flow.Subscriber<String> {
        private Flow.Subscription subscription;
        @Override
        public void onSubscribe(Flow.Subscription subscription) {
            this.subscription = subscription;
            subscription.request(1);
        }

        @Override
        public void onNext(String item) {
            System.out.println("task: " + item);
            subscription.request(1);
        }

        @Override
        public void onError(Throwable throwable) {
            throwable.printStackTrace();
        }

        @Override
        public void onComplete() {
            System.out.println("All tasks completed");
        }
    }
    private static final SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
    public static void main(String[] args) {
        Person person = new Person();
        publisher.subscribe(person);

        System.out.println("SequentialStream");
        SequentialStream(ToDo);

        System.out.println("parallelStream");
        parallelStream(ToDo);

        publisher.close();
    }
    public static void SequentialStream(List<String> tasks) {
        tasks.stream().forEach(task -> {
            System.out.println("started: "+task);
            completed(task);
        });
    }
    public static void parallelStream(List<String> tasks) {
        tasks.stream().forEach(task -> {
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
/* *
 * SequentialStream
 * started: Task: Face wash
 * Task: Face wash completed ✅
 * started: Task: Drink water
 * Task: Drink water completed ✅
 * started: Task: do exercise
 * Task: do exercise completed ✅
 * started: Task: Review code
 * Task: Review code completed ✅
 * parallelStream
 * started: Task: Face wash
 * Task: Face wash completed ✅
 * started: Task: Drink water
 * Task: Drink water completed ✅
 * started: Task: do exercise
 * Task: do exercise completed ✅
 * started: Task: Review code
 * Task: Review code completed ✅
 * All tasks completed
 *
 * Process finished with exit code 0
 * */
}

