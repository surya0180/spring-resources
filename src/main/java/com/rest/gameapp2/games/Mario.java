package com.rest.gameapp2.games;

import com.rest.gameapp2.GamingConsole;

public class Mario implements GamingConsole {

    @Override
    public void up() {
        System.out.println("UP MARIO");
    }

    @Override
    public void down() {
        System.out.println("DOWN MARIO");
    }

    @Override
    public void left() {
        System.out.println("LEFT MARIO");
    }

    @Override
    public void right() {
        System.out.println("RIGHT MARIO");
    }
}
