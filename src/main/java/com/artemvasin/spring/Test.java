package com.artemvasin.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Pet pet = context.getBean("myPet", Pet.class);
        //pet.say();
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        context.close();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
    }
}
