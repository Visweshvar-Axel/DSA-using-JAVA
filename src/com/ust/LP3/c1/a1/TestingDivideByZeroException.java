package com.ust.LP3.c1.a1;

public class TestingDivideByZeroException {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        // TODO: Implement exception handling for divide by zero
        try {
            int result = divideNumbers(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    private static int divideNumbers(int numerator, int denominator) {
        // TODO: Implement exception handling for divide by zero
        return numerator / denominator;
    }
}
