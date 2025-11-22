package ru.study.headfirst.pattern.observer.weatherstation.v1;

import ru.study.headfirst.pattern.observer.weatherstation.v1.display.impl.CurrentConditionsDisplay;
import ru.study.headfirst.pattern.observer.weatherstation.v1.display.impl.ForecastDisplay;
import ru.study.headfirst.pattern.observer.weatherstation.v1.display.impl.StatisticsDisplay;
import ru.study.headfirst.pattern.observer.weatherstation.v1.subject.impl.WeatherData;

/**
 * В реализации v1 при изменении данных субъекта новые значения температуры, влажности и давления
 * отправляются наблюдателям, для чего эти данные передаются вызовом update()
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.generateRandomMeasurements();
        weatherData.generateRandomMeasurements();
        weatherData.generateRandomMeasurements();
    }
}
