package ru.study.headfirst.pattern.observer.weatherstation.v2.display.impl;

import ru.study.headfirst.pattern.observer.weatherstation.v2.display.DisplayElement;
import ru.study.headfirst.pattern.observer.weatherstation.v2.observer.Observer;
import ru.study.headfirst.pattern.observer.weatherstation.v2.subject.impl.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemperature = Float.MIN_VALUE;
    private float minTemperature = Float.MAX_VALUE;
    private float tempSum = 0.0F;
    private int numReadings;
    private final WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        var currentTemperature = weatherData.getTemperature();
        tempSum += currentTemperature;
        numReadings++;

        if (currentTemperature > maxTemperature) {
            maxTemperature = currentTemperature;
        }

        if (currentTemperature < minTemperature) {
            minTemperature = currentTemperature;
        }

        display();
    }

    @Override
    public void display() {
        System.out.printf("Avg/Max/Min temperature = %f/%f/%f\n", (tempSum/numReadings), maxTemperature, minTemperature);
    }
}
