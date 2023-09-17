package com.rest.basics.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// When creating a record, there is no need to create any setters and getters
record Person(String name, int age, Address address) {};
record Address(String firstLine, String city) {};

@Configuration // This is a configuration file where we declare all our beans with the annotation @Bean.
public class SpringConfig {
    @Bean // This is the annotation used to declare a bean
    public String name() {
        return "Surya";
    }
    @Bean
    public int age() {
        return 25;
    }
    @Bean
    public Person person() {
        return new Person("Teja", 20, address());
    }
    @Bean(name = "address2") // This contains the name of the bean configured
    public Address address() {
        return new Address("Line 1", "Vijayawada");
    }
    @Bean
    public Person person2() {
        return new Person(name(), age(), address());
    }
    @Bean
    public Person person3(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }
}
