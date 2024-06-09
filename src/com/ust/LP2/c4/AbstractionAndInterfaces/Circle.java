package com.ust.LP2.c4.AbstractionAndInterfaces;

public class Circle implements Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public void displayShapeInfo() {
        System.out.println("radius: "+radius);
    }
}
