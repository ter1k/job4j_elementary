package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean ref = data[0];
        for (int i = 1; i < data.length; i++) {
            if (ref != data[i]) {
                return false;
            }
        }
        return true;
    }
}
