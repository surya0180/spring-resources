package com.rest.gameapp1.games;
import com.rest.gameapp1.GamingConsole;

public class Pacman implements GamingConsole {
    @Override
    public void up() {
        System.out.println("UP PACMAN");
    }

    @Override
    public void down() {
        System.out.println("DOWN PACMAN");
    }

    @Override
    public void left() {
        System.out.println("LEFT PACMAN");
    }

    @Override
    public void right() {
        System.out.println("RIGHT PACMAN");
    }
}
