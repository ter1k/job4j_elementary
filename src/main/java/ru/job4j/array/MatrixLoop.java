package ru.job4j.array;

public class MatrixLoop {
    public static void main(String[] args) {
        int[][] array = {{4, 2, 3}, {7, 1}, {3, 5, 6, 4}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
