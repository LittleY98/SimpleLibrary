package com.yang.service;

import com.yang.entity.Book;

import java.util.List;
import java.util.Set;

public interface IBookService {

    Set<Book> listBook();

    Boolean removeBook(Book book);

    Boolean addBook(Book book);

    Boolean existBook(Book book);

}
