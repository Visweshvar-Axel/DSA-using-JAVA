package com.ust.LP6.c4_REACTIVE_JAVA_9;

import java.util.*;
import java.util.concurrent.Flow.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

class TrendingHashtagsProcessor implements Subscriber<String> {
    private Subscription subscription;
    private final Map<String, Integer> hashtagCounts = new HashMap<>();
    private final AtomicReference<List<String>> topTrendingHashtags = new AtomicReference<>(new ArrayList<>());

    @Override
    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
        subscription.request(Long.MAX_VALUE);
    }

    @Override
    public void onNext(String hashtag) {
        hashtagCounts.merge(hashtag, 1, Integer::sum);
        updateTopTrendingHashtags();
    }

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println("Completed processing hashtags.");
    }

    private void updateTopTrendingHashtags() {
        List<String> topThree = hashtagCounts.entrySet().stream()
            .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
            .limit(3)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
        topTrendingHashtags.set(topThree);
    }

    public List<String> getTopTrendingHashtags() {
        return topTrendingHashtags.get();
    }
}
