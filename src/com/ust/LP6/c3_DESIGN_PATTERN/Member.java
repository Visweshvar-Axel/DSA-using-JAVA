package com.ust.LP6.c3_DESIGN_PATTERN;

public class Member implements Service{
    @Override
    public String getDescription() {
        return "Member ov the services\n";
    }

    @Override
    public int getCost() {
        return 5;
    }
}
