package com.ust.LP2.c1.inheritance;

public class Hierarchical {
    public static class Vehicle{
        String name;
        public Vehicle(){name="BMW";}
        public void Sound(){
            System.out.println("peem peem");
        }
    }
    public static class Bike extends Vehicle {
        public Bike(String name){
            this.name = name;
        }
        @Override
        public void Sound(){
            System.out.println("pim pim");
        }
    }
    public static class Cycle extends Vehicle {
        public Cycle(String name) {
            this.name = name;
        }
        @Override
        public void Sound(){
            System.out.println("tring tring");
        }
    }

    public static void main(String[] args) {
        MultiLevel.Vehicle vehicle = new MultiLevel.Vehicle();
        MultiLevel.Bike bike = new MultiLevel.Bike("Honda");
        MultiLevel.Cycle cycle = new MultiLevel.Cycle("FF");
        System.out.println("bike:"+bike.name);
        System.out.println("cycle:"+cycle.name);
        vehicle.Sound();
        bike.Sound();
        cycle.Sound();
    }
}
