package ru.geekbrains.lesson6;

public class Cat extends Animal{
    public Cat (String name, int runLimit) {
        super(name,runLimit,0);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cat  " + this.name + " can't swim");
    }


}
