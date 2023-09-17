package com.rest.gameapp1.games;

import com.rest.gameapp1.GamingConsole;

public class SuperContra implements GamingConsole {
    @Override
    public void up() {
        System.out.println("UP CONTRA");
    }

    @Override
    public void down() {
        System.out.println("DOWN CONTRA");
    }

    @Override
    public void left() {
        System.out.println("LEFT CONTRA");
    }

    @Override
    public void right() {
        System.out.println("RIGHT CONTRA");
    }
}
