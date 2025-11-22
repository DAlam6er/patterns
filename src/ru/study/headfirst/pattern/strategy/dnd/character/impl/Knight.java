package ru.study.headfirst.pattern.strategy.dnd.character.impl;

import ru.study.headfirst.pattern.strategy.dnd.behavioraspects.impl.BowAndArrowBehavior;
import ru.study.headfirst.pattern.strategy.dnd.character.Character;

public class Knight extends Character {
    @Override
    protected void fight() {
        setWeapon(new BowAndArrowBehavior());
        weapon.useWeapon();
    }
}
