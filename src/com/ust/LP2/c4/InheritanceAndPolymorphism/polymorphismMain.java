package com.ust.LP2.c4.InheritanceAndPolymorphism;

public class polymorphismMain {
    public static void main(String[] args) {
        Vehicle toyota = new Car("toyota","1332");
        Car ford = new Car("ford","1333");
        Motorcycle honda = new Motorcycle("honda","1333");
        System.out.println(toyota.toString());
        toyota.startEngine();
        System.out.println(ford.toString());
        ford.startEngine();
        System.out.println(honda.toString());
        honda.startEngine();
    }
}
