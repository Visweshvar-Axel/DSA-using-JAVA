package com.ust.LP2.c3.lms;

public class NotEnoughBooksException extends Exception{
    private static final long serialVersionUID = 1660495612304903136L;

    public NotEnoughBooksException(String message) {
        super(message);
    }
}
