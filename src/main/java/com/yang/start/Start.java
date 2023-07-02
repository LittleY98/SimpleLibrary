package com.yang.start;

import com.yang.init.StartupDataInitV2;
import com.yang.menu.MainMenu;

/**
 * 程序入口
 */
public class Start {

    public static void main(String[] args) {

        StartupDataInitV2.initMenuList();

        MainMenu.showMainMenu();

    }

}
