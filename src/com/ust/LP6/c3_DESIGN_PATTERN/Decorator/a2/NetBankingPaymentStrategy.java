package com.ust.LP6.c3_DESIGN_PATTERN.Decorator.a2;

import java.util.Scanner;

public class NetBankingPaymentStrategy implements PaymentStrategy {
    private String bankName;
    private String accountNumber;
    private String ifscCode;

    @Override
    public double calculateFinalAmount(double billAmount) {
        return billAmount + (billAmount * 0.025);
    }

    @Override
    public void collectPaymentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Bank Name: ");
        bankName = scanner.nextLine();
        System.out.print("Enter Account Number: ");
        accountNumber = scanner.nextLine();
        System.out.print("Enter IFSC Code: ");
        ifscCode = scanner.nextLine();
    }
}
