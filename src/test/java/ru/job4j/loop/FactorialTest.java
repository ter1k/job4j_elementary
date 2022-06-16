package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void whenFactorial5Then120() {
        int n = 5;
        int expected = 120;
        int result = Factorial.calc(n);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenFactorial0Then1() {
        int n = 0;
        int expected = 1;
        int result = Factorial.calc(n);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenFactorial1Then1() {
        int n = 1;
        int expected = 1;
        int result = Factorial.calc(n);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenFactorial2Then2() {
        int n = 2;
        int expected = 2;
        int result = Factorial.calc(n);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenFactorial3Then6() {
        int n = 3;
        int expected = 6;
        int result = Factorial.calc(n);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenFactorial4Then24() {
        int n = 4;
        int expected = 24;
        int result = Factorial.calc(n);
        Assert.assertEquals(result, expected);
    }
}