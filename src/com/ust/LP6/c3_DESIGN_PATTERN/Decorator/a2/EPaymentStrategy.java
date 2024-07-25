package com.ust.LP6.c3_DESIGN_PATTERN.Decorator.a2;

import java.util.Scanner;

public class EPaymentStrategy implements PaymentStrategy {
    private String cashCardName;
    private String cardNumber;
    private String expiryDate;

    @Override
    public double calculateFinalAmount(double billAmount) {
        return billAmount + (billAmount * 0.05);
    }

    @Override
    public void collectPaymentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Cash Card Name (e.g., PayPal, Paytm): ");
        cashCardName = scanner.nextLine();
        System.out.print("Enter Card Number: ");
        cardNumber = scanner.nextLine();
        System.out.print("Enter Expiry Date (MM/YY): ");
        expiryDate = scanner.nextLine();
    }
}
