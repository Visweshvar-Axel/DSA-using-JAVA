package com.ust.LP6.c3_DESIGN_PATTERN.Decorator.a6;

public class Warrior implements Character {
    @Override
    public void attack() {
        System.out.println("Warrior attacks with a sword!");
    }

    @Override
    public void defend() {
        System.out.println("Warrior defends with a shield!");
    }
}
