package com.niewski.aoc23.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DayOneTest {

    @Test
    public void testSolveWithValidInputs() {
        // Arrange
        String[] inputs = {"1abc2", "pqr3stu8vwx", "a1b2c3d4e5f", "treb7uchet"};

        // Act
        int result = DayOne.solve(inputs);

        // Assert
        int expected = 142; // expected sum
        assertEquals(expected, result);
    }

    @Test
    public void testSolveWithEmptyStrings() {
        // Arrange
        String[] inputs = {"", "", ""};

        // Act
        int result = DayOne.solve(inputs);

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void testSolveWithNoNumbers() {
        // Arrange
        String[] inputs = {"abc", "xyz"};

        // Act
        int result = DayOne.solve(inputs);

        // Assert
        assertEquals(0, result);
    }

}
