package com.yang.service.impl;

import com.yang.dao.CollectionDb;
import com.yang.entity.Book;
import com.yang.service.IBookService;

import java.util.Set;

public class BookServiceImpl implements IBookService {

    CollectionDb collectionDb = new CollectionDb();

    @Override
    public Set<Book> listBook() {
        return collectionDb.list();
    }

    @Override
    public Boolean removeBook(Book book) {

        return collectionDb.remove(book);
    }

    @Override
    public Boolean addBook(Book book) {
        return collectionDb.addBook(book);
    }

    @Override
    public Boolean existBook(Book book) {
        return collectionDb.isContainBook(book);
    }
}
