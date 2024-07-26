package com.ust.LP6.c3_DESIGN_PATTERN.Decorator.a7;

public class DarkButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering dark theme button.");
    }
}
