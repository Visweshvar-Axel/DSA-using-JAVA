package com.ust.LP6.c3_DESIGN_PATTERN.Decorator.a8;

public class Main1 {
    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich.Builder()
                                .setBread("Whole Wheat")
                                .setVegetables("Lettuce, Tomato")
                                .setMeats("Chicken, Bacon")
                                .setSauces("Mayo, Mustard")
                                .build();

        System.out.println(sandwich);
    }
}
