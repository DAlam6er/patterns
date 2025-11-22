package ru.study.headfirst.pattern.decorator.beverage.impl;

import ru.study.headfirst.pattern.decorator.beverage.Beverage;

public class Espresso extends Beverage {
    private static final double ESPRESSO_COST = 1.99;

    /**
     * Переменная description наследуется от Beverage
     */
    public Espresso() {
        description =  "Espresso";
    }

    public double cost() {
        return ESPRESSO_COST;
    }
}
