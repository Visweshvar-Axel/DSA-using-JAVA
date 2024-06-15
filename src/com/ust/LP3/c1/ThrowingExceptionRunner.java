package com.ust.LP3.c1;
class Amount {
    private String currency;
    private int amount;
    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }
    public void add (Amount that) throws Exception {
        if (!that.currency.equals(this.currency))
            throw new Exception("currency not match");
        this.amount = this.amount + that.amount;
    }
    @Override
    public String toString() {
        return "Amount{" +  "currency='" + currency + '\'' + ", amount=" + amount + '}';
    }
}
public class ThrowingExceptionRunner {
    public static void main(String[] args) throws Exception {
        Amount amount1 = new Amount("USD",10);
        Amount amount2 = new Amount("ERO",20);
        amount1.add(amount2);
        System.out.println(amount1);
    }
}
