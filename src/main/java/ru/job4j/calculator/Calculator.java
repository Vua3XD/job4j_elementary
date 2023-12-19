package ru.job4j.calculator;

public class Calculator {
    private static int x = 5;

    public int divide(int number) {
        return number / x;
    }

    public int sumAllOperation(int number) {
        return sum(number) + multiply(number) + minus(number) + divide(number);
    }

    public int sum(int number) {
        return number + x;
    }

    public int multiply(int number) {
        return number * x;
    }

    public int minus(int number) {
        return number - x;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int number = 20;

        int divideResult = calculator.divide(number);
        System.out.println("Результат деления: " + divideResult);

        int sumAllOperationResult = calculator.sumAllOperation(number);
        System.out.println("Результат всех операций: " + sumAllOperationResult);
    }
}

