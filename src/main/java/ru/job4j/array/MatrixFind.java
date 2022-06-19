package ru.job4j.array;

public class MatrixFind {
    public static void find(int[][] array, int el) {
        System.out.println("Find el = " + el);
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == el) {
                    k++;
                    System.out.println("Occurrence #" + k + " found at " + i + " : " + j);
                    printWithMark(array, i, j);
                    System.out.println();
                }
            }
        }
        if (k == 0) {
            System.out.println("Unfortunately, nothing found.");
        } else {
            System.out.println("Successfully found " + k + " occurrences.");
        }
    }

    public static void printWithMark(int[][] array, int x, int y) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == x && j == y) {
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {3, 2, 1},
                {2, 3, 1}
        };
        MatrixFind.find(array, 3);
    }
}
