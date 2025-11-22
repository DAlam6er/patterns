package ru.study.headfirst.pattern.observer.weatherstation.v2.observer;

/**
 * Интерфейс наблюдателя
 */
public interface Observer {
    /**
     * Передать наблюдателям обновлённые данные субъекта
     */
    void update();
}
