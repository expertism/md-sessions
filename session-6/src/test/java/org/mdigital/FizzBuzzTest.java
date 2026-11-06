package org.mdigital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    private final FizzBuzz fB = new FizzBuzz();

    @Test
    void checkMultipleOfThree() {
        assertEquals("Fizz", fB.fizzBuzz(3));
    }

    @Test
    void checkMultipleOfFive() {
        assertEquals("Buzz", fB.fizzBuzz(5));
    }

    @Test
    void checkMultipleOfThreeAndFive() {
        assertEquals("FizzBuzz", fB.fizzBuzz(15));
    }

    @Test
    void checkRegularNumber() {
        assertEquals("2", fB.fizzBuzz(2));
    }
}