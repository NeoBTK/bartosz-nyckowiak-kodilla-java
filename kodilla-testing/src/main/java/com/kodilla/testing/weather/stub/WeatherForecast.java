package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {
        double result = 0.0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            result += temperature.getValue();
        }
        return result / temperatures.getTemperatures().size();
    }

    public double calculateMedianTemperature() {
        List<Double> result = new ArrayList<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            result.add(temperature.getValue());
        }
        Collections.sort(result);
        if (result.size() % 2 == 0) {
            return (result.get(result.size() / 2 - 1) + result.get(result.size() / 2)) / 2;
        } else {
            return result.get(result.size() / 2);
        }
    }
}
