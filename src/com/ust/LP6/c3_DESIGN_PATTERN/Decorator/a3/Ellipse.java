package com.ust.LP6.c3_DESIGN_PATTERN.Decorator.a3;

public class Ellipse implements Shape {
    private double longRadius;
    private double shortRadius;

    public Ellipse(double longRadius, double shortRadius) {
        this.longRadius = longRadius;
        this.shortRadius = shortRadius;
    }

    @Override
    public double perimeterCalculation() {
        return Math.PI * (3 * (longRadius + shortRadius) - Math.sqrt((3 * longRadius + shortRadius) * (longRadius + 3 * shortRadius)));
    }

    @Override
    public double areaCalculation() {
        return Math.PI * longRadius * shortRadius;
    }
}
