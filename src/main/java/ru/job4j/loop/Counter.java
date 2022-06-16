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

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        if (start > finish) {
            int temp = start;
            start = finish;
            finish = temp;
        }
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
