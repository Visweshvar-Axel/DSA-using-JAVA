package com.ust.LP2.c3.lms;

public class MainUtil {
    public static void main(String[] args) {
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
        for (int i = 0 ; i < lb.displayAvailableBook().size(); i++)
        System.out.println("____________________________________________");
    }
}
