package ru.job4j.calculator;

import org.junit.Test;

import org.junit.Assert;

public class FitTest {

    @Test
    public void whenMan187Then100() {
        short in = 187;
        double expected = 100;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenWoman173Then72() {
        short in = 173;
        double expected = 72;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 1);
    }
}