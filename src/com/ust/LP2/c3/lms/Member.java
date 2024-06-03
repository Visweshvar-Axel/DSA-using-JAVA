package com.ust.LP2.c3.lms;

import java.util.List;

public class Member extends Library{
    private int ID;
    private String name;
    private List<Book> borrowedBooks;
    private int qnty;

    public int getID() {
        return ID;
    }
}
