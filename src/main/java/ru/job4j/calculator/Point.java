package ru.job4j.calculator;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x = (x2 - x1);
        double y = (y2 - y1);
        double first = Math.pow(x, 2);
        double two = Math.pow(y, 2);
        double three = first + two;
        double result = Math.sqrt(three);
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
