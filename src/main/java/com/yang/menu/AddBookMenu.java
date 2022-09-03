package com.yang.menu;

public class AddBookMenu extends AbstractMenu{

    public AddBookMenu() {
        menuName = "添加图书";
    }

    @Override
    public Object fun(Object args) {
        System.out.println(menuName);
        return null;
    }
}
