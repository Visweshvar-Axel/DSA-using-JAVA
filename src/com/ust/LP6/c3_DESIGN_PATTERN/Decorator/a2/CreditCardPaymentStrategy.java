package com.ust.LP6.c3_DESIGN_PATTERN.Decorator.a2;

import java.util.Scanner;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    private String cardNumber;
    private String expiryDate;

    @Override
    public double calculateFinalAmount(double billAmount) {
        return billAmount;
    }

    @Override
    public void collectPaymentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Credit Card Number: ");
        cardNumber = scanner.nextLine();
        System.out.print("Enter Expiry Date (MM/YY): ");
        expiryDate = scanner.nextLine();
    }
}
