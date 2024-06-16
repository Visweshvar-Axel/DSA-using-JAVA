package com.ust.LP3.c1.a3;
class NegativeIntegerException extends Exception{
    public NegativeIntegerException(String message) {
        super(message);
    }
}
public class TestCustomExceptionExample {
    public static void main(String[] args) {
        int userInput = -5;
        try {
            validateInput(userInput);
        } catch (NegativeIntegerException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
    }
    private static void validateInput(int input) throws NegativeIntegerException {
        if (input < 0) {
            throw new NegativeIntegerException("Input cannot be negative");
        }
    }
}
