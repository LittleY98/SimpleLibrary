package com.yang.dao;

import com.yang.entity.Book;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 用Collection模拟数据库
 */
public class CollectionDb {

    private static final HashSet<Book> BOOKS_DB = new HashSet<>();

    public static boolean addBook(Book book){
        return BOOKS_DB.add(book);
    }

    public static HashSet<Book> list(){
        return BOOKS_DB;
    }

    public static boolean remove(Book book){
        return BOOKS_DB.remove(book);
    }

    public static boolean updateBook(Book book){
        if (BOOKS_DB.contains(book)) {
            BOOKS_DB.add(book);
        }
        return false;
    }

}
