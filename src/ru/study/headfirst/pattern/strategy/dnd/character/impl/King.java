package ru.study.headfirst.pattern.strategy.dnd.character.impl;

import ru.study.headfirst.pattern.strategy.dnd.behavioraspects.impl.SwordBehavior;
import ru.study.headfirst.pattern.strategy.dnd.character.Character;

public class King extends Character {
    @Override
    protected void fight() {
        setWeapon(new SwordBehavior());
        weapon.useWeapon();
    }
}
