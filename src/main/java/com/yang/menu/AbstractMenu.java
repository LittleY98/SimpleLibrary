package com.yang.menu;

/**
 * 操作抽象类
 */
public abstract class AbstractMenu {

    protected String menuName;

    public abstract Object fun(Object args);

    public String getMenuName() {
        return menuName;
    }
}
