package com.ust.LP6.c3_DESIGN_PATTERN.Decorator.a6;

public class Archer implements Character {
    @Override
    public void attack() {
        System.out.println("Archer shoots an arrow!");
    }

    @Override
    public void defend() {
        System.out.println("Archer dodges the attack!");
    }
}
