package com.imooc.spring.ioc.service;

import com.imooc.spring.ioc.dao.UserDao;

public class UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        System.out.println("setting UserDao: " + userDao);
        this.userDao = userDao;
    }

    public UserService(){
        System.out.println("creating UserService: "+ this);
    }
}
