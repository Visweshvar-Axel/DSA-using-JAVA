package com.ust.LP2.c1.exceptions;

public class ThrowKay {
    static void validate(int age) {
        if (age < 18) throw new ArithmeticException("Age is not enough");
        else System.out.println("Welcome to vote");
    }

    public static void main(String[] args) {
        validate(15);
    }
}
