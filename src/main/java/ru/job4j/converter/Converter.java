package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float ruble = 140;
        float euro = Converter.rubleToEuro(ruble);
        float dollar = Converter.rubleToDollar(ruble);
        System.out.println(ruble + " roubles are " + euro + " euros and " + dollar + " dollars");
    }
}