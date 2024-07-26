package com.ust.LP6.c3_DESIGN_PATTERN.Decorator;

public class OneToOneTraining extends ServiceDecorator{
    public OneToOneTraining(Service service) {
        super(service);
    }

    @Override
    public String getDescription() {
        return super.service.getDescription()+"OneToOneTraining service\n";
    }

    @Override
    public int getCost() {
        return super.service.getCost()+50;
    }
}
