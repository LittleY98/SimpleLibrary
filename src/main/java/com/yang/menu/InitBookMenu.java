package com.yang.menu;

import com.yang.dao.CollectionDb;
import com.yang.entity.Book;

public class InitBookMenu extends AbstractMenu{

    public InitBookMenu() {
        menuName = "初始化书籍信息";
    }

    @Override
    public Object fun(Object args) {

        Book book = new Book("1", "Java入门", "无");
        Book book1 = new Book("2", "C入门", "无");
        Book book2 = new Book("3", "Python入门", "无");

        CollectionDb.addBook(book);
        CollectionDb.addBook(book1);
        CollectionDb.addBook(book2);

        System.out.println("初始化完成");
        return true;
    }
}
