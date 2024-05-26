package com.ust.LP2.c1.interfaces;
interface Animal{
    void sound();
}
public class InterfaceExample implements Animal {
    public void sound(){
        System.out.println("Interface method implemented");
    }
    public static void main(String[] args) {
        Animal cat = new InterfaceExample();
        cat.sound();
    }
}
