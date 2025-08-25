package com.gracilianoog.gof.strategy;

public class SwordAttack implements Attack {

    @Override
    public void attack() {
        System.out.println("Swing the sword!");
    }
}
