package com.rest.gameapp3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private final GamingConsole console;
    public GameRunner(@Qualifier("SuperContraQualifier")  GamingConsole console) {
        this.console = console;
    }

    public void run() {
        System.out.println("Running game is " + console);
        console.up();
        console.down();
        console.left();
        console.right();
    }
}
