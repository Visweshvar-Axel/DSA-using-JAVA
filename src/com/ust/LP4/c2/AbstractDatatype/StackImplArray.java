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
        return array[top];
    }
}
