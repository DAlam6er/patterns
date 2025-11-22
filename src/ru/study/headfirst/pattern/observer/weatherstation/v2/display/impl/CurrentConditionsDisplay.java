package ru.study.headfirst.pattern.observer.weatherstation.v2.display.impl;

import ru.study.headfirst.pattern.observer.weatherstation.v2.display.DisplayElement;
import ru.study.headfirst.pattern.observer.weatherstation.v2.observer.Observer;
import ru.study.headfirst.pattern.observer.weatherstation.v2.subject.impl.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private final WeatherData weatherData; // храним для возможности отмены регистрации

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.printf("Current conditions: %f Celsius degrees and %f humidity\n", temperature, humidity);
    }
}
