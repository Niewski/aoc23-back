package com.niewski.aoc23.solutions;

import java.util.ArrayList;
import java.util.HashMap;

import com.niewski.aoc23.responses.TwoIntResponse;

public class DayTwo {
    public static TwoIntResponse solve(String input) {
        int resultPartOne = 0;
        int resultPartTwo = 0;
        int gameId = 0;

        if(input.length() == 0) {
            return new TwoIntResponse(0, 0);
        }

        String[] games = parseGameStrings(input);

        for(String game : games) {
            // Games are in order, so we can increment Id
            gameId++;

            // Check minimum cubes
            HashMap<String, Integer> cubeMap = getMinimumCubes(game);

            // Can play
            resultPartOne += canPlay(cubeMap) ? gameId : 0;

            // Calculate cube power
            resultPartTwo += calculateCubePower(cubeMap);
        }

        return new TwoIntResponse(resultPartOne, resultPartTwo);
    }

    public static int solvePartOne(String input) {
        int result = 0;
        int gameId = 0;

        if(input.length() == 0) {
            return 0;
        }
        String[] games = parseGameStrings(input);

        for(String game : games) {
            // Games are in order, so we can increment Id
            gameId++;

            // Check minimum cubes
            HashMap<String, Integer> cubeMap = getMinimumCubes(game);

            // Can play
            result += canPlay(cubeMap) ? gameId : 0;
        }
        return result;
    }

    public static int solvePartTwo(String input) {
        int result = 0;

        if(input.length() == 0) {
            return 0;
        }
        String[] games = parseGameStrings(input);

        for(String game : games) {
            // Check minimum cubes
            HashMap<String, Integer> cubeMap = getMinimumCubes(game);

            // Calculate cube power
            result += calculateCubePower(cubeMap);
        }
        return result;
    }

    private static String[] parseGameStrings(String input) {
        ArrayList<String> games = new ArrayList<>();
        int left = 0, right = 0;

        // Get first : index
        while(left < input.length()) {
            if(input.charAt(left) == ':'){
                break;
            }
            left++;
        }

        while(left < input.length()) {
            right = left;

            // Get substring
            while(right < input.length()) {
                if(input.charAt(right) == 'G'){
                    break;
                }
                right++;
            }
            games.add(input.substring(left, right));

            // Find next game
            left = right + 3;
            while(left < input.length()) {
                if(input.charAt(left) == ':'){
                    break;
                }
                left++;
            }
        }

        return games.toArray(new String[0]);
    }

    private static HashMap<String, Integer> getMinimumCubes(String input) {
        int left = 0, right = 0;

        // Initialize cube map
        HashMap<String, Integer> cubeMap = new HashMap<>();
        cubeMap.put("R", 0);
        cubeMap.put("G", 0);
        cubeMap.put("B", 0);

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

            // Set largest number for color
            if(input.charAt(right) == 'r' && num > cubeMap.get("R")) {
                cubeMap.put("R", num);
            } else if(input.charAt(right) == 'g' && num > cubeMap.get("G")) {
                cubeMap.put("G", num);
            } else if(input.charAt(right) == 'b' && num > cubeMap.get("B")) {
                cubeMap.put("B", num);
            }
            left = right;
        }

        return cubeMap;
    }

    private static Boolean canPlay(HashMap<String, Integer> cubeMap) {
        int r = 12, g = 13, b = 14;

        // Check if can play
        if(cubeMap.get("R") > r) {
            return false;
        } else if(cubeMap.get("G") > g) {
            return false;
        } else if(cubeMap.get("B") > b) {
            return false;
        }

        return true;
    }

    private static int calculateCubePower(HashMap<String, Integer> cubeMap) {
        return cubeMap.get("R") * cubeMap.get("G") * cubeMap.get("B");
    }

}
