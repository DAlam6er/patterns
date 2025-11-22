package ru.study.headfirst.pattern.strategy.miniducksimulator.behavioraspects.fly.impl;

import ru.study.headfirst.pattern.strategy.miniducksimulator.behavioraspects.fly.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
