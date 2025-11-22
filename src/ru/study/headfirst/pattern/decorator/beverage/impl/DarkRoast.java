package ru.study.headfirst.pattern.decorator.beverage.impl;

import ru.study.headfirst.pattern.decorator.beverage.Beverage;

public class DarkRoast extends Beverage {
    private static final double DARK_ROAST_COST = .99;

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return DARK_ROAST_COST;
    }
}
