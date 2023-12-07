package com.niewski.aoc23.responses;

public class TwoIntResponse {
    private int resultPartOne;
    private int resultPartTwo;

    // Constructor
    public TwoIntResponse(int resultPartOne, int resultPartTwo) {
        this.resultPartOne = resultPartOne;
        this.resultPartTwo = resultPartTwo;
    }

    // Getters and Setters
    public int getResultPartOne() {
        return resultPartOne;
    }

    public void setResultPartOne(int resultPartOne) {
        this.resultPartOne = resultPartOne;
    }

    public int getResultPartTwo() {
        return resultPartTwo;
    }

    public void setResultPartTwo(int resultPartTwo) {
        this.resultPartTwo = resultPartTwo;
    }
}