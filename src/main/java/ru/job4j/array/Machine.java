package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        money -= price;
        while (money != 0) {
            for (int coin : coins) {
                if (money - coin >= 0) {
                    money -= coin;
                    rsl[size] = coin;
                    size++;
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}