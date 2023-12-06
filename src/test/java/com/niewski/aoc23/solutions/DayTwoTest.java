package com.niewski.aoc23.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DayTwoTest {

    @Test
    public void testSolveWithValidInput() {
        // Arrange
        String input = "Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green " + //
                "Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue " + //
                "Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red " + //
                "Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red " + //
                "Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green";

        // Act
        int result = DayTwo.solve(input);

        // Assert
        int expected = 8; // expected sum
        assertEquals(expected, result);
    }

    @Test
    public void testSolveWithEmptyString() {
        // Arrange
        String input = "";

        // Act
        int result = DayTwo.solve(input);

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void testSolveWithBadString() {
        // Arrange
        String input = "45gshrtjh65";

        // Act
        int result = DayTwo.solve(input);

        // Assert
        assertEquals(0, result);
    }

}
