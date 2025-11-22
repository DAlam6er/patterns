package ru.study.headfirst.pattern.observer.weatherstation.v1.display.impl;

import ru.study.headfirst.pattern.observer.weatherstation.v1.display.DisplayElement;
import ru.study.headfirst.pattern.observer.weatherstation.v1.observer.Observer;
import ru.study.headfirst.pattern.observer.weatherstation.v1.subject.impl.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemperature = Float.MIN_VALUE;
    private float minTemperature = Float.MAX_VALUE;
    private float tempSum = 0.0F;
    private int numReadings;
    private WeatherData weatherData; // храним для возможности отмены регистрации

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;

        if (temp > maxTemperature) {
            maxTemperature = temp;
        }

        if (temp < minTemperature) {
            minTemperature = temp;
        }

        display();
    }

    @Override
    public void display() {
        System.out.printf("Avg/Max/Min temperature = %f/%f/%f\n", (tempSum/numReadings), maxTemperature, minTemperature);
    }
}
