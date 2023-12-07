package com.niewski.aoc23.solutions;

public class DayOne {
    public static int solve(String[] inputs) {
        int result = 0;
        for (String input : inputs) {
            result += getNumber(input);
        }
        return result;
    }

    private static int getNumber(String input) {
        int left = 0, right = input.length() - 1;
        String result = "";

        while (left < right) {
            if (Character.isDigit(input.charAt(left))) {
                result += input.charAt(left);
                break;
            } else {
                left++;
            }
        }
        if(result.length()==0) {
            if (Character.isDigit(input.charAt(left))) {
                result += input.charAt(left);
                result += input.charAt(left);
                return Integer.parseInt(result);
            } else {
                return 0;
            }
        } 
        while (right >= left) {
            if (Character.isDigit(input.charAt(right))) {
                result += input.charAt(right);
                break;
            } else {
                right--;
            }
        }
        return result.length()==0 ? 0 : Integer.parseInt(result);
    }
}
