package com.ust.LP2.c3.lms;

public class BookNotFoundException extends Exception {
    private static final long serialVersionUID = -2934943317481636132L;

    public BookNotFoundException(String message) {
        super(message);
    }
}
