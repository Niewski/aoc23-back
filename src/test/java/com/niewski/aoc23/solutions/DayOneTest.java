package com.niewski.aoc23.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DayOneTest {
    // Test solvePartOne
    @Test
    public void testSolvePartOneWithValidInputs() {
        // Arrange
        String[] inputs = {"1abc2", "pqr3stu8vwx", "a1b2c3d4e5f", "treb7uchet"};

        // Act
        int result = DayOne.solvePartOne(inputs);

        // Assert
        int expected = 142; // expected sum
        assertEquals(expected, result);
    }

    @Test
    public void testSolvePartOneWithEmptyStrings() {
        // Arrange
        String[] inputs = {"", "", ""};

        // Act
        int result = DayOne.solvePartOne(inputs);

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void testSolvePartOneWithNoNumbers() {
        // Arrange
        String[] inputs = {"abc", "xyz"};

        // Act
        int result = DayOne.solvePartOne(inputs);

        // Assert
        assertEquals(0, result);
    }

    // Test solvePartTwo
    @Test
    public void testSolvePartTwoWithValidDigitsOnly() {
        // Arrange
        String[] inputs = {"1abc2", "pqr3stu8vwx", "a1b2c3d4e5f", "treb7uchet"};

        // Act
        int result = DayOne.solvePartTwo(inputs);

        // Assert
        int expected = 142; // expected sum
        assertEquals(expected, result);
    }

    @Test
    public void testSolvePartTwoWithValidDigitsAndWords() {
        // Arrange
        String[] inputs = {"two1nine", "eightwothree", "abcone2threexyz", "xtwone3four", "4nineeightseven2", "zoneight234", "7pqrstsixteen", "seven2wut"};

        // Act
        int result = DayOne.solvePartTwo(inputs);

        // Assert
        int expected = 353; // expected sum
        assertEquals(expected, result);
    }

    @Test
    public void testSolvePartTwoWithEmptyStrings() {
        // Arrange
        String[] inputs = {"", "", ""};

        // Act
        int result = DayOne.solvePartTwo(inputs);

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void testSolvePartTwoWithNoNumbers() {
        // Arrange
        String[] inputs = {"abc", "xyz"};

        // Act
        int result = DayOne.solvePartTwo(inputs);

        // Assert
        assertEquals(0, result);
    }
}
