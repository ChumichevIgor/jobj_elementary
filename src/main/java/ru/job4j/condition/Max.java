package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left == 2;
        int result = condition ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int dir = Max.max(1, 3);
        System.out.println(dir);
    }
}