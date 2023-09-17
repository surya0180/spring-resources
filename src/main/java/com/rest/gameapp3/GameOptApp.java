package com.rest.gameapp3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class Business {
    Dependency1 dep1;

    Dependency2 dep2;

    public Business(Dependency1 dep1, Dependency2 dep2) {
        this.dep1 = dep1;
        this.dep2 = dep2;
    }

    //    public Dependency1 getDep1() {
//        return dep1;
//    }
//
//    @Autowired
//    public void setDep1(Dependency1 dep1) {
//        this.dep1 = dep1;
//    }
//
//    public Dependency2 getDep2() {
//        return dep2;
//    }
//
//    @Autowired
//    public void setDep2(Dependency2 dep2) {
//        this.dep2 = dep2;
//    }
//
    @Override
    public String toString() {
        return dep1 + " " + dep2;
    }
}
@Component
class Dependency1{}
@Component
class Dependency2{}

@ComponentScan
public class GameOptApp {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GameOptApp.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(Business.class));
        }
    }
}
