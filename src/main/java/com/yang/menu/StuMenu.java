package com.yang.menu;

import com.yang.common.CommonConstant;
import com.yang.common.SimpleCommonUtil;
import com.yang.entity.Book;

import java.util.Set;

public class StuMenu extends AbstractMenu{
    public StuMenu() {
        menuName = "测试菜单";
    }

    @Override
    public Object fun(Object args) {
        System.out.println("这是测试功能");
        return null;
    }
}
