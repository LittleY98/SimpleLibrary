package com.yang.menu;

import com.yang.annotation.Menu;
import com.yang.common.SimpleCommonUtil;
import com.yang.entity.Book;
import com.yang.service.IBookService;
import com.yang.service.impl.BookServiceImpl;

import java.util.Scanner;

@Menu(name = "添加产品")
public class AddBookMenu extends AbstractMenu{
    IBookService bookService = new BookServiceImpl();

    public AddBookMenu() {
    }

    public AddBookMenu(String menuName) {
        super(menuName);
    }

    @Override
    public Object fun(Object args) {
        String uuid;

        System.out.println("请输入uuid:");
        uuid = new Scanner(System.in).next();
        addBookInsert(uuid, bookService);

        SimpleCommonUtil.keyEnterToNext();

        return null;
    }

    public static void addBookInsert(String uuid, IBookService bookService) {
        String name;
        String remark;
        System.out.println("请输入书名:");
        name = new Scanner(System.in).next();
        System.out.println("请输入备注信息:");
        remark = new Scanner(System.in).next();

        if (uuid.equals("") || name.equals("")){
            System.out.println("uuid和书名不可为空！！！");
        }else {
            Book book = new Book(uuid, name, remark);
            Boolean res = bookService.addBook(book);

            System.out.println(res ? "添加成功！" : "添加失败！");
        }
    }

}
