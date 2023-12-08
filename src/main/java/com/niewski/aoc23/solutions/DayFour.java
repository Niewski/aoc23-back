package com.niewski.aoc23.solutions;

import java.util.List;

import com.niewski.aoc23.dto.ScratchOff;
import com.niewski.aoc23.responses.TwoIntResponse;

public class DayFour {

    public static TwoIntResponse solve(List<ScratchOff> inputs) {
        int resultPartOne = solvePartOne(inputs);
        int resultPartTwo = solvePartTwo(inputs);

        return new TwoIntResponse(resultPartOne, resultPartTwo);
    }

    public static int solvePartOne(List<ScratchOff> scratchOffs) {
        int result = 0;
        for (ScratchOff scratchOff : scratchOffs) {
            int points = 0;
            List<Integer> winningNumbers = scratchOff.getWinningNumbers();
            List<Integer> myNumbers = scratchOff.getMyNumbers();
            for (Integer myNumber : myNumbers) {
                if (winningNumbers.contains(myNumber)) {
                    points = points == 0 ? 1 : points * 2;
                }
            }
            result += points;
        }
        return result;
    }

    public static int solvePartTwo(List<ScratchOff> scratchOffs) {
        return 0;
    }

}
