package com.yang.init;

import com.yang.common.ConstantDataCollect;
import com.yang.menu.*;

/**
 * 启动时数据初始化
 */
public class StartupDataInit {

    /**
     * 初始化主菜单集合
     */
    public static void initMenuList(){
        ConstantDataCollect.mainMenuList.add(new ShowBookMenu());
        ConstantDataCollect.mainMenuList.add(new DeleteBookMenu());
        ConstantDataCollect.mainMenuList.add(new AddBookMenu());
        ConstantDataCollect.mainMenuList.add(new UpdateBookMenu());
        ConstantDataCollect.mainMenuList.add(new InitBookMenu());
    }

}
