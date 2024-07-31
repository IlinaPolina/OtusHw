package ru.otus.java.basic.hw6;

public class Plate {
    int maximumAmountOfFood;
    int currentAmountOfFood;

    public Plate(int maximumAmountOfFood, int currentAmountOfFood) {
        this.maximumAmountOfFood = maximumAmountOfFood;
        this.currentAmountOfFood = currentAmountOfFood;
    }

    public int getMaximumAmountOfFood() {
        return maximumAmountOfFood;
    }

    public void setMaximumAmountOfFood(int maximumAmountOfFood) {
        this.maximumAmountOfFood = maximumAmountOfFood;
    }

    public int getCurrentAmountOfFood() {
        return currentAmountOfFood;
    }

    public void setCurrentAmountOfFood(int currentAmountOfFood) {
        this.currentAmountOfFood = currentAmountOfFood;
    }

    public void quantity(int quantity) {
        if (quantity <= maximumAmountOfFood) {
            System.out.println("Тарелка полная еды, еды: " + quantity + " гр.");
        } else {
            System.out.println("Тарелка переполнена");
        }
    }
    public void plusEat (boolean condition) {
        if (condition == true) {
           currentAmountOfFood += 10;
            System.out.println("Тарелка пополнилась на 10 грамм еды.");
            System.out.println("Текущее количество еды: " + currentAmountOfFood);
        }
        else {
            System.out.println("Текущее количество еды: " + currentAmountOfFood);
        }
    }
    public void minusEat (boolean condition) {
        if (condition == true) {
            currentAmountOfFood -= 20;
            System.out.println("Тарелка уменьшилась на 10 грамм еды.");
            System.out.println("Текущее количество еды: " + currentAmountOfFood);
        }
        else {
            System.out.println("Текущее количество еды: " + currentAmountOfFood);

        }
    }
    public void takeFood (int amount) {
        currentAmountOfFood += amount;
        if (currentAmountOfFood > maximumAmountOfFood) {
            System.out.println("Тарелка переполнилась, количество еды: " + maximumAmountOfFood);
            currentAmountOfFood = maximumAmountOfFood;
            System.out.println("Текущее количество еды в тарелке: " + currentAmountOfFood);
        }
        else {
            System.out.println("Тарелка пополнилась на " + amount + " гр. еды");
            System.out.println("Текущее количество еды в тарелке: " + currentAmountOfFood);
        }
    }

    public void eatFood (int amount1) {
        currentAmountOfFood -= amount1;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "maximumAmountOfFood=" + maximumAmountOfFood +
                ", currentAmountOfFood=" + currentAmountOfFood +
                '}';
    }
}
