package ru.otus.java.basic.hw6;

public class MainApplication {
    public static void main(String[] args) {
        Plate plate = new Plate(500,0);
        plate.takeFood(600);
        Cat[] cats = {
                new Cat("Basya", true),
                new Cat("Vasya", true),
                new Cat("Masya", true),
        };
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
        System.out.println(plate);
    }
}
