package ru.job4j.condition;

public class ChessBoard {

    private static boolean isValid(int x, int y) {
        return x >= 0 && x <= 7 && y >= 0 && y <= 7;
    }

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1, y1) && isValid(x2, y2)) {
            if (x1 != x2 && y1 != y2) {
                int xx = Math.abs(x2 - x1);
                rsl = xx == Math.abs(y2 - y1) ? xx : 0;
            }
        }
        return rsl;
    }

}