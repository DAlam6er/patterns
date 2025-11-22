package ru.study.headfirst.pattern.strategy.miniducksimulator.behavioraspects.fly.impl;

import ru.study.headfirst.pattern.strategy.miniducksimulator.behavioraspects.fly.FlyBehavior;

/**
 * Реализация для всех, кто не умеет летать
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
