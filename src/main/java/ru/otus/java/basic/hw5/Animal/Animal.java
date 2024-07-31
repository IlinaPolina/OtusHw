package ru.otus.java.basic.hw5.Animal;

public abstract class Animal {
    String name;
    int speed;
    int speedSwimmer;
    int endurance;

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
    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }
    public void infoCat () {
        System.out.println("Name: "+ name + " " + "Speed: "+ speed + " " + "SpeedSwimmer: " + speedSwimmer + " " + "endurance: " + endurance);
    }
    public void infoDog () {
        System.out.println("Name: "+ name + " " + "Speed: "+ speed + " " + "SpeedSwimmer: " + speedSwimmer + " " + "endurance: " + endurance);
    }
    public void infoHorse () {
        System.out.println("Name: "+ name + " " + "Speed: "+ speed + " " + "SpeedSwimmer: " + speedSwimmer + " " + "endurance: " + endurance);
    }

    public void run (int distance) {
        int remains = endurance - distance;
        float time = (float) distance /speed;
        if (distance > endurance) {
            System.out.println("У животного появилось состояние усталости");
            System.out.println("Время в пути: -1");
        }
        else {
            System.out.println("Животное пробежало: " + distance + " м., остаток выносливости: " + remains);
            System.out.println("Время в пути: " + time + " сек.");
        }
    }
    public abstract void swim(int distance);

}
