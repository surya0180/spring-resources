package com.rest.basics;

import com.rest.basics.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Home {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(SpringConfig.class)){
            var person = context.getBean("person3");
            var address = context.getBean("address2");
            System.out.println(person + " " + address);
        }
    }
}
