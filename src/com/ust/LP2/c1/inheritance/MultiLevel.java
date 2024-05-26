package com.ust.LP2.c1.inheritance;

public class MultiLevel {
    public static class Vehicle{
        String name;
        public Vehicle(){name="BMW"}
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
    public
}
