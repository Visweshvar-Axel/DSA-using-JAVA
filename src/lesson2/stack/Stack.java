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
        Stack<String> s = new Stack<>();
        System.out.println(s.isEmpty());
        s.push("viswa");
        s.push("axel");
        s.push("1");
        s.push("2");
        s.push("3");
        s.push("4");
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.push("7");
        System.out.println(s.pop());
    }
}
