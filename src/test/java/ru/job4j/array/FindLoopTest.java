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

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = new int[] {6, 8, 9, 4, 3, 2};
        int el = 8;
        int start = 3;
        int finish = 5;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas5Then4() {
        int[] data = new int[] {6, 7, 2, 4, 5};
        int el = 5;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas2Then2() {
        int[] data = new int[] {6, 7, 2, 4, 5, 9};
        int el = 2;
        int start = 2;
        int finish = 3;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }
}