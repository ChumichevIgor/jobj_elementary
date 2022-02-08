package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SwitchWeekTest {

    @Test
    public void whenMonday() {
        int in = 1;
        String result = SwitchWeek.nameOfDay(in);
        String excepted = "Понедельник";
        Assert.assertEquals(excepted, result);
    }

    @Test
    public void whenTuesday() {
        int in = 2;
        String result = SwitchWeek.nameOfDay(in);
        String excepted = "Вторник";
        Assert.assertEquals(excepted, result);
    }

    @Test
    public void whenWednesday() {
        int in = 3;
        String result = SwitchWeek.nameOfDay(in);
        String excepted = "Среда";
        Assert.assertEquals(excepted, result);
    }

    @Test
    public void whenThursday() {
        int in = 4;
        String result = SwitchWeek.nameOfDay(in);
        String excepted = "Четверг";
        Assert.assertEquals(excepted, result);
    }

    @Test
    public void whenFriday() {
        int in = 5;
        String result = SwitchWeek.nameOfDay(in);
        String excepted = "Пятница";
        Assert.assertEquals(excepted, result);
    }

    @Test
    public void whenSaturday() {
        int in = 6;
        String result = SwitchWeek.nameOfDay(in);
        String excepted = "Суббота";
        Assert.assertEquals(excepted, result);
    }

    @Test
    public void whenSunday() {
        int in = 7;
        String result = SwitchWeek.nameOfDay(in);
        String excepted = "Воскресение";
        Assert.assertEquals(excepted, result);
    }

    @Test
    public void whenMoreThanWeek() {
        int in = 8;
        String result = SwitchWeek.nameOfDay(in);
        String excepted = "Ошибка";
        Assert.assertEquals(excepted, result);
    }
}