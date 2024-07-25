package com.ust.LP6.c3_DESIGN_PATTERN.Decorator.a3;

public class ShapeFactory {

    public static Shape getShapeFactory(double radius) {
        return new Circle(radius);
    }

    public static Shape getShapeFactory(double longRadius, double shortRadius) {
        return new Ellipse(longRadius, shortRadius);
    }
}
