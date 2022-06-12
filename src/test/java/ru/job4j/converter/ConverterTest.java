package ru.job4j.converter;

import org.junit.Test;

import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euros() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.001f;
        assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert200RblThen3dot3333Dollars() {
        float in = 200;
        float expected = 3.3333f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertEquals(expected, out, eps);
    }

}