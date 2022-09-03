package com.yang.menu;

public class ShowBookMenu extends AbstractMenu{

    public ShowBookMenu() {
        menuName = "展示图书";
    }

    @Override
    public Object fun(Object args) {
        System.out.println(menuName);
        return null;
    }
}
