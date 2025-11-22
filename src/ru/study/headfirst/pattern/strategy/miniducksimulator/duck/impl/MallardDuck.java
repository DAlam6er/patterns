package ru.study.headfirst.pattern.strategy.miniducksimulator.duck.impl;

import ru.study.headfirst.pattern.strategy.miniducksimulator.behavioraspects.fly.impl.FlyWithWings;
import ru.study.headfirst.pattern.strategy.miniducksimulator.behavioraspects.quack.impl.Quack;
import ru.study.headfirst.pattern.strategy.miniducksimulator.duck.Duck;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
