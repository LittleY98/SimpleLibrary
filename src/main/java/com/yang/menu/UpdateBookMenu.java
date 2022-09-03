package com.yang.menu;

public class UpdateBookMenu extends AbstractMenu{

    public UpdateBookMenu() {
        menuName = "修改图书";
    }

    @Override
    public Object fun(Object args) {
        System.out.println(menuName);
        return null;
    }


}
