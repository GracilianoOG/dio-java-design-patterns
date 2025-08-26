package com.gracilianoog.gof.facade;

public class Engine {
    private final AudioManager audioManager;
    private final InputManager inputManager;
    private final CollisionManager collisionManager;

    public Engine() {
        this.audioManager = new AudioManager();
        this.inputManager = new InputManager();
        this.collisionManager = new CollisionManager();
    }

    public void startGame() {
        System.out.println("Starting game...");
        this.audioManager.playMusic();
        this.inputManager.listen();
        this.collisionManager.detectCollision();
    }

    public void stopGame() {
        System.out.println("Stopping game...");
        this.audioManager.stopMusic();
    }

    public void pauseGame() {
        System.out.println("Pausing game...");
        this.audioManager.pauseMusic();
    }
}
