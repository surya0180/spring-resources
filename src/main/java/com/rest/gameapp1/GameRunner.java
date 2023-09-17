package com.rest.gameapp1;

public class GameRunner {
    private final GamingConsole console;
    public GameRunner(GamingConsole console) {
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
