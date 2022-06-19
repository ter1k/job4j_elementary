package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {3, 5, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf10elements() {
        int[] data = new int[] {6, 9, 5, 3, 10, 5, 8, 1, 2, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 2, 3, 5, 5, 6, 8, 9, 10};
        Assert.assertArrayEquals(expected, result);
    }
}