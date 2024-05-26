package com.ust.LP2.c1.exceptions;
class AgeBelowException extends Exception{

    private static final long serialVersionUID = 1246524410975209203L;

    AgeBelowException(String s){super(s);}
}
public class UserDefinedException {
    static void validate(int age) throws AgeBelowException {
        if (age < 18) throw new AgeBelowException("Age is not enough");
        else System.out.println("Welcome to vote");
    }
    public static void main(String[] args) {
        try {
            validate(15);
        } catch (AgeBelowException e) {
            System.out.println(e);
        }
    }
}
