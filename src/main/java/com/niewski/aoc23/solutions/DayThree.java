package com.niewski.aoc23.solutions;

import java.util.ArrayList;
import java.util.List;

import com.niewski.aoc23.responses.TwoIntResponse;

public class DayThree {
    private static final int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static final int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    public static TwoIntResponse solve(char[][] inputs) {
        int resultPartOne = 0;
        int resultPartTwo = 0;
        List<String> numbers = findNumbers(inputs);
        for (String number : numbers) {
            resultPartOne += Integer.parseInt(number);
        }

        return new TwoIntResponse(resultPartOne, resultPartTwo);
    }

    public static int solvePartOne(char[][] inputs) {
        int result = 0;
        List<String> numbers = findNumbers(inputs);
        for (String number : numbers) {
            result += Integer.parseInt(number);
        }
        return result;
    }
    
    private static List<String> findNumbers(char[][] grid) {
        List<String> numbers = new ArrayList<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!Character.isDigit(grid[i][j]) && grid[i][j] != '.') {
                    for (int k = 0; k < 8; k++) {
                        int nx = i + dx[k], ny = j + dy[k];
                        if (nx >= 0 && ny >= 0 && nx < grid.length && ny < grid[0].length && Character.isDigit(grid[nx][ny]) && !visited[nx][ny]) {
                            StringBuilder number = new StringBuilder();
                            // Move left to find the start of the number
                            while (ny >= 0 && Character.isDigit(grid[nx][ny])) {
                                visited[nx][ny] = true;
                                ny--;
                            }
                            // Move right to collect all digits
                            ny++;
                            while (ny < grid[0].length && Character.isDigit(grid[nx][ny])) {
                                visited[nx][ny] = true;
                                number.append(grid[nx][ny]);
                                ny++;
                            }
                            numbers.add(number.toString());
                        }
                    }
                }
            }
        }
        return numbers;
    }
    
}
