package com.niewski.aoc23.solutions;

public class DayTwo {
    public static int solve(String input) {
        int result = 0;
        int gameId = 0;
        int left = 0, right = 0;

        if(input.length() == 0) {
            return 0;
        }

        // Get first : index
        while(left < input.length()) {
            if(input.charAt(left) == ':'){
                break;
            } 
            left++;
        }

        // Begin parsing games
        while(left < input.length()) {
             right = left;
            // Games are in order, so we can increment Id
            gameId++;

            // Get substring
            while(right < input.length()) {
                if(input.charAt(right) == 'G'){
                    break;
                } 
                right++;
            }
            String substring = input.substring(left, right);

            // Check cubes
            result += canPlay(substring) ? gameId : 0;

            // Find next game
            left = right + 3;
            while(left < input.length()) {
                if(input.charAt(left) == ':'){
                    break;
                } 
                left++;
            }
        }

        return result;
    }


    private static Boolean canPlay(String input) {
        int left = 0, right = 0;
        int r = 12, g = 13, b = 14;

        while(right < input.length()) {
            // Get number
            String numString = "";

            // Get first digit
            while (left < input.length()) {
                if(Character.isDigit(input.charAt(left))) {
                    break;
                }
                left++;
            }
            // Need to leave if left hit the end of the string
            if(left == input.length()) {
                break;
            }
            right = left;
            numString += input.charAt(left);
            right++;

            // Get rest of digits (if they exist)
            while(right < input.length()) {
                if(!Character.isDigit(input.charAt(right))) {
                    break;
                }
                numString += input.charAt(right);
                right++;
            }
            int num = Integer.parseInt(numString);

            // Get color
            while(right < input.length()) {
                if(input.charAt(right) == 'r' || input.charAt(right) == 'g' || input.charAt(right) == 'b') {
                    break;
                }
                right++;
            }

            // Check if can play
            if(input.charAt(right) == 'r' && num > r) {
                return false;
            } else if(input.charAt(right) == 'g' && num > g) {
                return false;
            } else if(input.charAt(right) == 'b' && num > b) {
                return false;
            }
            left = right;
        }

        return true;
    }

}
