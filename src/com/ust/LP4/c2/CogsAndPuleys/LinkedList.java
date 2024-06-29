package com.ust.LP4.c2.CogsAndPuleys;

public class LinkedList<E> implements Iterable<E> {
    int length = 0;
    Node<E>[] lastModifiedNode;
    Node<E> first;
    Node<E> last;
    public static class Node<E>{
        protected E value;
        protected Node next;

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
    public Node<E> appendFirst(E value){
        Node node = getNewNode();
        node.value = value;
        node.next = first;
        first = node;
        if(length==0) last = node;
        length++;
        return node;
    }
    public Node<E> appendLast(E value) {
        Node node = getNewNode();
        node.value = value;
        if (last!=null){
            last.next=node;
            last=node;
        }
        if (first==null){
            first=node;
        }
        length++;
        return node;
    }
    protected Node<E> getNewNode(){
        Node<E> node = new Node<>();
        lastModifiedNode = new Node[]{node};
        return node;
    }
    //insert function ref vdo
    //findAt function ref vdo
    //removeAt function ref vdo
}
