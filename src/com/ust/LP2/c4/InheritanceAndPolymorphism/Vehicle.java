package com.ust.LP2.c4.InheritanceAndPolymorphism;

public class Vehicle {
    private String make;
    private String model;
    public Vehicle() {
    }
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void startEngine() {
        System.out.println("worrr... worrr...");
    }
}
