package com.yang.menu;

import com.yang.common.CommonConstant;
import com.yang.common.ConstantDataCollect;
import com.yang.start.Start;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 显示主菜单
 */
public class MainMenu {

    private static final String TITTLE = "========图书馆管理系统==========";

    private static final String TAIL_TIP = "输入序号选择对应的操作：";


    public static void showMainMenu(){

        while (true){
            showMenu();
            Scanner scanner = new Scanner(System.in);
            Integer operation = scanner.nextInt();

            AbstractMenu abstractMenu = ConstantDataCollect.mainMenuList.get(operation - 1);
            abstractMenu.fun("");

        }

    }

    public static void showMenu(){
        List<String> collect = ConstantDataCollect.mainMenuList.stream().map(AbstractMenu::getMenuName).collect(Collectors.toList());

        System.out.println(TITTLE);

        for (int i = 0; i < collect.size(); i++) {
            System.out.println(" " + (i + 1) + " " + collect.get(i));
        }

        System.out.println(CommonConstant.MARGIN + "\n" + TAIL_TIP);


    }


}
