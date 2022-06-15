package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void whenRuTuesdayThen2() {
        Assert.assertEquals(2, MultipleSwitchWeek.numberOfDay("Вторник"));
    }

    @Test
    public void whenEnThursdayThen4() {
        Assert.assertEquals(4, MultipleSwitchWeek.numberOfDay("Thursday"));
    }

    @Test
    public void whenRuThursdayThen4() {
        Assert.assertEquals(4, MultipleSwitchWeek.numberOfDay("Четверг"));
    }

    @Test
    public void whenEnSundayThen7() {
        Assert.assertEquals(7, MultipleSwitchWeek.numberOfDay("Sunday"));
    }

    @Test
    public void whenDefaultThenMinus1() {
        Assert.assertEquals(-1, MultipleSwitchWeek.numberOfDay("henlo"));
    }
}