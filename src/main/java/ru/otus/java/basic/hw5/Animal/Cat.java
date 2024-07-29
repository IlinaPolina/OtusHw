package ru.otus.java.basic.hw5.Animal;

public class Cat extends Animal {
    public Cat(String name, int speed, int speedSwimmer, int endurance) {
        this.name = name;
        this.speed = speed;
        this.speedSwimmer = speedSwimmer;
        this.endurance = endurance;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать:)");
    }
}

