package com.rest.gameapp2.games;
import com.rest.gameapp2.GamingConsole;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PacmanQualifier")
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
