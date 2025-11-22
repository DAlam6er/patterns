package ru.study.headfirst.pattern.strategy.miniducksimulator.behavioraspects.fly.impl;

import ru.study.headfirst.pattern.strategy.miniducksimulator.behavioraspects.fly.FlyBehavior;

/**
 * Реализация для всех летающих существ
 */
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
