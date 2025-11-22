package ru.study.headfirst.pattern.decorator.beverage.impl;

import ru.study.headfirst.pattern.decorator.beverage.Beverage;

public class Decaf extends Beverage {
    private static final double DECAF_COST = 1.05;

    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return DECAF_COST;
    }
}
