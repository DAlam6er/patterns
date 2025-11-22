package ru.study.headfirst.pattern.decorator.condiment.impl;

import ru.study.headfirst.pattern.decorator.beverage.Beverage;
import ru.study.headfirst.pattern.decorator.condiment.CondimentDecorator;

/**
 * Класс декоратора расширяет CondimentDecorator, который в свою очередь расширяет Beverage
 */
public class Mocha extends CondimentDecorator {
    private static final double MOCHA_PRICE = .20;

    /**
     * Класс Mocha наследует переменную экземпляра Beverage для хранения внутреннего напитка
     * Этой переменной экземпляра присваивается внутренний объект Beverage.
     * В данном случае он передается конструктору декоратора
     */
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * В описании должно содержаться не только название напитка,
     * но и все дополнения, например "Dark Roast, Mocha"
     * Таким образом, мы сначала получаем описание, делегируя вызов к декорируемому объекту,
     * а затем присоединяем к нему строку ", Mocha"
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    /**
     * Сначала вызов делегируется декорируемому объекту, а затем стоимость шоколада прибавляется к результату
     */
    @Override
    public double cost() {
        return beverage.cost() + MOCHA_PRICE;
    }
}
