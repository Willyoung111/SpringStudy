package com.imooc.spring.ioc.bookshop.dao;

public class BookDaoOracleImpl implements BookDao{
    @Override
    public void insert() {
        System.out.println("inset a data into Oracle");
    }
}
