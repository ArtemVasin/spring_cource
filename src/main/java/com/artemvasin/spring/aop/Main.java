package com.artemvasin.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(myConfig.class);
        Travel travel = context.getBean("travelBean", Travel.class);
        travel.start();
        travel.drive();
        context.close();
    }
}
