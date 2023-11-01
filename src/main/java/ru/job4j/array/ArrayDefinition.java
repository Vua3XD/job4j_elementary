package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Rulon Oboev";
        names[1] = "Sergey Vyazovik";
        names[2] = "Ivanov Ivan";
        names[3] = "Petrov Petr";
        System.out.println("Размер массива равен:" + ages.length);
        System.out.println("Размер массива равен:" + surnames.length);
        System.out.println("Размер массива равен:" + prices.length);
    }
}
