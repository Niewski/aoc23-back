package com.niewski.aoc23.dto;

import java.util.List;

public class ScratchOff {
    private List<Integer> winningNumbers;
    private List<Integer> myNumbers;

    // Constructor
    public ScratchOff(List<Integer> winningNumbers, List<Integer> myNumbers) {
        this.winningNumbers = winningNumbers;
        this.myNumbers = myNumbers;
    }

    // Getters and Setters
    public List<Integer> getWinningNumbers() {
        return winningNumbers;
    }

    public void setWinningNumbers(List<Integer> winningNumbers) {
        this.winningNumbers = winningNumbers;
    }

    public List<Integer> getMyNumbers() {
        return myNumbers;
    }

    public void setMyNumbers(List<Integer> myNumbers) {
        this.myNumbers = myNumbers;
    }
}
