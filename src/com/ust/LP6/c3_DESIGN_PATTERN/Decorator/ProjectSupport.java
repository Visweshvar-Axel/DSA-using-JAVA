package com.ust.LP6.c3_DESIGN_PATTERN.Decorator;

public class ProjectSupport extends ServiceDecorator{
    public ProjectSupport(Service service) {
        super(service);
    }

    @Override
    public String getDescription() {
        return super.service.getDescription()+"ProjectSupport service\n";
    }

    @Override
    public int getCost() {
        return super.service.getCost()+60;
    }
}
