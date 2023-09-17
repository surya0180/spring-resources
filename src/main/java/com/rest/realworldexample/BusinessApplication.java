package com.rest.realworldexample;

import com.rest.realworldexample.services.BusinessService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class BusinessApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(BusinessApplication.class);
        var bean = context.getBean(BusinessService.class);
        System.out.println(bean.findMax());
        context.close();
    }
}
