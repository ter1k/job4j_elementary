package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива ages: " + ages.length);
        System.out.println("Размер массива surnames: " + surnames.length);
        System.out.println("Размер массива prices: " + prices.length);
        String[] names = new String[4];
        names[0] = "Oleg the Good";
        names[1] = "Oleg the Bad";
        names[2] = "Oleg the Ugly";
        names[3] = "Oleg the Evil";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
