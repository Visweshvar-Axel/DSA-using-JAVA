package com.ust.LP2.c1.abstraction;
abstract class Calculator{
    abstract void add();
    void mul(){
        System.out.println("1*1 = "+1*1);
    }
}
class MyCal extends Calculator{
    @Override
    void add(){
        System.out.println("1+1 = "+(1+1));
    }
}
public class Calculatorabstract {

}
