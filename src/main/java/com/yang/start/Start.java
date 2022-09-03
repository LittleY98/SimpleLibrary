package com.yang.start;

import com.yang.common.ConstantDataCollect;
import com.yang.init.StartupDataInit;
import com.yang.menu.AbstractMenu;
import com.yang.menu.DeleteBookMenu;
import com.yang.menu.MainMenu;
import com.yang.menu.ShowBookMenu;

import javax.print.attribute.standard.Finishings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 程序入口
 */
public class Start {

    public static void main(String[] args) throws IOException {

        StartupDataInit.initMenuList();

        MainMenu.showMainMenu();

    }

}
