package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int pow = 0; pow < size; pow++) {
            for (int cell = 0; cell < size; cell++) {
                table[pow][cell] = (pow + 1) * (cell + 1);
            }
        }
        return table;
    }
}