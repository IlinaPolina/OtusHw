package ru.otus.java.basic.hw5;

import ru.otus.java.basic.hw5.Animal.Cat;
import ru.otus.java.basic.hw5.Animal.Dog;
import ru.otus.java.basic.hw5.Animal.Horse;

public class MainApplication {
    public static void main(String[] args) {
        Cat cat = new Cat ("Bass",1,0,100);
        cat.infoCat();
        cat.run(110);
        cat.swim(10);
        Dog dog = new Dog("Funtic",3, 1, 200);
        dog.infoDog();
        dog.run(110);
        dog.swim(10);
        Horse horse = new Horse("Igogo", 10, 3,1000);
        horse.infoHorse();
        horse.run(110);
        horse.swim(10);
    }
}