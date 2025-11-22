package ru.study.headfirst.pattern.observer.weatherstation.v2.display.impl;

import ru.study.headfirst.pattern.observer.weatherstation.v2.display.DisplayElement;
import ru.study.headfirst.pattern.observer.weatherstation.v2.observer.Observer;
import ru.study.headfirst.pattern.observer.weatherstation.v2.subject.impl.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 100.00F;
    private float lastPressure;
    private final WeatherData weatherData; // храним для возможности отмены регистрации

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();

        display();
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
