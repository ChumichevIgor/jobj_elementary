package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double difAndDiv(double third, double fourth) {
        return dif(third, fourth)
                + div(third, fourth);
    }

    public static double sumAlloperations(double first, double second, double third, double fourth) {
        return sum(first, second)
                + multiply(first, second)
                + dif(third, fourth)
                + div(third, fourth);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + difAndDiv(40, 20));
        System.out.println("Результат расчета равен: " + sumAlloperations(10, 20, 40, 20));
    }
}
