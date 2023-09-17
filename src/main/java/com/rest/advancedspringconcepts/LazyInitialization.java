package com.rest.advancedspringconcepts;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {

}

@Component
@Lazy
class ClassB {
    private ClassA a;

    public ClassB(ClassA a) {
        System.out.println("Initialization is being done here ...");
        this.a = a;
    }
}

@ComponentScan
public class LazyInitialization {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(LazyInitialization.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println("Context initialization is done");
            System.out.println(context.getBean(ClassB.class));
        }
    }
}
