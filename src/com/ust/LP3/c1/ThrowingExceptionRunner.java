package com.ust.LP3.c1;
class Amount {
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }
    public void add (Amount that) {
        this.amount = this.amount + that.amount;
    }
    @Override
    public String toString() {
        return "Amount{" +
                "currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}
public class ThrowingExceptionRunner {
    public static void main(String[] args) {

    }
}
