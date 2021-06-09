package ru.geekbrains.lesson3;

import java.awt.desktop.AboutEvent;
import java.util.Random;

public class HomeworkApp {
    public static void main (String[] args) {

    changeArr();
    System.out.println("******************************");
    hundredArr();
    System.out.println("******************************");
    doubleArr();
    System.out.println("******************************");
    squareArr(6,12);
    System.out.println("******************************");
    initialValueArr(7,7);
    System.out.println("******************************");
    compareValueArr();
    System.out.println("******************************");
    System.out.println(isSumArr());
    System.out.println("******************************");






    }
    public static int[] getArr (int size, int bound) {
        int [] newArr=new int[size];
        Random random=new Random();
        for (int i=0; i<size; i++) {
            newArr[i]= random.nextInt(bound);
        }
        return newArr;
    }

    public static void printArr(int[] array) {
        for (int count=0; count<array.length; count++) {
            System.out.print(array[count] + " | ");
        }
        System.out.println();
    }
    public static void printSquareArr(int [][] array){
        for (int i=0; i< array.length; i++) {
            for (int j=0; j< array.length; j++) {
                System.out.print(array[i][j]+" | ");
            }
            System.out.println();
        }
    }

    public static void changeArr () {
        int[] firstArray= getArr(8,2);
        printArr(firstArray);
        for (int i=0; i< firstArray.length; i++) {
            firstArray[i]=firstArray[i]^1;
        }
        System.out.println();
        printArr(firstArray);
        }

    public static void hundredArr() {
        int [] array=new int[100];
        for (int i=0;i<array.length; i++) {
            array [i]=i+1;
        }
        printArr(array);
    }

    public static void doubleArr () {
        int [] array = getArr(10,10);
        printArr(array);
        for (int i=0; i< array.length;i++) {
            if (array [i]<6) {
                array[i]=array[i]*2;
            }
        }
        printArr(array);
        }

     public static void squareArr (int size, int bound) {
        int [][] array=new int[size][size];
         Random random=new Random();
         for (int i=0; i<size; i++) {
             for (int j=0; j<size; j++) {
                 array[i][j]= random.nextInt(bound);
             }
         }
         printSquareArr(array);
         System.out.println();
         for (int i=0; i<size; i++) {
             for (int j=0; j<size; j++) {
                 if ((i==j)||(j==size-1-i)) {
                 array[i][j]=1;
                 };
             }
         }
         printSquareArr(array);
         System.out.println();
    }
    public static void initialValueArr (int len, int initialValue) {
        int [] newArr=new int[len];
                for (int i=0; i<len; i++) {
            newArr[i]= initialValue;
        }
        printArr(newArr);

    }
    public static void compareValueArr () {
        int[] array=getArr(7,15);
        printArr(array);
        System.out.println();
        int minValue=array[0];
        int maxValue=array[0];
        for (int i=0; i<array.length; i++) {
            if (array[i]<minValue) {
                minValue=array[i];}
            if (array[i]>maxValue) {
                maxValue=array[i];
            }
        }
        System.out.println("min value  " + minValue);
        System.out.println("max value  " + maxValue);

    }
    public static boolean isSumArr () {
        int[]array=getArr(6,2);
        printArr(array);
        for (int i=1; i< array.length; i++) {
            int left=0;
            int right=0;
            for (int j=0; j< array.length; j++) {
                if (j<i) {left=left+array[j];}
                else {right=right+array[j];}
            }
            if (left==right) {return (true);}
        }
        return (false);
    }
    }

