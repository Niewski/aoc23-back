package com.niewski.aoc23.solutions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        for (Long seed: almanac.getSeeds()) {
            // Create map for relevant list and set destination
            Map<Long, Long> map = getMap(almanac.getSeedToSoil());
            long soil = map.getOrDefault(seed, seed);

            map = getMap(almanac.getSoilToFertilizer());
            long fertilizer = map.getOrDefault(soil, soil);

            map = getMap(almanac.getFertilizerToWater());
            long water = map.getOrDefault(fertilizer, fertilizer);

            map = getMap(almanac.getWaterToLight());
            long light = map.getOrDefault(water, water);

            map = getMap(almanac.getLightToTemperature());
            long temperature = map.getOrDefault(light, light);

            map = getMap(almanac.getTemperatureToHumidity());
            long humidity = map.getOrDefault(temperature, temperature);

            map = getMap(almanac.getHumidityToLocation());
            long location = map.getOrDefault(humidity, humidity);
            
            // Check if location is less than current result
            result = result == 0 ? location : Math.min(location, result);
        }
        return result;
    }

    public static long solvePartTwo(IslandAlmanac scratchOffs) {
        long result = 0;
        
        return result;
    }

    private static Map<Long, Long> getMap(List<List<Long>> input) {
        Map<Long, Long> map = new HashMap<Long, Long>();
        for (List<Long> list : input) {
            long range = list.get(2);
            Long source = list.get(1);
            long destination = list.get(0);
            for(long i = 0; i < range; i++) {
                map.put(source + i, destination + i);
            }
        }
        return map;
    }

}
