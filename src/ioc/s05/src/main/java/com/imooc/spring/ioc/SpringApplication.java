package com.imooc.spring.ioc;

import com.imooc.spring.ioc.dao.UserDao;
import com.imooc.spring.ioc.entity.Order;
import com.imooc.spring.ioc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        System.out.println("IoC initialized");
//        UserDao userDao1 = context.getBean("userDao", UserDao.class);
//        UserDao userDao2 = context.getBean("userDao", UserDao.class);
//        UserDao userDao3 = context.getBean("userDao", UserDao.class);

//        UserService service1 = context.getBean("userService", UserService.class);
//        UserService service2 = context.getBean("userService", UserService.class);
//        UserService service3 = context.getBean("userService", UserService.class);

        Order order1 = context.getBean("order1", Order.class);
        order1.pay();

        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
    }
}
