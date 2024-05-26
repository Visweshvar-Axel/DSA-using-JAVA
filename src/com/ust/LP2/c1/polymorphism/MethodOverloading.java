package com.ust.LP2.c1.polymorphism;

public class MethodOverloading {
    public static class Calculator{
        int addNum(int a, int b){
            return a+b;
        }
        int addNum(int a, int b, int c){
            return a+b+c;
        }

        int mulNum(int a, int b){
            return a*b;
        }
        double mulNum(double a, double b){
            return a*b;
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.addNum(1,1));
        System.out.println(calculator.addNum(1,1,1));
        System.out.println(calculator.mulNum(5,5));
        System.out.println(calculator.mulNum(2.2,5.5));
    }
}
