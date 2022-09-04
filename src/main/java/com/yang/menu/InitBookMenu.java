package com.yang.menu;

import com.yang.common.SimpleCommonUtil;
import com.yang.dao.impl.BookCollectionDb;
import com.yang.entity.Book;


/**
 * 用于测试，初始化出三个书籍信息
 */
public class InitBookMenu extends AbstractMenu{

    BookCollectionDb collectionDb = new BookCollectionDb();

    public InitBookMenu() {
        menuName = "初始化书籍信息";
    }

    @Override
    public Object fun(Object args) {

        Book book = new Book("1", "Java入门", "无");
        Book book1 = new Book("2", "C入门", "无");
        Book book2 = new Book("3", "Python入门", "无");

        collectionDb.addBook(book);
        collectionDb.addBook(book1);
        collectionDb.addBook(book2);

        System.out.println("初始化完成");

        SimpleCommonUtil.keyEnterToNext();

        return true;
    }
}
