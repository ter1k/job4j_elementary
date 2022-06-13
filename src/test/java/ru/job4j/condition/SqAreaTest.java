package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int p = 6;
        int k = 2;
        int expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP24K2Square32() {
        int p = 24;
        int k = 2;
        int expected = 32;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP30K4Square72() {
        int p = 30;
        int k = 4;
        int expected = 36;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}