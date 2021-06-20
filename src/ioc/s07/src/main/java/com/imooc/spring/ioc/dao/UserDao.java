package com.imooc.spring.ioc.dao;

import org.springframework.stereotype.Repository;

//组件类型注解，用于IoC创建，默认beanId为类名首字母小写
@Repository()
public class UserDao implements IUserDao{
    public UserDao() {
        System.out.println("creating UserDao: " + this);
    }
}
