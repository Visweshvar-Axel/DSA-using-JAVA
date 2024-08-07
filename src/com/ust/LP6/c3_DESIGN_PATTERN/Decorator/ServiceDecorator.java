package com.ust.LP6.c3_DESIGN_PATTERN.Decorator;

public abstract class ServiceDecorator implements Service{
    Service service;

    public ServiceDecorator(Service service) {
        this.service = service;
    }
}
