package com.ust.LP4.c2.AbstractDatatype;

public class StackImplArray<E> implements Stack<E> {
    protected E[] array;
    int top = -1;

    public StackImplArray(int size) {
        array = (E[]) new Object[size];
    }

    @Override
    public void push(E value) {
        if (top == array.length-1) {throw new RuntimeException("No more space in the stack");}
        array[++top] = value;
    }

    @Override
    public E pop() {
        if (top == -1) {throw new RuntimeException("The stack is empty");}
        return array[top--];
    }

    @Override
    public E peek() {
        if (top == -1) {throw new RuntimeException("The stack is empty");}
        return array[top];
    }

    public static void main(String[] args) {
        Stack<Integer> store = new StackImplArray<>(4);
        store.push(4);
        store.push(6);
        store.push(1);
        store.push(9);

        System.out.println(store.pop());
        System.out.println(store.pop());
        System.out.println(store.pop());
        System.out.println(store.pop());

        System.out.println(store.peek());
    }
}
