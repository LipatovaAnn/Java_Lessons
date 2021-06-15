package ru.geekbrains.lesson2;

public class HomeWorkApp {
    public static void main  (String[] args) {
        System.out.println("a=1, b=8  "+compareSum(1, 8));
        System.out.println("a=3, b=13  "+compareSum(3, 13));
        System.out.println("a=11, b=12 "+compareSum(11, 12));

        System.out.println("********************");

        positiveNumber(0);
        positiveNumber(10);
        positiveNumber(-10);

        System.out.println("********************");

        System.out.println("a=6"+"  " +negativeNumber(6));
        System.out.println("a-106"+"  " +negativeNumber(-106));

        System.out.println("********************");

        printString("I am programming",3);

        System.out.println("********************");

        System.out.println(whatYear(2020));
        System.out.println(whatYear(2021));
        System.out.println(whatYear(100));
        System.out.println(whatYear(400));
    }

    public static boolean compareSum (int a, int b) {
        return ((a+b>=10)&&(a+b)<=20);
    }

    public static void positiveNumber (int a) {
        if (a>=0) {
            System.out.println (a + "  Число положительное");
        }
        else {
            System.out.println (a + "  Число отрицательное");
        }
    }

    public static boolean negativeNumber (int a) {
        return !(a>=0);
    }

    public static void printString (String s, int count) {
        for (int i=1; i<=count; i++) {
            System.out.println(s);
        }
    }
    public static boolean whatYear (int y){
        boolean mod4=y%4==0;
        boolean mod100=y%100==0;
        boolean mod400=y%400==0;
        return ((mod4&&!mod100)||mod400);
        }
    }
