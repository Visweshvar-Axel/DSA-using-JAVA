package com.ust.LP4.c3;

import com.ust.LP4.c2.AbstractDatatype.StackImplLinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

    }
    class LinkedListNode<E> {
        private E val;
        private LinkedListNode next;

        public LinkedListNode(E val) {
            this.val = val;
        }
    }
}
