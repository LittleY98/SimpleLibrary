package com.yang.menu;

import com.yang.annotation.Menu;
import com.yang.common.SimpleCommonUtil;
import com.yang.entity.Book;
import com.yang.service.IBookService;
import com.yang.service.impl.BookServiceImpl;

import java.util.Scanner;

@Menu(name = "更新图书信息")
public class UpdateBookMenu extends AbstractMenu{

    IBookService bookService = new BookServiceImpl();

    public UpdateBookMenu() {

    }

    public UpdateBookMenu(String menuName) {
        super(menuName);
    }

    @Override
    public Object fun(Object args) {
        String uuid;

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
