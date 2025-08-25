package com.gracilianoog.gof.strategy;

public class Main {
    public static void main(String[] args) {
        Attack swordAtk = new SwordAttack();
        Attack bowAtk = new BowAttack();
        Attack magicAtk = new MagicAttack();

        Character player = new Character();

        player.setAttackStrategy(swordAtk);
        player.attack();

        player.setAttackStrategy(bowAtk);
        player.attack();

        player.setAttackStrategy(magicAtk);
        player.attack();
    }
}
