package com.imooc.spring.ioc;

import com.imooc.spring.ioc.entity.Company;
import com.imooc.spring.ioc.entity.Computer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Company company = context.getBean("company", Company.class);
        System.out.println(company);
        String website = company.getInfo().getProperty("website");
        System.out.println(website);

        System.out.println("=======================");
        //获取容器内所有beanId数组
        String[] beanNames = context.getBeanDefinitionNames();
        for(String beanName:beanNames){
            System.out.println(beanName);
            System.out.println("type: " + context.getBean(beanName).getClass().getName());
            System.out.println("context: " + context.getBean(beanName).toString());
        }

        Computer computer = (Computer) context.getBean("com.imooc.spring.ioc.entity.Computer");
        System.out.println(computer.getBrand());

//        不推荐使用
        Computer computer1 = (Computer) context.getBean("com.imooc.spring.ioc.entity.Computer#1");
        System.out.println(computer1.getBrand());
    }
}
