package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int l = 0;
        int j = array.length - 1;

        while (l < j) {
            int sum = array[l] + array[j];
            if (sum == target) {
                return new int[]{l, j};
            } else if (sum < target) {
                l++;
            } else {
                j--;
            }
        }

        return new int[0];
    }
}
