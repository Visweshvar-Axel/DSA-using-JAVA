package com.ust.LP3.c1.a1;
class DivideByZeroException extends InterruptedException {
    private static final long serialVersionUID = -970355221119941777L;

    public DivideByZeroException() {
    }
    public DivideByZeroException(String message) {
        super(message);
    }
}
public class TestingDivideByZeroException {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        // TODO: Implement exception handling for divide by zero
        int result = 0;
        try {
            result = divideNumbers(numerator, denominator);
        } catch (DivideByZeroException e) {
            e.printStackTrace();
        }
        System.out.println("Result: " + result);
    }
    private static int divideNumbers(int numerator, int denominator) throws DivideByZeroException {
        // TODO: Implement exception handling for divide by zero
        try {
            return numerator / denominator;
        } catch (ArithmeticException e) {
            throw new DivideByZeroException("0 can be numerator");
        }
    }
}
