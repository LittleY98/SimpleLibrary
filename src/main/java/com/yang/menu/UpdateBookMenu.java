package com.yang.menu;

import com.yang.common.SimpleCommonUtil;
import com.yang.entity.Book;
import com.yang.service.IBookService;
import com.yang.service.impl.BookServiceImpl;

import java.util.Scanner;

public class UpdateBookMenu extends AbstractMenu{

    IBookService bookService = new BookServiceImpl();

    public UpdateBookMenu() {
        menuName = "修改图书";
    }

    @Override
    public Object fun(Object args) {
        String uuid;
        String name;
        String remark;

        System.out.println("请输入uuid:");
        uuid = new Scanner(System.in).next();

        Boolean isExit = bookService.existBook(new Book(uuid));
        if (isExit) {
            bookService.removeBook(new Book(uuid));

            AddBookMenu.addBookInsert(uuid, bookService);
        }else {
            System.out.println("该uuid不存在！");
        }
        SimpleCommonUtil.keyEnterToNext();
        return null;
    }

}
