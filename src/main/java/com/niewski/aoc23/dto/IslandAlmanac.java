package com.niewski.aoc23.dto;

import java.util.List;

public class IslandAlmanac {
    private List<Integer> seeds;
    private List<List<Integer>> seedToSoil;
    private List<List<Integer>> soilToFertilizer;
    private List<List<Integer>> fertilizerToWater;
    private List<List<Integer>> waterToLight;
    private List<List<Integer>> lightToTemperature;
    private List<List<Integer>> temperatureToHumidity;
    private List<List<Integer>> humidityToLocation;

    // Constructor
    public IslandAlmanac(List<Integer> seeds, List<List<Integer>> seedToSoil, List<List<Integer>> soilToFertilizer, List<List<Integer>> fertilizerToWater, List<List<Integer>> waterToLight, List<List<Integer>> lightToTemperature, List<List<Integer>> temperatureToHumidity, List<List<Integer>> humidityToLocation) {
        this.seeds = seeds;
        this.seedToSoil = seedToSoil;
        this.soilToFertilizer = soilToFertilizer;
        this.fertilizerToWater = fertilizerToWater;
        this.waterToLight = waterToLight;
        this.lightToTemperature = lightToTemperature;
        this.temperatureToHumidity = temperatureToHumidity;
        this.humidityToLocation = humidityToLocation;
    }

    // Getters and Setters
    public List<Integer> getSeeds() {
        return seeds;
    }

    public void setSeeds(List<Integer> seeds) {
        this.seeds = seeds;
    }

    public List<List<Integer>> getSeedToSoil() {
        return seedToSoil;
    }

    public void setSeedToSoil(List<List<Integer>> seedToSoil) {
        this.seedToSoil = seedToSoil;
    }

    public List<List<Integer>> getSoilToFertilizer() {
        return soilToFertilizer;
    }

    public void setSoilToFertilizer(List<List<Integer>> soilToFertilizer) {
        this.soilToFertilizer = soilToFertilizer;
    }

    public List<List<Integer>> getFertilizerToWater() {
        return fertilizerToWater;
    }

    public void setFertilizerToWater(List<List<Integer>> fertilizerToWater) {
        this.fertilizerToWater = fertilizerToWater;
    }

    public List<List<Integer>> getWaterToLight() {
        return waterToLight;
    }

    public void setWaterToLight(List<List<Integer>> waterToLight) {
        this.waterToLight = waterToLight;
    }

    public List<List<Integer>> getLightToTemperature() {
        return lightToTemperature;
    }

    public void setLightToTemperature(List<List<Integer>> lightToTemperature) {
        this.lightToTemperature = lightToTemperature;
    }

    public List<List<Integer>> getTemperatureToHumidity() {
        return temperatureToHumidity;
    }

    public void setTemperatureToHumidity(List<List<Integer>> temperatureToHumidity) {
        this.temperatureToHumidity = temperatureToHumidity;
    }

    public List<List<Integer>> getHumidityToLocation() {
        return humidityToLocation;
    }

    public void setHumidityToLocation(List<List<Integer>> humidityToLocation) {
        this.humidityToLocation = humidityToLocation;
    }

}
