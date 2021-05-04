package com.appium_plus.po.wzj;

import lombok.Data;

/**
 * "爱吃"页面
 */
@Data
public class FavoritesPage extends BasePage {

    //底部"爱吃"选项的xpath和index
    private String favoritesXpath = "xpath=//android.widget.Button[@content-desc=\"爱吃, tab, 4 of 5\"]";
    private int favoritesIndex = 0;

    //爱吃菜谱的信息
    private String className = "class=android.widget.ImageView";
    private int index = 3;

    //删除按钮的classname和index
    private String deleteClassName = "class=android.widget.ImageView";
    private int deteleIndex = 4;

}
