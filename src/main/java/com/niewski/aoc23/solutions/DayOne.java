package com.niewski.aoc23.solutions;

import com.niewski.aoc23.responses.DayOneResponse;

public class DayOne {

    public static DayOneResponse solve(String[] inputs) {
        int resultPartOne = 0;
        int resultPartTwo = 0;

        for (String input : inputs) {
            resultPartOne += getNumberFromDigits(input);
            resultPartTwo += getNumberFromDigitsAndWords(input);
        }

        return new DayOneResponse(resultPartOne, resultPartTwo);
    }

    public static int solvePartOne(String[] inputs) {
        int result = 0;
        for (String input : inputs) {
            if(input.length() > 0){
                result += getNumberFromDigits(input);
            }
        }
        return result;
    }

    public static int solvePartTwo(String[] inputs) {
        int result = 0;
        for (String input : inputs) {
            if(input.length() > 0){
                result += getNumberFromDigitsAndWords(input);
            }
        }
        return result;
    }   

    private static int getNumberFromDigitsAndWords(String input) {
        int left = 0, right = input.length() - 1;
        String result = "";
        // Find first digit
        while (left < right) {
            if (Character.isDigit(input.charAt(left))) {
                result += input.charAt(left);
                break;
            }  
            // Depending on the word, add the corresponding digit to the result
            if (input.charAt(left) == 'o' && input.substring(left, Math.min(right, left + 3)).equals("one")) {
                result += "1";
                left += 2;
                break;
            }
            if(input.charAt(left) == 't') {
                if(input.substring(left, Math.min(right, left + 3)).equals("two")) {
                    result += "2";
                    left += 3;
                    break;
                }
                if(input.substring(left, Math.min(right, left + 5)).equals("three")) {
                    result += "3";
                    left += 5;
                    break;
                }
            }
            if(input.charAt(left) == 'f') {
                if(input.substring(left, Math.min(right, left + 4)).equals("four")) {
                    result += "4";
                    left += 4;
                    break;
                }
                if(input.substring(left, Math.min(right, left + 4)).equals("five")) {
                    result += "5";
                    left += 5;
                    break;
                }
            }
            if(input.charAt(left) == 's') {
                if(input.substring(left, Math.min(right, left + 3)).equals("six")) {
                    result += "6";
                    left += 3;
                    break;
                }
                if(input.substring(left, Math.min(right, left + 5)).equals("seven")) {
                    result += "7";
                    left += 5;
                    break;
                }
            }
            if(input.charAt(left) == 'e' && input.substring(left, Math.min(right, left + 5)).equals("eight")) {
                result += "8";
                left += 5;
                break;
            }
            if(input.charAt(left) == 'n' && input.substring(left, Math.min(right,left + 4)).equals("nine")) {
                result += "9";
                left += 4;
                break;
            }
            left++;
        }
        // If the first digit is the last character in the string, return the digit twice
        if(result.length()==0) {
            if (Character.isDigit(input.charAt(left))) {
                result += input.charAt(left);
                result += input.charAt(left);
                return Integer.parseInt(result);
            } else {
                return 0;
            }
        } 
        // Find the last digit
        while (right >= left) {
            // If we reach the first digit, add it to the result again
            if(right == left) {
                result += result.charAt(0);
                break;
            }
            if (Character.isDigit(input.charAt(right))) {
                result += input.charAt(right);
                break;
            } 
            // Depending on the word, add the corresponding digit to the result
            if(input.charAt(right) == 'e') {
                if(input.substring(Math.max(0, right - 2), right + 1).equals("one")) {
                    result += "1";
                    break;
                }
                if(input.substring(Math.max(0, right - 4), right + 1).equals("three")) {
                    result += "3";
                    break;
                }
                if(input.substring(Math.max(0, right - 3), right + 1).equals("five")) {
                    result += "5";
                    break;
                }
                if(input.substring(Math.max(0, right - 3), right + 1).equals("nine")) {
                    result += "9";
                    break;
                }
            }
            if(input.charAt(right) == 'o' && input.substring(Math.max(0, right - 2), right + 1).equals("two")) {
                result += "2";
                break;
            }
            if(input.charAt(right) == 'r' && input.substring(Math.max(0, right - 3), right + 1).equals("four")) {
                result += "4";
                break;
            }
            if(input.charAt(right) == 'x' && input.substring(Math.max(0, right - 2), right + 1).equals("six")) {
                result += "6";
                break;
            }
            if(input.charAt(right) == 'n' && input.substring(Math.max(0, right - 4), right + 1).equals("seven")) {
                result += "7";
                break;
            }
            if(input.charAt(right) == 't' && input.substring(Math.max(0, right - 4), right + 1).equals("eight")) {
                result += "8";
                break;
            }
            right--;
        }
        return result.length()==0 ? 0 : Integer.parseInt(result);
    }

    private static int getNumberFromDigits(String input) {
        int left = 0, right = input.length() - 1;
        String result = "";
        // Find first digit
        while (left < right) {
            if (Character.isDigit(input.charAt(left))) {
                result += input.charAt(left);
                break;
            } else {
                left++;
            }
        }
        // If the first digit is the last character in the string, return the digit twice
        if(result.length()==0) {
            if (Character.isDigit(input.charAt(left))) {
                result += input.charAt(left);
                result += input.charAt(left);
                return Integer.parseInt(result);
            } else {
                return 0;
            }
        } 
        // Find the last digit
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
