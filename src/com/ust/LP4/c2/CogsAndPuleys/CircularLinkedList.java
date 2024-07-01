package com.ust.LP4.c2.CogsAndPuleys;

public class CircularLinkedList<E> extends LinkedList<E>{
    @Override
    public Node<E> appendFirst(E value) {
        Node<E> newNode =  super.appendFirst(value);
        last.next = first;
        return newNode;
    }
    public void rotate() {
        last = first;
        first = first.next;
    }
}
