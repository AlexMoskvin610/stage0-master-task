package com.epam.OOP;

public class AnimalMain {

    public static void main(String[] args) {
        var dog = new Dog();
        var bird = new Bird();

        System.out.println(dog.getDescription());
        System.out.println(bird.getDescription());
    }
}
