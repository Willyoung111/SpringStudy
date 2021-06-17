package com.imooc.spring.ioc;

import com.imooc.spring.ioc.entity.Apple;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        String[] configLocations = new String[]{"classpath:applicationContext.xml", "classpath:applicationContext-1.xml"};
        //创建IoC容器并根据配置文件创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocations);

        //从IoC容器获取bean
//        Apple apple4 = context.getBean("apple4", Apple.class);
//        System.out.println(apple4.getTitle());
//        Apple apple3 = (Apple)context.getBean("apple3");
//        System.out.println(apple3.getTitle());

//        Apple apple2 = context.getBean("apple2", Apple.class);
//        System.out.println(apple2.getTitle());
//
//        Apple apple7 = context.getBean("apple7", Apple.class);
//        System.out.println(apple7.getTitle());

        Apple apple = context.getBean("com.imooc.spring.ioc.entity.Apple", Apple.class);
        System.out.println(apple.getTitle());
    }
}
