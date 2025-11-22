package ru.study.headfirst.pattern.observer.weatherstation.v1.display.impl;

import ru.study.headfirst.pattern.observer.weatherstation.v1.display.DisplayElement;
import ru.study.headfirst.pattern.observer.weatherstation.v1.observer.Observer;
import ru.study.headfirst.pattern.observer.weatherstation.v1.subject.impl.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 100.00F;
    private float lastPressure;
    private WeatherData weatherData; // храним для возможности отмены регистрации

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /**
     *
     * @param temp температура, передаваемая наблюдателям при изменении состояния субъекта
     * @param humidity влажность, передаваемая наблюдателям при изменении состояния субъекта
     * @param pressure давление, передаваемое наблюдателям при изменении состояния субъекта
     *
     * Температура и влажность передаются, но никак не используются в данном классе - намеренно для демонстрации недостатка v1
     */
    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

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
