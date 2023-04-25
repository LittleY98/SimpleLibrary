package com.yang.start;

import com.yang.init.StartupDataInit;
import com.yang.menu.MainMenu;

/**
 * 程序入口
 */
public class Start {

    public static void main(String[] args) {

        StartupDataInit.initMenuList();

        MainMenu.showMainMenu();

    }

}
