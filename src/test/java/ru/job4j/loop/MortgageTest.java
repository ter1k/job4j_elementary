package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class MortgageTest {
    @Test
    public void when1Year() {
        int amount = 1000;
        int salary = 1200;
        double percent = 1;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when2Year() {
        int amount = 100;
        int salary = 120;
        double percent = 50;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when4Years() {
        int amount = 100;
        int salary = 70;
        int percent = 50;
        int expected = 4;
        Assert.assertEquals(Mortgage.year(amount, salary, percent), expected);
    }
}