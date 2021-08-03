package ru.geekbrains.lesson4;
import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static int size = 3;
    public static int turnToWin = 3;
    public static char empty = '_';
    public static char human = 'X';
    public static char pc = 'O';
    public static char [][] map;
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main (String [] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn ();
            printMap ();
            if (isCheckWin (human)) {
                System.out.println("Human win!!!");
                break;
            }
            if (isMapFull ()) {
                System.out.println("tie!");
                break;
            }
            pcTurn ();
            printMap ();
            if (isCheckWin (pc)) {
                System.out.println("PC win!!!");
                break;
            }
            if (isMapFull()) {
                System.out.println("tie!");
                break;
            }
        }
        System.out.println("Game over");
    }
    public static boolean isCheckWin (char symb) {
        int [] rows = new int[size];
        int [] columns = new int[size];
        int [] diagonal = new int[2];
        for (int i=0; i<size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == symb) {
                    rows[i] = rows[i] + 1;
                    columns[j] = columns[j] + 1;
                    if (i == j) {
                        diagonal[0] = diagonal[0] + 1;
                    }
                    if (j == size - i - 1) {
                        diagonal[1] = diagonal[1] + 1;
                    }

                }
            }
        }
        for (int i=0; i<size; i++) {
            if (rows[i]==size || columns[i]==size) return true;
        }
        return (diagonal[0]==size||diagonal[1]==size) ;

     }
    public static boolean isMapFull () {
        for (int i=0; i<size; i++) {
            for (int j=0; j<size; j++) {
                if (map[i][j]==empty) return false;
            }
        }
        return true;
    }
    public static void pcTurn () {
        int x, y;
        do {
            x= random.nextInt(size);
            y= random.nextInt(size);
        } while (!isCellValid (x,y));
        System.out.println("PC turn "+ (x+1) + " " + (y+1));
        map[y][x] = pc;
    }
    public static void humanTurn () {
        int x, y;
        do {
            System.out.println("Enter coordinates (x,y): ");
            x= scanner.nextInt()-1;
            y= scanner.nextInt()-1;
        } while (!isCellValid (x,y));
        map[y][x] = human;
    }
    public static boolean isCellValid (int x, int y) {
        if (x<0 || x>=size || y<0 || y>=size) return false;
        if (map[y][x]==empty) return true;
        return false;
    }
    public static void initMap () {
        map=new char [size][size];
        for (int i=0; i<size; i++) {
            for (int j=0; j<size; j++) {
                map [i][j]=empty;
            }
        }
    }
    public static void printMap() {
        System.out.print ("  ");
        for (int i=1;i<=size;i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i=0; i<size; i++) {
            System.out.print((i+1) + " ");
            for (int j=0; j<size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
