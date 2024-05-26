package com.ust.LP2.c1.classes;

public class Dog {
    String name; //instance variable
    String color;
    static int noOtLegs = 4; //static variable
    boolean isBarking(){
        boolean barking = true; //local variable
        return barking;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();  //creating object
        dog.name = "rick";
        dog.color = "black";
        System.out.println("pet: "+ dog.name);
        System.out.println("pet color: "+ dog.color);
    }
}
