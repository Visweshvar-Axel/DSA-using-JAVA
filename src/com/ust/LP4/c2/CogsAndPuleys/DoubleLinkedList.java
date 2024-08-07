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
        public Node(E value, Node next) {
            this.value = value;
            this.next = next;
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

        public Node setNext(Node next) {
            this.next = next;
            return this;
        }

        public Node setPrevious(Node previous) {
            this.previous = previous;
            return this;
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
        Node<Integer> a = new Node<>(5,new Node(6,new Node(7)));
        Node<Integer> b = new Node<>(4);
        Node<Integer> c = new Node<>(3);
        Node<Integer> d = new Node<>(2);
        Node<Integer> e = new Node<>(1);
        a.setPrevious(b.setPrevious(c.setPrevious(d.setPrevious(e.setNext(d.setNext(c.setNext(b.setNext(a))))))));
        Node<Integer> temp = e;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
