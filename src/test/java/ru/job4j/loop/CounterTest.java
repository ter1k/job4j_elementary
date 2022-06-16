package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void sumWhen0and10Then55() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        int result = Counter.sum(start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sumWhen3and8Then33() {
        int start = 3;
        int finish = 8;
        int expected = 33;
        int result = Counter.sum(start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sumWhen1and1Then1() {
        int start = 1;
        int finish = 1;
        int expected = 1;
        int result = Counter.sum(start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sumWhenMinus8and8Then0() {
        int start = -8;
        int finish = 8;
        int expected = 0;
        int result = Counter.sum(start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sumWhen100and10Then5005() {
        int start = 100;
        int finish = 10;
        int expected = 5005;
        int result = Counter.sum(start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sumWhen0and5Then15() {
        int start = 0;
        int finish = 5;
        int expected = 15;
        int result = Counter.sum(start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sumWhen0andMinus5ThenMinus15() {
        int start = 0;
        int finish = -5;
        int expected = -15;
        int result = Counter.sum(start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sumByEvenWhen0and10Then30() {
        int start = 0;
        int finish = 10;
        int expected = 30;
        int result = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sumByEvenWhen3and8Then18() {
        int start = 3;
        int finish = 8;
        int expected = 18;
        int result = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sumByEvenWhen1and1Then0() {
        int start = 1;
        int finish = 1;
        int expected = 0;
        int result = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sumByEvenWhen2and4Then6() {
        int start = 2;
        int finish = 4;
        int expected = 6;
        int result = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sumByEvenWhenMinus8and9Then0() {
        int start = -8;
        int finish = 9;
        int expected = 0;
        int result = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sumByEvenWhenMinus8and7ThenMinus8() {
        int start = -8;
        int finish = 7;
        int expected = -8;
        int result = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sumByEvenWhen0and3Then2() {
        int start = 0;
        int finish = 3;
        int expected = 2;
        int result = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sumByEvenWhen1andMinus10ThenMinus30() {
        int start = 0;
        int finish = 3;
        int expected = 2;
        int result = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected, result);
    }
}