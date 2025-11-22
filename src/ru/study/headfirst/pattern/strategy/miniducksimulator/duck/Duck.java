package ru.study.headfirst.pattern.strategy.miniducksimulator.duck;

import ru.study.headfirst.pattern.strategy.miniducksimulator.behavioraspects.fly.FlyBehavior;
import ru.study.headfirst.pattern.strategy.miniducksimulator.behavioraspects.quack.QuackBehavior;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public Duck() {}

    public abstract void display();

    /**
     * Метод делегирует выполнение операции на объект FlyBehavior
     */
    public void performFly() {
        flyBehavior.fly();
    }

    /**
     * Метод делегирует выполнение операции на объект QuackBehavior
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    /**
     * Метод позволяет динамически изменять поведение полёта во время выполнения программы
     * @param flyBehavior аспект поведения, определяющий умение летать
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * Метод позволяет динамически изменять поведение крякания во время выполнения программы
     * @param quackBehavior аспект поведения, определяющий умение крякать
     */
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
