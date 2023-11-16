package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        int column = 0;
        for (int i = 0; i < row; i++) {
            if (board[row][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        int row = 0;
        for (int i = 0; i < row; i++) {
            if (board[row][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}