package com.ust.LP4.c2.CogsAndPuleys;

public class LinkedList<E> implements Iterable<E> {
    int length = 0;
    Node<E>[] lastModifiedNode;
    Node<E> first;
    Node<E> last;
    public static class Node<E>{
        protected E value;

        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        protected Node next;
    }

    protected Node<E> getNewNode(){
        Node<E> node = new Node<>();
        lastModifiedNode = new Node[]{node};
        return node;
    }
}
