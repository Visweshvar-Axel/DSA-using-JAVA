package com.ust.LP2.c3.lms;

public class Book {
    private String ISBN;
    private String title;
    private String author;
    private int price;
    private int availability;
    private String genre;

    public Book() {
    }

    public Book(String ISBN, String title, String author, int price, int availability, String genre) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
        this.genre = genre;
    }
}
