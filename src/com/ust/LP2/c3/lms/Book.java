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
    public String getISBN() {
        return ISBN;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPrice() {
        return price;
    }
    public int getAvailability() {
        return availability;
    }
    public String getGenre() {
        return genre;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
