package com.niewski.aoc23.responses;

public class TwoLongResponse {
    private long resultPartOne;
    private long resultPartTwo;

    // Constructor
    public TwoLongResponse(long resultPartOne, long resultPartTwo) {
        this.resultPartOne = resultPartOne;
        this.resultPartTwo = resultPartTwo;
    }

    // Getters and Setters
    public long getResultPartOne() {
        return resultPartOne;
    }

    public void setResultPartOne(long resultPartOne) {
        this.resultPartOne = resultPartOne;
    }

    public long getResultPartTwo() {
        return resultPartTwo;
    }

    public void setResultPartTwo(long resultPartTwo) {
        this.resultPartTwo = resultPartTwo;
    }
    
}
