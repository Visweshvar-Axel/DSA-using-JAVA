package com.ust.LP4.c2.AbstractDatatype;

public class StackImplLinkedList<E> implements Stack<E> {
    public class LinkedListNode<E> {
        private E value;
        private LinkedListNode next;

        public LinkedListNode() {
            value = null;
            next = null;
        }

        public LinkedListNode(E value) {
            this.value = value;
            next = null;
        }

        public LinkedListNode(E value, LinkedListNode next) {
            this.value = value;
            this.next = next;
        }
    }
    protected LinkedListNode<E> head = null;
    protected LinkedListNode<E> list = null;
    @Override
    public void push(E value) {
        if (head == null) {
            list = new LinkedListNode<>(value);
            head = list;
        } else {
            list.next = new LinkedListNode(value);
            list = list.next;
        }
    }
    @Override
    public E pop() {
        if (head != null){
            E value = list.value;
            LinkedListNode temp = head;
            if (head == list) {
                head = null;
                list = null;
                return value;
            }
            while(temp.next == list) {
                temp = temp.next;
            }
            temp.next = null;
            list = temp;
            return value;
        } else return null;
    }

    @Override
    public E peek() {
        if (head == null) return null;
        return list.value;
    }

    public static void main(String[] args) {

    }
}
