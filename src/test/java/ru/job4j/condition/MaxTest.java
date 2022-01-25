package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1to2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int excepted = 2;
        Assert.assertEquals(result, excepted);
    }

    @Test
    public void whenMax2to1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int excepted = 2;
        Assert.assertEquals(result, excepted);
    }

    @Test
    public void whenMax2to2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int excepted = 2;
        Assert.assertEquals(result, excepted);
    }
}