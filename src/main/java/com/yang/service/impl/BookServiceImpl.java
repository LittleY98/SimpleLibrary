package com.yang.service.impl;

import com.yang.dao.impl.BookCollectionDb;
import com.yang.dao.IBookDao;
import com.yang.entity.Book;
import com.yang.service.IBookService;

import java.util.Set;

public class BookServiceImpl implements IBookService {

    IBookDao collectionDb = new BookCollectionDb();

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
