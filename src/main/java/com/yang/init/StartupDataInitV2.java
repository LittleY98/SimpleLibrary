package com.yang.init;

import cn.hutool.core.annotation.AnnotationUtil;
import cn.hutool.core.util.ClassUtil;
import cn.hutool.core.util.ReflectUtil;

import com.yang.annotation.Menu;
import com.yang.common.ConstantDataCollect;
import com.yang.menu.AbstractMenu;

import java.util.*;

public class StartupDataInitV2 {

    public static void initMenuList() {

        //获取此包下的所有类
        Set<Class<?>> classes = ClassUtil.scanPackage("com.yang.menu");


        for (Class<?> aClass : classes) {

            //检查此类是否有Menu注解，没有则跳过
            if (!AnnotationUtil.hasAnnotation(aClass, Menu.class)){
                continue;
            }


            //检查该类是否是制定类的子类，否则跳过（也可弹出异常）
            if (!ClassUtil.isAssignable(AbstractMenu.class, aClass)) {


                continue;
            }

            //获取注解中的菜单名
            String name = AnnotationUtil.getAnnotationValue(aClass, Menu.class, "name");



            //实例化出来
            AbstractMenu obj = (AbstractMenu) ReflectUtil.newInstance(aClass,name);

            //放入list
            ConstantDataCollect.mainMenuList.add(obj);
        }
    }

    public static void main(String[] args) {





    }

}
