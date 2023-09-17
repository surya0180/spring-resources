package com.rest.advancedspringconcepts;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass{
    private final SomeDependency dep;

    public SomeClass(SomeDependency dep) {
        this.dep = dep;
    }

    @PostConstruct
    public void initialize() {
        dep.getReady();
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("Cleaning this function");
    }
}

@Component
class SomeDependency{
    public void getReady() {
        System.out.println("Some logic using dependency");
    }
}

@ComponentScan
public class PrePostAnnotation {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(PrePostAnnotation.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
