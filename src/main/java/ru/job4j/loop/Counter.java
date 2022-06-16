package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        if (start > finish) {
            int temp = start;
            start = finish;
            finish = temp;
        }
        for (int i = start; i <= finish; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(-8, 8));
        System.out.println(sum(100, 10));
        System.out.println(sum(0, 5));
        System.out.println(sum(0, -5));
    }
}
