package com.ust.LP6.c3_DESIGN_PATTERN.Decorator;

public class Guest implements Service{
    @Override
    public String getDescription() {
        return "Guest ov the services\n";
    }

    @Override
    public int getCost() {
        return 15;
    }
}
