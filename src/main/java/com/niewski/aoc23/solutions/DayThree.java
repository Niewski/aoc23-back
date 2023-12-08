package com.niewski.aoc23.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.niewski.aoc23.responses.TwoIntResponse;

public class DayThree {
    private static final int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static final int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static TwoIntResponse solve(char[][] inputs) {
        int resultPartOne = solvePartOne(inputs);
        int resultPartTwo = solvePartTwo(inputs);

        return new TwoIntResponse(resultPartOne, resultPartTwo);
    }

    public static int solvePartOne(char[][] grid) {
        int result = 0;
        List<Integer> numbers = new ArrayList<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        // Find all symbols and their positions
        Map<Character, List<int[]>> symbols = findSymbols(grid);
        for (Map.Entry<Character, List<int[]>> entry : symbols.entrySet()) {
            List<int[]> positions = entry.getValue();
            for (int[] position : positions) {
                // Find all numbers around the symbol
                numbers.addAll(findNumbers(grid, visited, position[0], position[1]));
            }
        }
        // Add all numbers
        for (Integer number : numbers) {
            result += number;
        }
        return result;
    }

    public static int solvePartTwo(char[][] grid) {
        int result = 0;
        // Find all symbols and their positions
        Map<Character, List<int[]>> symbols = findSymbols(grid);
        // Only checking for *
        List<int[]> positions = symbols.get('*');
        for (int[] position : positions) {
            // Need to reset visited for each symbol
            boolean[][] visited = new boolean[grid.length][grid[0].length];
            // Find all numbers around the symbol
            List<Integer> numbers = findNumbers(grid, visited, position[0], position[1]);
            if(numbers.size() == 2) {
                // Add the product of the numbers to result
                result += numbers.get(0) * numbers.get(1);
            }
        }
        return result;
    }

    private static Map<Character, List<int[]>> findSymbols(char[][] grid) {
        Map<Character, List<int[]>> symbols = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                char cell = grid[i][j];
                if (!Character.isDigit(cell) && cell != '.') {
                    symbols.putIfAbsent(cell, new ArrayList<>());
                    symbols.get(cell).add(new int[]{i, j});
                }
            }
        }
        return symbols;
    }
    
    private static List<Integer> findNumbers(char[][] grid, boolean[][] visited, int x, int y) {
        List<Integer> numbers = new ArrayList<>();
        // Check all 8 directions
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i], ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < grid.length && ny < grid[0].length && Character.isDigit(grid[nx][ny]) && !visited[nx][ny]) {
                // Build number from all digits
                int number = getNumber(grid, visited, nx, ny);
                numbers.add(number);
            }
        }
        return numbers;
    }

    private static int getNumber(char[][] grid, boolean[][] visited, int x, int y) {
        StringBuilder number = new StringBuilder();
        // Move left to find the start of the number
        while (y >= 0 && Character.isDigit(grid[x][y])) {
            y--;
        }
        // Move right to collect all digits
        y++;
        while (y < grid[0].length && Character.isDigit(grid[x][y])) {
            // Mark as visited so we don't repeat numbers
            visited[x][y] = true;
            number.append(grid[x][y]);
            y++;
        }
        return Integer.parseInt(number.toString());
    }
    
}
