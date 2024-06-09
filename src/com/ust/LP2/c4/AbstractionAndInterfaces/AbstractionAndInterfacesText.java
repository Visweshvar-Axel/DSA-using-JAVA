package com.ust.LP2.c4.AbstractionAndInterfaces;

public class AbstractionAndInterfacesText {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        System.out.println("area of circle: "+s1.calculateArea());
        Shape s2 = new Rectangle(5,10);
        System.out.println("area of rectangle: "+s2.calculateArea());
    }
}
