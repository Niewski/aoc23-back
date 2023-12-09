package com.niewski.aoc23.dto;

import java.util.List;

public class IslandAlmanac {
    private List<Long> seeds;
    private List<List<Long>> seedToSoil;
    private List<List<Long>> soilToFertilizer;
    private List<List<Long>> fertilizerToWater;
    private List<List<Long>> waterToLight;
    private List<List<Long>> lightToTemperature;
    private List<List<Long>> temperatureToHumidity;
    private List<List<Long>> humidityToLocation;

    // Constructor
    public IslandAlmanac(List<Long> seeds, List<List<Long>> seedToSoil, List<List<Long>> soilToFertilizer, List<List<Long>> fertilizerToWater, List<List<Long>> waterToLight, List<List<Long>> lightToTemperature, List<List<Long>> temperatureToHumidity, List<List<Long>> humidityToLocation) {
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
    public List<Long> getSeeds() {
        return seeds;
    }

    public void setSeeds(List<Long> seeds) {
        this.seeds = seeds;
    }

    public List<List<Long>> getSeedToSoil() {
        return seedToSoil;
    }

    public void setSeedToSoil(List<List<Long>> seedToSoil) {
        this.seedToSoil = seedToSoil;
    }

    public List<List<Long>> getSoilToFertilizer() {
        return soilToFertilizer;
    }

    public void setSoilToFertilizer(List<List<Long>> soilToFertilizer) {
        this.soilToFertilizer = soilToFertilizer;
    }

    public List<List<Long>> getFertilizerToWater() {
        return fertilizerToWater;
    }

    public void setFertilizerToWater(List<List<Long>> fertilizerToWater) {
        this.fertilizerToWater = fertilizerToWater;
    }

    public List<List<Long>> getWaterToLight() {
        return waterToLight;
    }

    public void setWaterToLight(List<List<Long>> waterToLight) {
        this.waterToLight = waterToLight;
    }

    public List<List<Long>> getLightToTemperature() {
        return lightToTemperature;
    }

    public void setLightToTemperature(List<List<Long>> lightToTemperature) {
        this.lightToTemperature = lightToTemperature;
    }

    public List<List<Long>> getTemperatureToHumidity() {
        return temperatureToHumidity;
    }

    public void setTemperatureToHumidity(List<List<Long>> temperatureToHumidity) {
        this.temperatureToHumidity = temperatureToHumidity;
    }

    public List<List<Long>> getHumidityToLocation() {
        return humidityToLocation;
    }

    public void setHumidityToLocation(List<List<Long>> humidityToLocation) {
        this.humidityToLocation = humidityToLocation;
    }

}
