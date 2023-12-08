package com.niewski.aoc23.solutions;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.niewski.aoc23.dto.ScratchOff;

public class DayFourTest {
    private ScratchOff loadSingleWinScratchOff() {
        List<Integer> winningNumbers = new ArrayList<Integer>();
        List<Integer> myNumbers = new ArrayList<Integer>();

        winningNumbers.add(1);
        winningNumbers.add(22);
        winningNumbers.add(33);
        winningNumbers.add(476);

        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(3);
        myNumbers.add(4);
        myNumbers.add(5);
        myNumbers.add(6);
        myNumbers.add(7);
        myNumbers.add(8);
        myNumbers.add(9);
        myNumbers.add(10);

        return new ScratchOff(winningNumbers, myNumbers);
    }

    private ScratchOff loadMultiWinScratchOff() {
        List<Integer> winningNumbers = new ArrayList<Integer>();
        List<Integer> myNumbers = new ArrayList<Integer>();

        winningNumbers.add(1);
        winningNumbers.add(2);
        winningNumbers.add(3);
        winningNumbers.add(4);

        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(3);
        myNumbers.add(4);
        myNumbers.add(5);
        myNumbers.add(6);
        myNumbers.add(7);
        myNumbers.add(8);
        myNumbers.add(9);
        myNumbers.add(10);

        return new ScratchOff(winningNumbers, myNumbers);
    }

    private ScratchOff loadLosingScratchOff() {
        List<Integer> winningNumbers = new ArrayList<Integer>();
        List<Integer> myNumbers = new ArrayList<Integer>();

        winningNumbers.add(15);
        winningNumbers.add(22);
        winningNumbers.add(33);
        winningNumbers.add(476);

        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(3);
        myNumbers.add(4);
        myNumbers.add(5);
        myNumbers.add(6);
        myNumbers.add(7);
        myNumbers.add(8);
        myNumbers.add(9);
        myNumbers.add(10);


        return new ScratchOff(winningNumbers, myNumbers);
    }

    // Test solvePartOne
    @Test
    public void testSolvePartOneWithValidInputs() {
        // Arrange
        List<ScratchOff> inputs = new ArrayList<ScratchOff>();
        // Returns 1 point
        inputs.add(loadSingleWinScratchOff());
        // Returns 8 points each
        inputs.add(loadMultiWinScratchOff());
        inputs.add(loadMultiWinScratchOff());
        // Returns 0 points
        inputs.add(loadLosingScratchOff());
        inputs.add(loadLosingScratchOff());


        // Act
        int result = DayFour.solvePartOne(inputs);

        // Assert
        int expected = 17; // expected sum
        assertEquals(expected, result);
    }

    // Test solvePartTwo
    @Test
    public void testSolvePartTwoWithValidInputs() {
        // Arrange
        List<ScratchOff> inputs = new ArrayList<ScratchOff>();
        // Returns 1 match
        inputs.add(loadSingleWinScratchOff()); // 1 card
        // Returns 4 matches each
        inputs.add(loadMultiWinScratchOff()); // 2 cards
        inputs.add(loadMultiWinScratchOff()); // 3 cards
        // Returns 0 matches
        inputs.add(loadLosingScratchOff()); // 6 cards
        inputs.add(loadLosingScratchOff()); // 6 cards


        // Act
        int result = DayFour.solvePartTwo(inputs);

        // Assert
        int expected = 18; // expected sum
        assertEquals(expected, result);
    }

}
