package com.yang.menu;

public class DeleteBookMenu extends AbstractMenu{

    public DeleteBookMenu() {
        menuName = "删除图书";
    }

    @Override
    public Object fun(Object args) {
        System.out.println(menuName);
        return null;
    }


}
