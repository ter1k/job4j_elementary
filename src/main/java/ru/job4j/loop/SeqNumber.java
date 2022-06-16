package ru.job4j.loop;

public class SeqNumber {
    public static void main(String[] args) {
        calc(6);
        calc(8);
        calc(5);
        calc(10);
        calc(15);
        calc(20);
    }

    public static void calc(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
            if (res == n) {
                System.out.println(n + " Yes");
                break;
            } else if (res > n) {
                System.out.println(n + " no");
                break;
            }

        }
    }
}
