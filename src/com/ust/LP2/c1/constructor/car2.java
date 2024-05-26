package com.ust.LP2.c1.constructor;
/* *
* constructor with no parameter
* */
public class car2 {
    String name;

    car2(){
        name="BMW";
    }
    public static void main(String[] args) {
        car2 car2 = new car2();
        System.out.println("car2: "+car2.name);
    }
}
