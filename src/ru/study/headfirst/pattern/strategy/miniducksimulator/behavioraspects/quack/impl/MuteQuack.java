package ru.study.headfirst.pattern.strategy.miniducksimulator.behavioraspects.quack.impl;

import ru.study.headfirst.pattern.strategy.miniducksimulator.behavioraspects.quack.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
