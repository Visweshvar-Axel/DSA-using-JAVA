package com.ust.LP2.c3.lms;

import java.util.ArrayList;
import java.util.List;

public class Member extends Library{
    private int ID;
    private String name;
    private List<Book> borrowedBooks;
    private int qnty;
    Library lb = new Library();
    public Member() {
        Book obj1 = new Book("A-z1","Java","Viswa",100,5,"program");
        Book obj2 = new Book("asd","python","Axel",50,3,"program");
        lb.addBook(obj1);
        lb.addBook(obj2);
    }
    public Member(int ID, String name, List<Book> borrowedBooks, int qnty) {
        this.ID = ID;
        this.name = name;
        this.borrowedBooks = borrowedBooks;
        this.qnty = qnty;
    }
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
    public int getQnty() {
        return qnty;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
    public void setQnty(int qnty) {
        this.qnty = qnty;
    }
    public void borrowBook(String ISBN){
        borrowedBooks = new ArrayList<>();
        for (Book b: lb.displayAvailableBook()){
            if (ISBN.equals(b.getISBN())){
                borrowedBooks.add(b);
            }
        }
    }
    public void returnBook(String ISBN) {
        List<Book> lbb = displayBarrowedBook();
        for (Book b: lbb){
            if (b.getISBN().equals(ISBN)){
                lbb.remove(b);
                System.out.println("Successfully returned book"+ISBN);
                break;
            }
        }
    }
}
