package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1and2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int result = Max.max(left, right);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10And15Then15() {
        int left = 10;
        int right = 15;
        int expected = 15;
        int result = Max.max(left, right);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax21And2Then21() {
        int left = 21;
        int right = 2;
        int expected = 21;
        int result = Max.max(left, right);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5And5Then5() {
        int left = 5;
        int right = 5;
        int expected = 5;
        int result = Max.max(left, right);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4and7and5Then7() {
        int expected = 7;
        int result = Max.max(4, 5, 7);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4and2and5and10Then10() {
        int expected = 10;
        int result = Max.max(4, 2, 5, 10);
        Assert.assertEquals(result, expected);
    }
}