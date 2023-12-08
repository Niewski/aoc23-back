package com.niewski.aoc23.solutions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        int result = 0;
        int cardId = 1;
        Map<Integer, Integer> cardCopies = new HashMap<Integer, Integer>();
        for (ScratchOff scratchOff : scratchOffs) {
            int matches = 0;
            List<Integer> winningNumbers = scratchOff.getWinningNumbers();
            List<Integer> myNumbers = scratchOff.getMyNumbers();
            for (Integer myNumber : myNumbers) {
                if (winningNumbers.contains(myNumber)) {
                    matches++;
                }
            }
            // Check for copies of current card
            int copies = cardCopies.getOrDefault(cardId, 0);
            // Add original that you are reading
            copies++;
            // Add copies for each match
            if (matches > 0) {
                // Each card after the current gets additional copies for each match
                for (int i = 1; i <= matches; i++) {
                    // Check if there are already copies of the card
                    cardCopies.putIfAbsent(cardId + i, 0);
                    // Add 1 copy for each copy you have of current card
                    cardCopies.put(cardId + i, cardCopies.get(cardId + i) + copies);
                }
            }
            // Add copies of current card to result
            result += copies;
            // Increment cardId
            cardId++;
        }

        return result;
    }

}
