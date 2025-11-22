package ru.study.headfirst.pattern.decorator.condiment;

import ru.study.headfirst.pattern.decorator.beverage.Beverage;

/**
 * Абстрактный класс для дополнений, расширяет тип Beverage, чтобы декоратор мог быть обёрткой для ЛЮБОГО напитка (Beverage)
 */
public abstract class CondimentDecorator extends Beverage {
    /**
     * Объект, заворачиваемый в декоратор
     */
    protected Beverage beverage;

    public abstract String getDescription();
}
