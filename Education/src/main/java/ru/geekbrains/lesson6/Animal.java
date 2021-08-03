package ru.geekbrains.lesson6;

public abstract class Animal {
    String name;
    int runLimit;
    int swimLimit;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name=name;
        this.runLimit=runLimit;
        this.swimLimit=swimLimit;
    }

    public void run (int distance) {
        if (distance>runLimit) {
            System.out.println("Animal  " + this.name+ " can't run distance  " + distance + "m");
        } else {
            System.out.println("Animal  " + this.name+ " run distance  " + distance + "m");
        }
    }

    public void swim (int distance) {
            if (distance>swimLimit) {
                System.out.println("Animal  " + this.name+ " can't swim distance " + distance + "m");
            } else {
                System.out.println("Animal  " + this.name+ " swim distance " + distance + "m");
            }
        }
}
