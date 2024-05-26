package com.ust.LP2.c1.exceptions;

public class ThrowsKey {
    void m() throws ArithmeticException {
        throw new ArithmeticException("Throws keyword");
    }
    void n() throws ArithmeticException {
        m();
    }
    void o(){
        try {
            m();
        } catch (ArithmeticException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        ThrowsKey throwsKey = new ThrowsKey();
        throwsKey.o();
    }
}
