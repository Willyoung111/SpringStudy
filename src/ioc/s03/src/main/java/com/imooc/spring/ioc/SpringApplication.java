package com.imooc.spring.ioc;

import com.imooc.spring.ioc.entity.Apple;
import com.imooc.spring.ioc.entity.Child;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

//        Apple sweetApple = context.getBean("sweetApple", Apple.class);
//        System.out.println(sweetApple.getTitle());
//
//        Apple apple3 = context.getBean("apple3", Apple.class);
//        System.out.println(apple3.getTitle());
        Child andy = context.getBean("andy", Child.class);
        andy.eat();

    }
}
