package com.niewski.aoc23.solutions;

import java.util.List;

import com.niewski.aoc23.dto.IslandAlmanac;
import com.niewski.aoc23.responses.TwoLongResponse;

public class DayFive {

    public static TwoLongResponse solve(IslandAlmanac inputs) {
        long resultPartOne = solvePartOne(inputs);
        long resultPartTwo = solvePartTwo(inputs);

        return new TwoLongResponse(resultPartOne, resultPartTwo);
    }

    public static long solvePartOne(IslandAlmanac almanac) {
        long result = 0;
        // Iterate through seeds and get the location for each seed
        for (Long code: almanac.getSeeds()) {
            code = findValue(almanac.getSeedToSoil(), code);
            code = findValue(almanac.getSoilToFertilizer(), code);
            code = findValue(almanac.getFertilizerToWater(), code);
            code = findValue(almanac.getWaterToLight(), code);
            code = findValue(almanac.getLightToTemperature(), code);
            code = findValue(almanac.getTemperatureToHumidity(), code);
            code = findValue(almanac.getHumidityToLocation(), code);

            // Check if location is less than current result
            result = result == 0 ? code : Math.min(code, result);
        }
        return result;
    }

    // Sooooo sloww
    public static long solvePartTwo(IslandAlmanac almanac) {
        long result = 0;
        int count = almanac.getSeeds().size();

        // Iterate through seeds and get the location for each seed
        for(int i = 0; i < count / 2; i++) {
            long start = almanac.getSeeds().get(i);
            i++;
            long end = start + almanac.getSeeds().get(i);
            for(long j = start; j < end; j++) {
                long code = j;
                code = findValue(almanac.getSeedToSoil(), code);
                code = findValue(almanac.getSoilToFertilizer(), code);
                code = findValue(almanac.getFertilizerToWater(), code);
                code = findValue(almanac.getWaterToLight(), code);
                code = findValue(almanac.getLightToTemperature(), code);
                code = findValue(almanac.getTemperatureToHumidity(), code);
                code = findValue(almanac.getHumidityToLocation(), code);

                // Check if location is less than current result
                result = result == 0 ? code : Math.min(code, result);
            }
        }

        return result;
    }

    private static long findValue(List<List<Long>> lists, long value) {
        for (List<Long> list : lists) {
            long range = list.get(2);
            long source = list.get(1);
            if(source <= value && value < source + range) {
                long destination = list.get(0);
                return destination + (value - source);
            }
        }
        return value;
    }

}
