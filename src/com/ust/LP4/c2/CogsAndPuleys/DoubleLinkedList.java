package com.ust.LP4.c2.CogsAndPuleys;

public class DoubleLinkedList<E> extends LinkedList<E> {
    public static class Node<E>{
        protected E value;
        protected LinkedList.Node next;
        protected LinkedList.Node previous;

        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
        }

        public LinkedList.Node getNext() {
            return next;
        }

        public void setNext(LinkedList.Node next) {
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
        Node<Integer> a = new
    }
}
