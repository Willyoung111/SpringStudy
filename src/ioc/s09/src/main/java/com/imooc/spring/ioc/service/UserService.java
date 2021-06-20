package com.imooc.spring.ioc.service;

import com.imooc.spring.ioc.dao.UserDao;

public class UserService {
    private UserDao userDao;

    public void CreateUser(){
        System.out.println("call Create User Code");
        userDao.insert();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
