// FILEPATH: /c:/Users/niews/Repositories/aoc23-back/src/test/java/com/niewski/aoc23/solutions/DayFiveTest.java

package com.niewski.aoc23.solutions;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.niewski.aoc23.dto.IslandAlmanac;

public class DayFiveTest {

    @Mock
    private IslandAlmanac mockAlmanac;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSolvePartOne() {
        // Arrange
        List<Long> seeds = Arrays.asList(79L, 14L, 55L, 13L);
        when(mockAlmanac.getSeeds()).thenReturn(seeds);

        List<List<Long>> stsList = Arrays.asList(Arrays.asList(50L, 98L, 2L), Arrays.asList(52L, 50L, 48L));
        when(mockAlmanac.getSeedToSoil()).thenReturn(stsList);
        List<List<Long>> stfList = Arrays.asList(Arrays.asList(0L, 15L, 37L), Arrays.asList(37L, 52L, 2L), Arrays.asList(39L, 0L, 15L));
        when(mockAlmanac.getSoilToFertilizer()).thenReturn(stfList);
        List<List<Long>> ftwList = Arrays.asList(Arrays.asList(49L, 53L, 8L), Arrays.asList(0L, 11L, 42L), Arrays.asList(42L, 0L, 7L), Arrays.asList(57L, 7L, 4L));
        when(mockAlmanac.getFertilizerToWater()).thenReturn(ftwList);
        List<List<Long>> wtlList = Arrays.asList(Arrays.asList(88L, 18L, 7L), Arrays.asList(18L, 25L, 70L));
        when(mockAlmanac.getWaterToLight()).thenReturn(wtlList);
        List<List<Long>> lttList = Arrays.asList(Arrays.asList(45L, 77L, 23L), Arrays.asList(81L, 45L, 19L), Arrays.asList(68L, 64L, 13L));
        when(mockAlmanac.getLightToTemperature()).thenReturn(lttList);
        List<List<Long>> tthList = Arrays.asList(Arrays.asList(0L, 69L, 1L), Arrays.asList(1L, 0L, 69L));
        when(mockAlmanac.getTemperatureToHumidity()).thenReturn(tthList);
        List<List<Long>> htlList = Arrays.asList(Arrays.asList(60L, 56L, 37L), Arrays.asList(56L, 93L, 4L));
        when(mockAlmanac.getHumidityToLocation()).thenReturn(htlList);
        
        // Act
        long result = DayFive.solvePartOne(mockAlmanac);

        // Assert
        assertEquals(35, result);
    }

    @Test
    public void testSolvePartOneWithEmptySeeds() {
        // Arrange
        List<Long> seeds = Arrays.asList();
        when(mockAlmanac.getSeeds()).thenReturn(seeds);

        // Act
        long result = DayFive.solvePartOne(mockAlmanac);

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void testSolvePartOneWithNullMaps() {
        // Arrange
        List<Long> seeds = Arrays.asList(1L, 2L, 3L);
        when(mockAlmanac.getSeeds()).thenReturn(seeds);

        // Act
        long result = DayFive.solvePartOne(mockAlmanac);

        // Assert
        assertEquals(1, result); // The smallest seed is returned when all maps are null
    }

    // Solve Part Two
    @Test
    public void testSolvePartTwo() {
        // Arrange
        List<Long> seeds = Arrays.asList(79L, 14L, 55L, 13L);
        when(mockAlmanac.getSeeds()).thenReturn(seeds);

        List<List<Long>> stsList = Arrays.asList(Arrays.asList(50L, 98L, 2L), Arrays.asList(52L, 50L, 48L));
        when(mockAlmanac.getSeedToSoil()).thenReturn(stsList);
        List<List<Long>> stfList = Arrays.asList(Arrays.asList(0L, 15L, 37L), Arrays.asList(37L, 52L, 2L), Arrays.asList(39L, 0L, 15L));
        when(mockAlmanac.getSoilToFertilizer()).thenReturn(stfList);
        List<List<Long>> ftwList = Arrays.asList(Arrays.asList(49L, 53L, 8L), Arrays.asList(0L, 11L, 42L), Arrays.asList(42L, 0L, 7L), Arrays.asList(57L, 7L, 4L));
        when(mockAlmanac.getFertilizerToWater()).thenReturn(ftwList);
        List<List<Long>> wtlList = Arrays.asList(Arrays.asList(88L, 18L, 7L), Arrays.asList(18L, 25L, 70L));
        when(mockAlmanac.getWaterToLight()).thenReturn(wtlList);
        List<List<Long>> lttList = Arrays.asList(Arrays.asList(45L, 77L, 23L), Arrays.asList(81L, 45L, 19L), Arrays.asList(68L, 64L, 13L));
        when(mockAlmanac.getLightToTemperature()).thenReturn(lttList);
        List<List<Long>> tthList = Arrays.asList(Arrays.asList(0L, 69L, 1L), Arrays.asList(1L, 0L, 69L));
        when(mockAlmanac.getTemperatureToHumidity()).thenReturn(tthList);
        List<List<Long>> htlList = Arrays.asList(Arrays.asList(60L, 56L, 37L), Arrays.asList(56L, 93L, 4L));
        when(mockAlmanac.getHumidityToLocation()).thenReturn(htlList);
        
        // Act
        long result = DayFive.solvePartTwo(mockAlmanac);

        // Assert
        assertEquals(46, result);
    }

    @Test
    public void testSolvePartTwoWithEmptySeeds() {
        // Arrange
        List<Long> seeds = Arrays.asList();
        when(mockAlmanac.getSeeds()).thenReturn(seeds);

        // Act
        long result = DayFive.solvePartTwo(mockAlmanac);

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void testSolvePartTwoWithNullMaps() {
        // Arrange
        List<Long> seeds = Arrays.asList(1L, 2L, 3L);
        when(mockAlmanac.getSeeds()).thenReturn(seeds);

        // Act
        long result = DayFive.solvePartTwo(mockAlmanac);

        // Assert
        assertEquals(1, result); // The smallest seed is returned when all maps are null
    }
}