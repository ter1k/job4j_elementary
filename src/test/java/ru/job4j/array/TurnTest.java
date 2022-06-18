package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {9, 5, 3, 2, 4};
        int[] result = Turn.back(input);
        int[] expected = new int[] {4, 2, 3, 5, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWith1Element() {
        int[] input = new int[] {9};
        int[] result = Turn.back(input);
        int[] expected = new int[] {9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWith2Elements() {
        int[] input = new int[] {4, 8};
        int[] result = Turn.back(input);
        int[] expected = new int[] {8, 4};
        Assert.assertArrayEquals(expected, result);
    }
}