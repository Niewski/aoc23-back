package com.niewski.aoc23.responses;

public class DayOneResponse {
    private int resultPartOne;
    private int resultPartTwo;

    // Constructor
    public DayOneResponse(int resultPartOne, int resultPartTwo) {
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