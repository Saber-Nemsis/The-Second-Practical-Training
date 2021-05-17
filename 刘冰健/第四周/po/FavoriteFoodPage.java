package com.appiumPlus.po;

public class FavoriteFoodPage {

    //爱吃按钮xpath和下标
    private String favoriteFoodButton = "xpath=//android.widget.Button[@content-desc=\"爱吃, tab, 4 of 5\"]";
    private int favoriteFoodButtonIndex = 0;

    //删除按钮的xpath
    private String deleteButton = "xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[4]/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView";

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

    public int getFavoriteFoodButtonIndex() {
        return favoriteFoodButtonIndex;
    }

    public String getDeleteButton() {
        return deleteButton;
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
}
