package ru.study.headfirst.pattern.strategy.dnd.character.impl;

import ru.study.headfirst.pattern.strategy.dnd.behavioraspects.impl.AxeBehavior;
import ru.study.headfirst.pattern.strategy.dnd.character.Character;

public class Troll extends Character  {
    @Override
    protected void fight() {
        setWeapon(new AxeBehavior());
        weapon.useWeapon();
    }
}
