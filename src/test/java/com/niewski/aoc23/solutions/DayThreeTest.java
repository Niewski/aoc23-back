package com.niewski.aoc23.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DayThreeTest {
    // Test solvePartOne
    @Test
    public void testSolvePartOneWithValidInputs() {
        // Arrange
        char[][] inputs = {
            {'4', '6', '7', '.', '.', '1', '1', '4', '.', '.'},
            {'.', '.', '.', '*', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '3', '5', '.', '.', '6', '3', '3', '.'},
            {'.', '.', '.', '.', '.', '.', '#', '.', '.', '.'},
            {'6', '1', '7', '*', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '+', '.', '5', '8', '.'},
            {'.', '.', '5', '9', '2', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '7', '5', '5', '.'},
            {'.', '.', '.', '$', '.', '*', '.', '.', '.', '.'},
            {'.', '6', '6', '4', '.', '5', '9', '8', '.', '.'}
        };

        // Act
        int result = DayThree.solvePartOne(inputs);

        // Assert
        int expected = 4361; // expected sum
        assertEquals(expected, result);
    }

    @Test
    public void testSolvePartOneWithNoNumbers() {
        char[][] inputs = {
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '*', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '#', '.', '.', '.'},
            {'.', '.', '.', '*', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '+', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '*', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'}
        };

        // Act
        int result = DayThree.solvePartOne(inputs);

        // Assert
        assertEquals(0, result);
    }

}
