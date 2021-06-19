package com.imooc.spring.ioc.bookshop.dao;

public class BookDaoImpl implements BookDao {
    @Override
    public void insert() {
        System.out.println("insert a data into MySQL");
    }
}
