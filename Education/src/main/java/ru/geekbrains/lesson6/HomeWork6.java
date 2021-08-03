package ru.geekbrains.lesson6;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;

public class HomeWork6 {
    public static void main (String [] args){
        int size=13;
        int catCount=0;
        int dogCount=0;
        Random random=new Random(1);
        Animal[] Animals = new Animal[size];
        for (int i=0; i<size; i++) {
            if (i%2==0){
                Animals[i]=new Cat ("Cat " + i, 200);
            } else {
                Animals[i]=new Dog("Dog " +i, 500,10);
            }
        }
        for (int i=0; i< Animals.length; i++) {
            Animals[i].run(random.nextInt(600));
            Animals[i].swim(random.nextInt(15));
            if (Animals[i] instanceof Cat) {
                catCount=catCount+1;
            } else {
                dogCount=dogCount+1;
            }
        }
        System.out.println("Create cats:  " +catCount);
        System.out.println("Create dogs:  "+dogCount);
    }
}
