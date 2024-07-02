package com.ust.LP4.c2.AbstractDatatype;

public class QueueImplLinkedList<E> implements Queue<E> {
    public class LinkedListNode<E> {
        private E value;
        private StackImplLinkedList.LinkedListNode next;

        public LinkedListNode() {
            value = null;
            next = null;
        }

        public LinkedListNode(E value) {
            this.value = value;
            next = null;
        }

        public LinkedListNode(E value, StackImplLinkedList.LinkedListNode next) {
            this.value = value;
            this.next = next;
        }
    }
    @Override
    public void enqueue(E value) {

    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }
}
