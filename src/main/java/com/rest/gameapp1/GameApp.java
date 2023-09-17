package com.rest.gameapp1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GameApp {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GameConfig.class)) {
            var game = context.getBean(GameRunner.class);
            game.run();
        }
    }
}
