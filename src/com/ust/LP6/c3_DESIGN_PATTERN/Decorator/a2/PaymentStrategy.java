package com.ust.LP6.c3_DESIGN_PATTERN.Decorator.a2;

public interface PaymentStrategy {
    double calculateFinalAmount(double billAmount);
    void collectPaymentDetails();
}
