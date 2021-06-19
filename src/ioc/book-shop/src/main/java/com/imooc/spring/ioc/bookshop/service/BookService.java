package com.imooc.spring.ioc.bookshop.service;

import com.imooc.spring.ioc.bookshop.dao.BookDao;

public class BookService {
    private BookDao bookDao ;
    public void purchase(){
        System.out.println("purchasing book...");
        bookDao.insert();
    }

    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
