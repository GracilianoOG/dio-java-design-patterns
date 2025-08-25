package com.gracilianoog.gof.strategy;

public class BowAttack implements Attack {

    @Override
    public void attack() {
        System.out.println("Shoot arrows!");
    }
}
