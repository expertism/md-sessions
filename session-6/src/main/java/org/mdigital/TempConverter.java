package org.mdigital;

public class TempConverter {

    public static double celsiusToFahrenheit(double c) {
        return (c * 1.8) + 32;
    }

    public static double fahrenheitToCelsius(double f) {

        return (f - 32) / 9.0 * 5.0;
    }
}
