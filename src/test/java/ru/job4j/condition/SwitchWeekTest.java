package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void when1ThenMonday() {
        Assert.assertEquals(SwitchWeek.nameOfDay(1), "Понедельник");
    }

    @Test
    public void when3ThenWednesday() {
        Assert.assertEquals(SwitchWeek.nameOfDay(3), "Среда");
    }

    @Test
    public void when6ThenSaturday() {
        Assert.assertEquals(SwitchWeek.nameOfDay(6), "Суббота");
    }

    @Test
    public void whenDefaultThenError() {
        Assert.assertEquals(SwitchWeek.nameOfDay(20), "Ошибка");
    }
}