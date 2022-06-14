package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println(Max.max(a, b));
    }
}
