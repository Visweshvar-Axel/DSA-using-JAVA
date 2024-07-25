package com.ust.LP6.c3_DESIGN_PATTERN.Decorator.a2;

public class Main {
    public static void main(String[] args) {
        Bill bill = new Bill(1, "John Doe");

        Order order1 = new Order(1, "Laptop", 1000.0, 1.0);
        Order order2 = new Order(2, "Smartphone", 500.0, 2.0);

        bill.addOrder(order1);
        bill.addOrder(order2);

        bill.calculateBillAmount();
        System.out.println("Bill Amount: " + bill.getBillAmount());

        PaymentStrategy paymentStrategy = new CreditCardPaymentStrategy();
        bill.applyPaymentStrategy(paymentStrategy);

        System.out.println("Final Amount: " + bill.getFinalAmount());
    }
}
