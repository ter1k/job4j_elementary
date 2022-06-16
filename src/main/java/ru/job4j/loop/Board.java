package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
         for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if ((x + y) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        paint(3, 4);
        paint(4, 4);
        paint(3, 5);
        paint(20, 10);
    }
}
