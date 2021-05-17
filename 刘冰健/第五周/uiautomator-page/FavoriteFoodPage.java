package com.uiautomator_plus.po.lbj;

public class FavoriteFoodPage {

    //爱吃按钮xpath和下标
    private String favoriteFoodButton = "text=爱吃";

    //删除按钮的x，y值
    private int x = 750;
    private int y = 470;

    //确认删除按钮id
    private String confirmButton = "id=android:id/button1";
    //取消删除按钮id
    private String cancelButton = "id=android:id/button2";

    //搜索框class和index
    private String search = "class=android.widget.EditText";
    private int searchIndex = 2;

    public String getFavoriteFoodButton() {
        return favoriteFoodButton;
    }

    public String getConfirmButton() {
        return confirmButton;
    }

    public String getCancelButton() {
        return cancelButton;
    }

    public String getSearch() {
        return search;
    }

    public int getSearchIndex() {
        return searchIndex;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}