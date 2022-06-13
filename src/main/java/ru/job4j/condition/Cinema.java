package ru.job4j.condition;

public class Cinema {

    public static void access(int age) {
        System.out.println("The customer's age is : " + age);
        if (age >= 18) {
            System.out.println("Welcome aboard.");
        } else {
            System.out.println("I'm afraid you may not enter.");
        }
    }

    public static void main(String[] args) {
        Cinema.access(21);
        Cinema.access(16);
    }
}
