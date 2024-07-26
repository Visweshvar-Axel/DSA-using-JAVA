package com.ust.LP6.c3_DESIGN_PATTERN.Decorator.a7;

public class LightThemeFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public TextField createTextField() {
        return new LightTextField();
    }
}
