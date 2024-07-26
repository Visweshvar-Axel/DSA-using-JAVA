package com.ust.LP6.c3_DESIGN_PATTERN.Decorator.a6;

public class MageFactory implements CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Mage();
    }
}
