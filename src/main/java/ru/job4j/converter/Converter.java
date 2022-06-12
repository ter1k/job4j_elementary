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
        float expected = 2;
        float out = Converter.rubleToEuro(ruble);
        boolean passed = expected == out;
        System.out.println(ruble + " roubles are " + expected + " euros. Test result : " + passed);
        ruble = 180;
        expected = 3;
        out = Converter.rubleToDollar(ruble);
        passed = expected == out;
        System.out.println(ruble + " roubles are " + expected + " dollars. Test result : " + passed);
    }
}