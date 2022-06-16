package ru.job4j.loop;

public class Board0 {
    public static void paint(int width, int height) {
        boolean widthEven = width % 2 == 0;
        int count = widthEven ? 0 : 1;
        for (int y = 0; y < height; y++) {
            if (widthEven) {
                count++;
            }
            for (int x = 0; x < width; x++) {
                if (count % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("X");
                }
                count++;
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
