package com.ust.LP4.c2.CogsAndPuleys;

public class DoubleLinkedList<E> extends LinkedList<E> {
    public static class Node<E>{
        protected E value;
        protected Node next;
        protected Node previous;

        public Node() {
            value = null;
            next = null;
            previous = null;
        }
        public Node(E value) {
            this.value = value;
        }

        public Node(E value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }

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

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
    public static void main(String[] args) {
        Node<Integer> a = new Node<>(5,new Node<>(4),null);
        Node<Integer> b = new Node<>(5,new Node<>(3),a);
        Node<Integer> c = new Node<>(5,new Node<>(3),b);
        Node<Integer> temp = a;
        while(temp != null){
            System.out.println();
        }
    }
}
