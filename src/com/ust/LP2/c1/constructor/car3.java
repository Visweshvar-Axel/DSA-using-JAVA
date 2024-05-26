package com.ust.LP2.c1.constructor;

public class car3 {
    String name;

    car3(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        car3 car3 = new car3("BMW");
        System.out.println("car3: "+car3.name);
    }
}
