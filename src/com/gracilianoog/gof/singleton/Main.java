package com.gracilianoog.gof.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n=== Singleton Apressado (Eager) ===");
        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        System.out.println("\n=== Singleton Preguiçoso (Lazy) ===");
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
    }
}
