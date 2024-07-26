package com.ust.LP6.c3_DESIGN_PATTERN.Decorator.a6;

public class Mage implements Character {
    @Override
    public void attack() {
        System.out.println("Mage casts a fireball!");
    }

    @Override
    public void defend() {
        System.out.println("Mage creates a magical barrier!");
    }
}
