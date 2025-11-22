package ru.study.headfirst.pattern.observer.weatherstation.v1.subject.impl;

import ru.study.headfirst.pattern.observer.weatherstation.v1.observer.Observer;
import ru.study.headfirst.pattern.observer.weatherstation.v1.subject.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherData implements Subject {
    /**
     * Контейнер для хранения наблюдателей
     */
    private final List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void generateRandomMeasurements() {
        this.temperature = generateRandomTemperature();
        this.humidity = generateRandomHumidity();
        this.pressure = generateRandomPressure();
        measurementsChanged();
    }

    /**
     * Оповещение наблюдателей о появлении новых данных
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * Оповещение наблюдателей об изменении состояния
     */
    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(temperature, humidity, pressure));
    }

    private float generateRandomTemperature() {
        float min = 2.0F;
        float max = 15.0F;

        return new Random().nextFloat() * (max - min + 1) + min;
    }

    private float generateRandomHumidity() {
        float min = 86.0F;
        float max = 93.2F;

        return new Random().nextFloat() * (max - min + 1) + min;
    }

    private float generateRandomPressure() {
        float min = 99.9918F;
        float max = 101.325F;

        return new Random().nextFloat() * (max - min + 1) + min;
    }
}
