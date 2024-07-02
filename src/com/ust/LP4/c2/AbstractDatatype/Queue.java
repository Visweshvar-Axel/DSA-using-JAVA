package com.ust.LP4.c2.AbstractDatatype;

public interface Queue<E> {
    void enqueue(E value);
    E dequeue();
    E peek();
}
