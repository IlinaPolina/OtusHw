package ru.otus.java.basic.Animal;

public abstract class Animal {
    String name;
    int speed;
    int speedSwimmer;
    int endurance = 100;

    public Animal() {
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeedSwimmer() {
        return speedSwimmer;
    }

    public void setSpeedSwimmer(int speedSwimmer) {
        this.speedSwimmer = speedSwimmer;
    }

    public int getEndurance() {
        return endurance;
    }

    public void infoCat () {
        System.out.println("Name:"+ name + " " + "Speed:"+ speed + " " + "SpeedSwimmer:" + speedSwimmer + " " + "endurance:" + endurance);
    }
    public void infoDog () {
        System.out.println("Name:"+ name + " " + "Speed:"+ speed + " " + "SpeedSwimmer:" + speedSwimmer + " " + "endurance:" + endurance);
    }
    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }
    public void runningEndurance () {
        int distance = endurance - 1;
        System.out.println("Пробежать один метр, выносливость:" + distance);
    }
    public abstract void swimmingEndurance();
}
