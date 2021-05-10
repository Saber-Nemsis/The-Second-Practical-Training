package com.uiautomator_plus.po.wyr;


/**
 * "爱吃"页面
 */
public class FavoritesPage extends BasePage{

    //底部"爱吃"选项的xpath和index
    private String favoritesClassName = "class=android.widget.Button";
    private int favoritesIndex = 2;

    public String getFavoritesClassName() {
        return favoritesClassName;
    }

    public void setFavoritesClassName(String favoritesClassName) {
        this.favoritesClassName = favoritesClassName;
    }

    public int getFavoritesIndex() {
        return favoritesIndex;
    }

    public void setFavoritesIndex(int favoritesIndex) {
        this.favoritesIndex = favoritesIndex;
    }
}
