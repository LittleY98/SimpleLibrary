package com.yang.menu;

/**
 * 操作抽象类
 */
public abstract class AbstractMenu {

    protected String menuName;

    public AbstractMenu() {
    }

    public AbstractMenu(String menuName) {
        this.menuName = menuName;
    }

    public abstract Object fun(Object args);

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
}
