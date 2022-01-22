package ru.job4j.condition;

public class Liken {
    public static void main(String[] args) {
        int first = 10;
        int second = 9;

        boolean result = true; //first > second
        System.out.println(result);

        result = false; //first < second
        System.out.println(result);

        result = false; //first == second
        System.out.println(result);
    }
}
