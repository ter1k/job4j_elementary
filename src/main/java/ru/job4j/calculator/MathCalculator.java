package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumDiffDiv(double first, double second) {
        return difference(first, second) + division(first, second);
    }

    public static double sumAll(double first, double second) {
        return sum(first, second) + multiply(first, second) + difference(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        double a = 10;
        double b = 20;
        System.out.println("The numbers are: " + a + ", " + b);
        System.out.println("Summation + Multiplication: " + sumAndMultiply(a, b));
        System.out.println("Difference + Division: " + sumDiffDiv(a, b));
        System.out.println("All of the above summed together: " + sumAll(a, b));
    }

}
