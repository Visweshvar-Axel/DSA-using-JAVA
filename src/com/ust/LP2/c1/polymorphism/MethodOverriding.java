package com.ust.LP2.c1.polymorphism;

public class MethodOverriding {
    public static class Vehicle{
        String color;
        protected Vehicle(String color){this.color = color;}
        void run(){
            System.out.println("Running...!");
        }
    }
    public static class Bike extends Vehicle{
        private String name;
        public Bike(String name, String color){
            super(color);
            this.name = name;
            //this.color = color;
        }
        @Override
        void run(){
            System.out.println("my "+this.name+" is Running...!");
        }
    }
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("red");
        Bike bike = new Bike("BMW","Black");
        System.out.println("vehicle color:"+vehicle.color);
        System.out.println("bike name:"+bike.name);
        vehicle.run();
        System.out.println("bike color:"+bike.color);
        bike.run();
    }
}
