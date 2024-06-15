package com.ust.LP3.c1;
class CurrencyDoNotMatchException extends Exception {
    public CurrencyDoNotMatchException(String message) {
        super(message);
    }
}
class Amount {
    private String currency;
    private int amount;
    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }
    public void add (Amount that) throws CurrencyDoNotMatchException {
        if (!that.currency.equals(this.currency))
//            throw new Exception("currency not match "+this.currency+" & "+that.currency);
            throw new  CurrencyDoNotMatchException("currency not match "+this.currency+" & "+that.currency);
        this.amount = this.amount + that.amount;
    }
    @Override
    public String toString() {
        return "Amount{" +  "currency='" + currency + '\'' + ", amount=" + amount + '}';
    }
}
public class ThrowingExceptionRunner {
    public static void main(String[] args) throws CurrencyDoNotMatchException {
        Amount amount1 = new Amount("USD",10);
        Amount amount2 = new Amount("ERO",20);
        amount1.add(amount2);
        System.out.println(amount1);
    }
}
