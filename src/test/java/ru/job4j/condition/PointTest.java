package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void when02to42then4() {
        int x1 = 0;
        int y1 = 2;
        int x2 = 4;
        int y2 = 2;
        double expected = 4;
        double out = Point.distance(x1, y1, x2, y2);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void when20toMinus6And0then8() {
        int x1 = 2;
        int y1 = 0;
        int x2 = -6;
        int y2 = 0;
        double expected = 8;
        double out = Point.distance(x1, y1, x2, y2);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void when26to25then1() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 2;
        int y2 = 5;
        double expected = 1;
        double out = Point.distance(x1, y1, x2, y2);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }
}