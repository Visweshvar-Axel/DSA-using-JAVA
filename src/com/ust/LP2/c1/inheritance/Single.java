package com.ust.LP2.c1.inheritance;

public class Single {
    public static class Animal{
        protected String color;
        public Animal(String color){
            this.color = color;
        }
        public void makeSound(){
            System.out.println("******");
        }
    }
    public static class Cat extends Animal{
        String name;
        public Cat(String name,String color){
            super(color);
            this.name = name;
        }
        @Override
        public void makeSound(){
            System.out.println("meow.....");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal("red");
        Cat cat = new Cat("atiya","white");
        System.out.println("Anumal color:"+animal.color);
        System.out.println("cat name:"+cat.name);
        System.out.println("cat color:"+cat.color);
    }
}
