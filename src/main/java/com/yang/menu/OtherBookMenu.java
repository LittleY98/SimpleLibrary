package com.yang.menu;

import com.yang.annotation.Menu;
import com.yang.service.IBookService;
import com.yang.service.impl.BookServiceImpl;

import java.util.Scanner;


//@Menu(name = "其他操作")
public class OtherBookMenu extends AbstractMenu{
    IBookService bookService = new BookServiceImpl();

    public OtherBookMenu() {
    }

    public OtherBookMenu(String menuName) {
        super(menuName);
    }

    @Override
    public Object fun(Object args) {
        System.out.println("其他操作");
        return null;
    }



}
