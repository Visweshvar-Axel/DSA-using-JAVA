package com.ust.LP6.c3_DESIGN_PATTERN.Decorator.a7;

public class DarkThemeFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public TextField createTextField() {
        return new DarkTextField();
    }
}
