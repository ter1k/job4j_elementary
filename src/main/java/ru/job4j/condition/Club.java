package ru.job4j.condition;

public class Club {
    public static void perm(boolean hasMoney, boolean beFriend) {
        if (hasMoney || beFriend) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can not go to the club.");
        }
    }

    public static void main(String[] args) {
        perm(false, false);
        perm(false, true);
        perm(true, false);
        perm(true, true);
    }
}