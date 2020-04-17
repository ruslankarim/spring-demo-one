package com.karimov.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");
        Coach coach = context.getBean("myCoach", Coach.class);
        Coach coach2 = context.getBean("myCoach", Coach.class);
        boolean result = (coach == coach2);
        System.out.println(result);
        context.close();

    }
}