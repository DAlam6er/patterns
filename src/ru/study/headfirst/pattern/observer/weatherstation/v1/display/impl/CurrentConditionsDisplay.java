package ru.study.headfirst.pattern.observer.weatherstation.v1.display.impl;

import ru.study.headfirst.pattern.observer.weatherstation.v1.display.DisplayElement;
import ru.study.headfirst.pattern.observer.weatherstation.v1.observer.Observer;
import ru.study.headfirst.pattern.observer.weatherstation.v1.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData; // храним для возможности отмены регистрации

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /**
     *
     * @param temp температура, передаваемая наблюдателям при изменении состояния субъекта
     * @param humidity влажность, передаваемая наблюдателям при изменении состояния субъекта
     * @param pressure давление, передаваемое наблюдателям при изменении состояния субъекта
     *
     * Давление передается, но никак не используется в данном классе - намеренно для демонстрации недостатка v1
     */
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.printf("Current conditions: %f Celsius degrees and %f humidity\n", temperature, humidity);
    }
}
