package com.ust.LP2.c4.AbstractionAndInterfaces;

public class Rectangle implements Shape{
    private int length, breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length*breadth;
    }

    @Override
    public void displayShapeInfo() {
        System.out.println("length: "+length+"\nbreadth: "+breadth);
    }
}
