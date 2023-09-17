package com.rest.gameapp2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class GameOptApp {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GameOptApp.class)) {
            var game = context.getBean(GameRunner.class);
            game.run();
        }
    }
}
