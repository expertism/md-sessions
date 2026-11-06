package org.mdigital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

    RomanNumerals rn = new RomanNumerals();

    @Test
    void getLetterIAsResult(){
        assertEquals("I", rn.toNumerals(1));
    }

    @Test
    void getTwoStringsAdded(){
        String result = "X" + "I";
        assertEquals(result, rn.toNumerals(11));
    }
}