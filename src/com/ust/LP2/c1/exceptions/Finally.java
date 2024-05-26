package com.ust.LP2.c1.exceptions;

public class Finally {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally will always executed");
        }
    }
}
