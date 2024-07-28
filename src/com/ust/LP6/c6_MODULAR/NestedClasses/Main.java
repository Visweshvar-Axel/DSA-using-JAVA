package com.ust.LP6.c6_MODULAR.NestedClasses;

public class Main {
    public static void main(String[] args) {
        age.PrintAge();
    }
    static Age age = new Age() {

        @Override
        public void PrintAge() {
            System.out.println("My actual age is 26");
        }
    };
}
