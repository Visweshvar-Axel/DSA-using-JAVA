package com.ust.LP6.c4_REACTIVE_JAVA_9;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow.*;

class TrendingHashtagsPublisher implements Publisher<String> {
    private final List<Subscriber<? super String>> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Subscriber<? super String> subscriber) {
        subscribers.add(subscriber);
        subscriber.onSubscribe(new Subscription() {
            @Override
            public void request(long n) {}

            @Override
            public void cancel() {
                subscribers.remove(subscriber);
            }
        });
    }

    public void publishHashtag(String hashtag) {
        for (Subscriber<? super String> subscriber : subscribers) {
            subscriber.onNext(hashtag);
        }
    }

    public void complete() {
        for (Subscriber<? super String> subscriber : subscribers) {
            subscriber.onComplete();
        }
    }
}
