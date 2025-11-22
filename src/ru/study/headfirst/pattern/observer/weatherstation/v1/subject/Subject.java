package ru.study.headfirst.pattern.observer.weatherstation.v1.subject;

import ru.study.headfirst.pattern.observer.weatherstation.v1.observer.Observer;

/**
 * Интерфейс субъекта
 */
public interface Subject {
    /**
     * Регистрирует наблюдателя
     * @param observer наблюдатель
     */
    void registerObserver(Observer observer);

    /**
     * Исключает наблюдателя
     * @param observer наблюдатель
     */
    void removeObserver(Observer observer);

    /**
     * Вызывается для оповещения наблюдателей об изменении состояния субъектов
     */
    void notifyObservers();
}
