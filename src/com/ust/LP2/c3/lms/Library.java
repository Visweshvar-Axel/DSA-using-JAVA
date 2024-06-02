package com.ust.LP2.c3.lms;

import java.util.List;

public class Library {
    private List<Book> listBooks;
    private String lName;
    private String address;
    public Library() {
    }
    public Library(List<Book> listBooks, String lName, String address) {
        this.listBooks = listBooks;
        this.lName = lName;
        this.address = address;
    }
    public List<Book> getListBooks() {
        return listBooks;
    }
    public String getlName() {
        return lName;
    }
    public String getAddress() {
        return address;
    }
    public void setListBooks(List<Book> listBooks) {
        this.listBooks = listBooks;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
