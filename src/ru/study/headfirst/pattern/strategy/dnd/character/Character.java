package ru.study.headfirst.pattern.strategy.dnd.character;

import ru.study.headfirst.pattern.strategy.dnd.behavioraspects.WeaponBehavior;

public abstract class Character {
    protected WeaponBehavior weapon;

    protected void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    protected abstract void fight();
}
