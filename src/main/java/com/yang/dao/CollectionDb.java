package com.yang.dao;

import com.yang.entity.Book;

import java.util.HashSet;

/**
 * 用Collection模拟数据库
 */
public class CollectionDb {

    private static final HashSet<Book> BOOKS_DB = new HashSet<>();

    public boolean addBook(Book book){
        return BOOKS_DB.add(book);
    }

    public HashSet<Book> list(){
        return BOOKS_DB;
    }

    public boolean remove(Book book){
        return BOOKS_DB.remove(book);
    }

    public boolean updateBook(Book book){
        if (BOOKS_DB.contains(book)) {
            BOOKS_DB.add(book);
        }
        return false;
    }

    public Boolean isContainBook(Book book) {
        return BOOKS_DB.contains(book);
    }
}
