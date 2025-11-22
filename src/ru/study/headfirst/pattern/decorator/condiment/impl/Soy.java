package ru.study.headfirst.pattern.decorator.condiment.impl;

import ru.study.headfirst.pattern.decorator.beverage.Beverage;
import ru.study.headfirst.pattern.decorator.condiment.CondimentDecorator;

public class Soy extends CondimentDecorator {
    private static final double SOY_PRICE = .15;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + SOY_PRICE;
    }
}
