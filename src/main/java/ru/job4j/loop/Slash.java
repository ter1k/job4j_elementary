package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int collumn = 0; collumn < size; collumn++) {
                if (row == collumn || row == size - collumn - 1) {
                    System.out.print("O");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
        System.out.println("Draw by 7");
        draw(7);
        System.out.println("Draw by 15");
        draw(15);
    }
}