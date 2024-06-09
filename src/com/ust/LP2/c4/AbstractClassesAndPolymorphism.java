package com.ust.LP2.c4;
abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " : meow");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " : wool!");
    }
}
public class AbstractClassesAndPolymorphism {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("atiya"),
                new Cat("jeeni"),
                new Cat("sham")
        };

        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
