package ru.otus.java.basic;

import ru.otus.java.basic.Animal.Cat;
import ru.otus.java.basic.Animal.Dog;

public class MainApplication {
    public static void main(String[] args) {
        Cat cat = new Cat ("Bass",5,0,100);
        cat.infoCat();
        cat.runningEndurance();
        Dog dog = new Dog("Funtic",10, 3, 100);
        dog.infoDog();
        dog.runningEndurance();
        dog.swimmingEndurance();
    }
}
