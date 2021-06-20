package com.imooc.spring.ioc.service;

import com.imooc.spring.ioc.dao.IUserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DepartmentService {
    @Resource
    private IUserDao userOracleDao;

    public void joinDepartment(){
        System.out.println(userOracleDao);
    }
}
