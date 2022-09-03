package com.yang.menu;

import com.yang.dao.CollectionDb;
import com.yang.entity.Book;

import java.util.Scanner;

public class DeleteBookMenu extends AbstractMenu{

    public DeleteBookMenu() {
        menuName = "删除图书";
    }

    @Override
    public Object fun(Object args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的书的UUID：");

        boolean remove = CollectionDb.remove(new Book(scanner.next()));
        System.out.println(remove ? "删除成功" : "删除失败");

        return remove;
    }


}
