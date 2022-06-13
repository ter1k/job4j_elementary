package ru.job4j.condition;

public class Tour {

    public static void offer(boolean passport) {
        System.out.println("A client has a foreign passport : " + passport);
        if (passport) {
            System.out.println("Offering tours abroad.");
        } else {
            System.out.println("Offering tours in Russia.");
        }
    }

    public static void main(String[] args) {
        Tour.offer(true);
        Tour.offer(false);
    }
}
