package com.gracilianoog.gof.strategy;

public class MagicAttack implements Attack {

    @Override
    public void attack() {
        System.out.println("Cast spell!");
    }
}
