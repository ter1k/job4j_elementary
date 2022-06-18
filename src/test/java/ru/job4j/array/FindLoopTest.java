package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = {6, 55, 4};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenArrayHas4Then3() {
        int[] data = {10, 11, 7, 4, 10};
        int el = 4;
        int result = FindLoop.indexOf(data, el);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }
}