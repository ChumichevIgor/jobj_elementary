package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SortSelectedTest {

    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[]{3, 20, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 3, 20};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf10elements() {
        int[] data = new int[]{3, 4, 1, 2, 5, 16, 20, 2, 1, 9};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 1, 2, 2, 3, 4, 5, 9, 16, 20};
        Assert.assertArrayEquals(expected, result);
    }
}