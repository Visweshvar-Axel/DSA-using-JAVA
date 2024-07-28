package com.ust.LP6.c6_MODULAR.NestedClasses;

public class CarParts {
    public CarParts(){
        System.out.println("CarParts");
    }
    public static class Wheel {
        public Wheel(){
            System.out.println("Wheel");
        }
    }
}
