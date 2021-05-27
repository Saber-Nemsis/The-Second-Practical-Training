package com.uiautomator_plus.po.wzj;


/**
 * "爱吃"页面
 */
public class FavoritesPage extends BasePage {

    //底部"爱吃"选项的class和index
    private String favoritesClassName = "class=android.widget.Button";
    private int favoritesIndex = 2;

    //爱吃菜谱的信息
    private String foodClassName = "class=android.widget.ImageView";
    private int foodIndex = 3;

    //删除按钮的classname和index
    private String deleteClassName = "class=android.widget.ImageView";
    private int deteleIndex = 4;

    public String getDeleteClassName() { return deleteClassName; }

    public void setDeleteClassName(String deleteClassName) {
        this.deleteClassName = deleteClassName;
    }

    public int getDeteleIndex() { return deteleIndex; }

    public void setDeteleIndex(int deteleIndex) {
        this.deteleIndex = deteleIndex;
    }

    public String getFavoritesClassName() {
        return favoritesClassName;
    }

    public String getFoodClassName(){ return foodClassName; }

    public void setFavoritesClassName(String favoritesClassName) {
        this.favoritesClassName = favoritesClassName;
    }

    public int getFavoritesIndex() {
        return favoritesIndex;
    }

    public int getFoodIndex(){ return foodIndex; }

    public void setFavoritesIndex(int favoritesIndex) {
        this.favoritesIndex = favoritesIndex;
    }
}
