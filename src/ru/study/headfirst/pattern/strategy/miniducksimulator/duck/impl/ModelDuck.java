package ru.study.headfirst.pattern.strategy.miniducksimulator.duck.impl;

import ru.study.headfirst.pattern.strategy.miniducksimulator.behavioraspects.fly.impl.FlyNoWay;
import ru.study.headfirst.pattern.strategy.miniducksimulator.behavioraspects.quack.impl.Quack;
import ru.study.headfirst.pattern.strategy.miniducksimulator.duck.Duck;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
