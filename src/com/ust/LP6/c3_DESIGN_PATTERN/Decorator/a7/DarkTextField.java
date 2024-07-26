package com.ust.LP6.c3_DESIGN_PATTERN.Decorator.a7;

public class DarkTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Rendering dark theme text field.");
    }
}
