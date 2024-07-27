package com.ust.LP6.c4_REACTIVE_JAVA_9;

public class Main {
    public static void main(String[] args) {
        TrendingHashtagsPublisher Publisher = new TrendingHashtagsPublisher();
        TrendingHashtagsProcessor Processor = new TrendingHashtagsProcessor();
        Publisher.subscribe(Processor);
        Publisher.publishHashtag("#Java");
        Publisher.publishHashtag("#ReactiveProgramming");
        Publisher.publishHashtag("#Java9");
        Publisher.publishHashtag("#Concurrency");
        Publisher.complete();
        System.out.println("Top Trending Hashtags: " + Processor.getTopTrendingHashtags());
    }
}
