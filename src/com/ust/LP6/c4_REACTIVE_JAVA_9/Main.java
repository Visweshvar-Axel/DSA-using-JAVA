package com.ust.LP6.c4_REACTIVE_JAVA_9;

public class Main {
    public static void main(String[] args) {
        TrendingHashtagsPublisher hashtagsPublisher = new TrendingHashtagsPublisher();
        TrendingHashtagsProcessor hashtagsProcessor = new TrendingHashtagsProcessor();
        hashtagsPublisher.subscribe(hashtagsProcessor);
        hashtagsPublisher.publishHashtag("#Java");
        hashtagsPublisher.publishHashtag("#ReactiveProgramming");
        hashtagsPublisher.publishHashtag("#Java9");
        hashtagsPublisher.publishHashtag("#Concurrency");
        hashtagsPublisher.complete();
        System.out.println("Top Trending Hashtags: " + hashtagsProcessor.getTopTrendingHashtags());
    }
}
