package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] value = new int[size][size];
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value.length; j++) {
                value[i][j] = (i + 1) * (j + 1);
            }
        }
        return value;
    }
}
