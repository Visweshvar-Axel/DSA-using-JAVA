package com.ust.LP6.c4_REACTIVE_JAVA_9;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow.*;

class TrendingHashtagsPublisher implements Publisher<String> {
    private final List<Subscriber<? super String>> sub = new ArrayList<>();

    @Override
    public void subscribe(Subscriber<? super String> subscriber) {
        sub.add(subscriber);
        subscriber.onSubscribe(new Subscription() {
            @Override
            public void request(long n) {}

            @Override
            public void cancel() {
                sub.remove(subscriber);
            }
        });
    }

    public void publishHashtag(String hashtag) {
        for (Subscriber<? super String> subscriber : sub) {
            subscriber.onNext(hashtag);
        }
    }

    public void complete() {
        for (Subscriber<? super String> subscriber : sub) {
            subscriber.onComplete();
        }
    }
}
