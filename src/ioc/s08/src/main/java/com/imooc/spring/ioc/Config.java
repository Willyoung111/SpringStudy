package com.imooc.spring.ioc;

import com.imooc.spring.ioc.controller.UserController;
import com.imooc.spring.ioc.dao.EmployeeDao;
import com.imooc.spring.ioc.dao.UserDao;
import com.imooc.spring.ioc.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.imooc")  //可以兼容使用
public class Config {
    @Bean
    public UserDao userDao(){
        UserDao userDao = new UserDao();
        System.out.println("create userDao" + userDao);
        return userDao;
    }

    @Bean
    //先按name进行注入，不行则按类型注入
    public UserService userService(UserDao userDao, EmployeeDao employeeDao){
        UserService userService = new UserService();
        System.out.println("create userService" + userService);
        userService.setUserDao(userDao);
        System.out.println("call setUserDao " + userDao);
        userService.setEmployeeDao(employeeDao);
        System.out.println("call setEmployeeDao " + employeeDao);
        return userService;
    }

    @Bean
    public UserController userController(UserService userService){
        UserController userController = new UserController();
        System.out.println("create userController " + userController);
        userController.setUserService(userService);
        System.out.println("call setUserService " + userService);
        return userController;
    }
}
