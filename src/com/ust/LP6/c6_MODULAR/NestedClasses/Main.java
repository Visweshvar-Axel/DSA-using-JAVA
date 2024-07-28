package com.ust.LP6.c6_MODULAR.NestedClasses;

public class Main {
    public static void main(String[] args) {
        Age ageInt = new AgeClass();
        ageInt.PrintAge();
        Age age = new Age() {

            @Override
            public void PrintAge() {
                System.out.println("My actual age is 26");
            }
        };
        age.PrintAge();

        CarParts carParts = new CarParts();
        CarParts.Wheel wheel = new CarParts.Wheel();
    }
}
