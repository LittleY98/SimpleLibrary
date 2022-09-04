package com.yang.menu;

import com.yang.common.CommonConstant;
import com.yang.common.SimpleCommonUtil;
import com.yang.entity.Book;
import com.yang.service.IBookService;
import com.yang.service.impl.BookServiceImpl;

import java.util.Set;

public class ShowBookMenu extends AbstractMenu{

    IBookService bookService = new BookServiceImpl();

    public ShowBookMenu() {
        menuName = "展示图书";
    }

    @Override
    public Object fun(Object args) {
        Set<Book> list = bookService.listBook();

        if (list.isEmpty()) {
            System.out.println("图书列表为空");
        }

        for (Book book : list) {
            System.out.println(book);
        }

        System.out.println(CommonConstant.MARGIN);
        SimpleCommonUtil.keyEnterToNext();

        return null;
    }
}
