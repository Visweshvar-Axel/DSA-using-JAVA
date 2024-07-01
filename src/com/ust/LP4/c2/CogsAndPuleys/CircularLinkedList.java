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

    public static void main(String[] args) {
        CircularLinkedList<Integer> linkedList = new CircularLinkedList<>();
        linkedList.appendFirst(4);
        linkedList.appendFirst(1);
        linkedList.appendFirst(2);
        linkedList.appendFirst(3);
        linkedList.appendLast(8);
        linkedList.appendLast(7);
        linkedList.appendLast(18);
        linkedList.appendLast(18);
        for (int i = 0; i < 15; i++) {
        }
    }
}
