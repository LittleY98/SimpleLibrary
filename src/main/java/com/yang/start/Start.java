package com.yang.start;

import com.yang.menu.AbstractMenu;
import com.yang.menu.DeleteBookMenu;
import com.yang.menu.MainMenu;
import com.yang.menu.ShowBookMenu;

import javax.print.attribute.standard.Finishings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Start {

    public static final List<AbstractMenu> mainMenuList = new ArrayList<>();

    public static void initMenuList(){
        mainMenuList.add(new ShowBookMenu());
        mainMenuList.add(new DeleteBookMenu());
    }

    public static void main(String[] args) throws IOException {

        initMenuList();


        MainMenu.showMainMenu();

    }

}
