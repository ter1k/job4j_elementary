package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double out = a.distance(b);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void when02to42then4() {
        Point a = new Point(0, 2);
        Point b = new Point(4, 2);
        double expected = 4;
        double out = a.distance(b);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void when20toMinus6And0then8() {
        Point a = new Point(2, 0);
        Point b = new Point(-6, 0);
        double expected = 8;
        double out = a.distance(b);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void when26to25then1() {
        Point a = new Point(2, 6);
        Point b = new Point(2, 5);
        double expected = 1;
        double out = a.distance(b);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }
}