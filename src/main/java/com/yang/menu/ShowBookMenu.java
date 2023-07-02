package com.yang.menu;

import com.yang.annotation.Menu;
import com.yang.common.CommonConstant;
import com.yang.common.SimpleCommonUtil;
import com.yang.entity.Book;
import com.yang.service.IBookService;
import com.yang.service.impl.BookServiceImpl;

import java.util.Set;

@Menu(name = "查看产品列表")
public class ShowBookMenu extends AbstractMenu{

    IBookService bookService = new BookServiceImpl();


    public ShowBookMenu() {

    }

    public ShowBookMenu(String menuName) {
        super(menuName);
    }

    @Override
    public Object fun(Object args) {
        Set<Book> list = bookService.listBook();

        if (list.isEmpty()) {
            System.out.println("产品列表为空");
        }

        for (Book book : list) {
            System.out.println(book);
        }

        System.out.println(CommonConstant.MARGIN);
        SimpleCommonUtil.keyEnterToNext();

        return null;
    }
}
