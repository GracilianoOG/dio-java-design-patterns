package com.gracilianoog.gof.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Singleton Apressado (Eager) ===");
        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);
    }
}
