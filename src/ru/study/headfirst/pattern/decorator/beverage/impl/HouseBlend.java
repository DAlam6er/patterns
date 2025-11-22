package ru.study.headfirst.pattern.decorator.beverage.impl;

import ru.study.headfirst.pattern.decorator.beverage.Beverage;

public class HouseBlend extends Beverage {
    private static final double HOUSE_BLEND_COST = .89;

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return HOUSE_BLEND_COST;
    }
}
