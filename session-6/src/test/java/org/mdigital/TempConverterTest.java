package org.mdigital;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TempConverterTest {

    private static final double DELTA = 0.0001;

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0, TempConverter.celsiusToFahrenheit(0), DELTA);
        assertEquals(212.0, TempConverter.celsiusToFahrenheit(100), DELTA);
        assertEquals(-40.0, TempConverter.celsiusToFahrenheit(-40), DELTA);
        assertEquals(98.6, TempConverter.celsiusToFahrenheit(37), DELTA);
        assertEquals(68.0, TempConverter.celsiusToFahrenheit(20), DELTA);
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0, TempConverter.fahrenheitToCelsius(32), DELTA);
        assertEquals(100.0, TempConverter.fahrenheitToCelsius(212), DELTA);
        assertEquals(-40.0, TempConverter.fahrenheitToCelsius(-40), DELTA);
        assertEquals(10.0, TempConverter.fahrenheitToCelsius(50), DELTA);
        assertEquals(37.0, TempConverter.fahrenheitToCelsius(98.6), DELTA);
    }
}
