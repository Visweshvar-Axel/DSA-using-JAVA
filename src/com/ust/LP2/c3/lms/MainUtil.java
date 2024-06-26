package com.ust.LP2.c3.lms;

import java.util.List;

public class MainUtil {
    public static void main(String[] args) throws NotEnoughBooksException, BookNotFoundException {
        Book obj1 = new Book("A-z1","Java","Viswa",100,5,"program");
        Book obj2 = new Book("asd","python","Axel",50,3,"program");
        Library lb = new Library();
        lb.setlName("ViswaLib");
        lb.setAddress("Salem");
        lb.addBook(obj1);
        lb.addBook(obj2);
        SerializationHandler sh = new SerializationHandler();
        sh.serializeLibrary(lb,"library.txt");
        Library dt1 = sh.deserializeLibrary("library.txt");
        System.out.println(dt1.displayAvailableBook());
        System.out.println("____________________________________________");
        for (int i = 0 ; i < lb.displayAvailableBook().size(); i++){
            Book dt = lb.displayAvailableBook().get(i);
            System.out.println(dt.toString());
        }
        System.out.println("____________________________________________");
        //search by author
        String author = "Viswa";
        List<Book> sa = lb.searchByAuthor(author);
        if (sa.size() <= 0 ) {
            throw new BookNotFoundException("The book is not available");
        } else {
            System.out.println(sa);
        }
        //search by genre
        String genre = "program";
        List<Book> lg = lb.searchByAuthor(genre);
        if (sa.size() <= 0 ) {
            throw new BookNotFoundException("The book is not available");
        } else {
            System.out.println(sa);
        }
        //remove book by ISBN
        String isbn = "A-z1";
        lb.removeBook(isbn);
        //borrow book
        Member mb = new Member();
        mb.setID(1);
        mb.setName("viswa");
        mb.setQnty(1);
        String bisbn = "asd";
        for (int i = 0; i < lb.displayAvailableBook().size(); i++) {
            Book bk = lb.displayAvailableBook().get(i);
            if(mb.getQnty() < bk.getAvailability()) {
                mb.borrowBook(bisbn);
            }
            else {
                throw new NotEnoughBooksException(bisbn+" not enough books");
            }
        }
        //display borrow book
        System.out.println(mb.displayBorrowedBook());
        //return book
        mb.returnBook(bisbn);
    }
}
