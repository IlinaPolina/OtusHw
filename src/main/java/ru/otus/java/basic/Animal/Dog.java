package ru.otus.java.basic.Animal;

public class Dog extends Animal {
    public Dog (String name, int speed, int speedSwimmer, int endurance) {
        this.name = name;
        this.speed = speed;
        this.speedSwimmer = speedSwimmer;
        this.endurance = endurance;
    }
    @Override
    public void swimmingEndurance() {
        int distance = endurance - 2;
        System.out.println("Проплыть один метр, выносливость:" + distance);

    }
}
