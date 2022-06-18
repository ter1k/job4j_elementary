package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        percent = percent / 100 + 1;
        int year = 0;
        while (amount > 0) {
            amount = amount * percent - salary;
            year++;
        }
        return year;
    }
}
