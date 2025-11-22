package ru.study.headfirst.pattern.strategy.miniducksimulator;

import ru.study.headfirst.pattern.strategy.miniducksimulator.duck.Duck;
import ru.study.headfirst.pattern.strategy.miniducksimulator.duck.impl.MallardDuck;
import ru.study.headfirst.pattern.strategy.miniducksimulator.duck.impl.ModelDuck;
import ru.study.headfirst.pattern.strategy.miniducksimulator.behavioraspects.fly.impl.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        System.out.println("----------------------------------------------");
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
