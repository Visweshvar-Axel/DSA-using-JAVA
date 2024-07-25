package com.ust.LP6.c3_DESIGN_PATTERN.Decorator.a3;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeterCalculation() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double areaCalculation() {
        return Math.PI * radius * radius;
    }
}
