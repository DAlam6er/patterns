package ru.study.headfirst.pattern.decorator.condiment.impl;

import ru.study.headfirst.pattern.decorator.beverage.Beverage;
import ru.study.headfirst.pattern.decorator.condiment.CondimentDecorator;

public class Whip extends CondimentDecorator {
    private static final double WHIP_PRICE = .10;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + WHIP_PRICE;
    }
}
