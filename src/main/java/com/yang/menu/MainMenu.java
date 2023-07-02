package com.yang.menu;

import com.yang.annotation.Menu;
import com.yang.common.CommonConstant;
import com.yang.common.ConstantDataCollect;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 显示主菜单
 */
@Menu(name = "测试")
public class MainMenu {

    private static final String TITTLE = "==========***管理系统==========";

    private static final String TAIL_TIP = "输入序号选择对应的操作（输入0退出）：";


    public static void showMainMenu(){

        while (true){
            showMenu();
            Scanner scanner = new Scanner(System.in);
            int operation = scanner.nextInt();

            if (operation == 0){
                System.out.println("感谢使用～");
                break;
            }

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
