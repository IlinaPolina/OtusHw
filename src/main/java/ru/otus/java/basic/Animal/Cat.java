package ru.otus.java.basic.Animal;

public class Cat extends Animal {
    public Cat(String name, int speed, int speedSwimmer, int i) {
        this.name = name;
        this.speed = speed;
        this.speedSwimmer = speedSwimmer;
        this.endurance = endurance;
    }
    public void meow () {
        System.out.println(name + " meow");
    }

    @Override
    public void swimmingEndurance() {
        int distance = endurance - 2;
        System.out.println("Проплыть один метр:" + distance);

    }
}

