package com.gracilianoog.gof.strategy;

public class Character {
    private Attack attackStrategy;

    public void setAttackStrategy(Attack attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void attack() {
        attackStrategy.attack();
    }
}
