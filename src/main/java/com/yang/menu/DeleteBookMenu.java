package com.yang.menu;

import com.yang.annotation.Menu;
import com.yang.common.SimpleCommonUtil;
import com.yang.entity.Book;
import com.yang.service.IBookService;
import com.yang.service.impl.BookServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;


@Menu(name = "删除产品")
public class DeleteBookMenu extends AbstractMenu{
    IBookService bookService = new BookServiceImpl();

    public DeleteBookMenu() {
    }

    public DeleteBookMenu(String menuName) {
        super(menuName);
    }

    @Override
    public Object fun(Object args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的书的UUID：");

        boolean remove = bookService.removeBook(new Book(scanner.next()));
        System.out.println(remove ? "删除成功" : "删除失败");

        SimpleCommonUtil.keyEnterToNext();

        return remove;
    }

}
