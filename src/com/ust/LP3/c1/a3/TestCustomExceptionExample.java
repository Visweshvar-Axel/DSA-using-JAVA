package com.ust.LP3.c1.a3;
class CustomException extends Exception{
    public CustomException(String message) {
        super(message);
    }
}
public class TestCustomExceptionExample {
    public static void main(String[] args) {
        int userInput = -5;
        try {
            validateInput(userInput);
        } catch (CustomException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
    }
    private static void validateInput(int input) throws CustomException {
        if (input < 0) {
            throw new CustomException("Input cannot be negative");
        }
    }
}
