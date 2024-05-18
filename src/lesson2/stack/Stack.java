package lesson2.stack;
import lesson2.LinkedList.LinkedListNode;

import java.util.Optional;

public class Stack<V> {
    private LinkedListNode<V> head;
    public Stack(){
        head=null;
    }
    public void push(V item){
        LinkedListNode<V> node = new LinkedListNode<>(item, null);
        Optional.ofNullable(head).ifPresent(n -> n.setNext(node));
        head = node;
    }
    public Optional<V> pop(){
        Optional<LinkedListNode<V>> node = Optional.ofNullable(head);
        head = node.flatMap(LinkedListNode::getNext).orElse(null);
        Optional.ofNullable(head).ifPresent(n -> n.setNext(null));
        return node.map(LinkedListNode::getValue);
    }
    public String peek(){
        return head.toString();
    }
    public boolean isEmpty(){
        if (head == null) return true;
        else return false;
    }
    public static void main(String[] args) {

    }
}
