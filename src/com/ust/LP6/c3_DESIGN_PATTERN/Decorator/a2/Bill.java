package com.ust.LP6.c3_DESIGN_PATTERN.Decorator.a2;

import java.util.ArrayList;
import java.util.List;

public class Bill {
    private Integer billNumber;
    private String customerName;
    private List<Order> orderList = new ArrayList<>();
    private Double billAmount;
    private Double finalAmount;
    private PaymentStrategy paymentStrategy;

    public Bill(Integer billNumber, String customerName) {
        this.billNumber = billNumber;
        this.customerName = customerName;
    }

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public void calculateBillAmount() {
//        billAmount = orderList.stream().mapToDouble(order -> order.getPrice() * order.getOrderedQuantity()).sum();
    }

    public void applyPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
        this.paymentStrategy.collectPaymentDetails();
        this.finalAmount = this.paymentStrategy.calculateFinalAmount(billAmount);
    }

    // Getters and setters

    public Integer getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(Integer billNumber) {
        this.billNumber = billNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public Double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(Double billAmount) {
        this.billAmount = billAmount;
    }

    public Double getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(Double finalAmount) {
        this.finalAmount = finalAmount;
    }
}
