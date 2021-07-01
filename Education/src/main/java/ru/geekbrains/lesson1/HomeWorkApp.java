package ru.geekbrains.lesson1;

public class HomeWorkApp {
    public static void main (String[] args){

        printThreeWords();
        checkSumSign ();
        printColour();
        compareNumbers();
    }


    public static void printThreeWords () {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign () {
        int a, b, c;
        a=29;
        b=641;
        c=a+b;
        if (c>=0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумму отрицательная");
        }
    }
    public static void printColour() {
        int value;
        value=269;
        if (value<=0) {
            System.out.println("Красный");
        }
        if (value>0&&value<=100) {
            System.out.println("Желтый");
        }
        if (value>100) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a,b;
        a=467;
        b=64;
        if (a>=b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}

