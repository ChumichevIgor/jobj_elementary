package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board[row].length; cell++) {
            char index = 'X';
            if (board[row][cell] != index) {
                result = false;
                break;
            }
        }
        return result;
    }
}
