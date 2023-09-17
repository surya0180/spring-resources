package com.rest.gameapp2.games;

import com.rest.gameapp2.GamingConsole;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraQualifier")
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
