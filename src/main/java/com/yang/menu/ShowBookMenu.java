package com.yang.menu;

import com.yang.dao.CollectionDb;
import com.yang.entity.Book;

import java.util.HashSet;

public class ShowBookMenu extends AbstractMenu{

    public ShowBookMenu() {
        menuName = "展示图书";
    }

    @Override
    public Object fun(Object args) {
        HashSet<Book> list = CollectionDb.list();

        for (Book book : list) {
            System.out.println(book);
        }

        return null;
    }
}
