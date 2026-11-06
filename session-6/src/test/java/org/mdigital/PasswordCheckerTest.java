package org.mdigital;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {

    @Test
    void checkBlankPasswordReturnsFalae(){
        // Arrange
        PasswordChecker checker = new PasswordChecker();
        // check password
        boolean result = checker.checkPassword("");
        // Assert
        assertFalse(result);
    }
    @Test
    void checkShorteestPasswordFails(){
        // Arrange
        PasswordChecker checker = new PasswordChecker();
        // check password
        boolean result = checker.checkPassword("a3vjegy");
        // Assert
        assertFalse(result);
    }

    @Test
    void checkEightCharacterPasswordReturnsTrue(){
        // Arrange
        PasswordChecker checker = new PasswordChecker();
        // check password
        boolean result = checker.checkPassword("brbrbrbr1");
        // Assert
        assertTrue(result);
    }

    @Test
    void checkFailsIfNoNumberPresent(){
        // Arrange
        PasswordChecker checker = new PasswordChecker();
        // check password
        boolean result = checker.checkPassword("absvjegy");
        // Assert
        assertFalse(result);
    }
}