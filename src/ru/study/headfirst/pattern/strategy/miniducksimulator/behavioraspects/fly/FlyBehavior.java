package ru.study.headfirst.pattern.strategy.miniducksimulator.behavioraspects.fly;

/**
 * Аспект поведения - умение летать.
 * Классы, реализующие данный интерфейс представляют собой сущности, где сущность - это поведение.
 * Поведение также может обладать состоянием и методами.
 */
public interface FlyBehavior {
    void fly();
}
