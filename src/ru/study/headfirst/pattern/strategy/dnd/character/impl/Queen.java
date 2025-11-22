package ru.study.headfirst.pattern.strategy.dnd.character.impl;

import ru.study.headfirst.pattern.strategy.dnd.behavioraspects.impl.KnifeBehavior;
import ru.study.headfirst.pattern.strategy.dnd.character.Character;

public class Queen extends Character {
    @Override
    protected void fight() {
        setWeapon(new KnifeBehavior());
        weapon.useWeapon();
    }
}
