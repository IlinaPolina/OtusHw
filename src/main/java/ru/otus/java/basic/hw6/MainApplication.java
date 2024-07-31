package ru.otus.java.basic.hw6;

public class MainApplication {
    public static void main(String[] args) {
        Plate plate = new Plate(500,0);
        plate.takeFood(600);
        Cat[] cats = {
                new Cat("Basy", true),
                new Cat("Vasy", true),
                new Cat("Masy", true),
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
