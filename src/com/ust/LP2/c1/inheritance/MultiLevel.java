package com.ust.LP2.c1.inheritance;

public class MultiLevel {
    public static class Vehicle{
        String name;
        public Vehicle(){name="BMW";}
        public void Sound(){
            System.out.println("peem peem");
        }
    }
    public static class Bike extends Vehicle{
        public Bike(String name){
            this.name = name;
        }
        @Override
        public void Sound(){
            System.out.println("pim pim");
        }
    }
    public static class Cycle extends Bike{
        public Cycle(String name) {
            super(name);
        }
        @Override
        public void Sound(){
            System.out.println("tring tring");
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Bike bike = new Bike("Honda");
        Cycle cycle = new Cycle("FF");
        System.out.println("bike:"+bike.name);
        vehicle.Sound();
        bike.Sound();
        cycle.Sound();
    }
}
