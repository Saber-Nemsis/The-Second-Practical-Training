package com.appiumPlus.po;

public class CookPage {

    //做饭按钮xpath和下标
    private String cookButton = "xpath=//android.widget.Button[@content-desc=\"做饭, tab, 2 of 5\"]";
    private int cookButtonIndex = 0;

    //菜品标签的class和下标
    private String dishEntry = "class=android.widget.ImageView";
    private int dishEntryIndex = 3;

    //菜品名称的class和下标
    private String dishName = "class=android.widget.TextView";
    private int dishNameIndex = 11;
    //搜索框的class和下标
    private String search = "class=android.widget.EditText";
    private int searchIndex = 2;

    public String getCookButton() {
        return cookButton;
    }

    public int getCookButtonIndex() {
        return cookButtonIndex;
    }

    public String getDishEntry() {
        return dishEntry;
    }

    public int getDishEntryIndex() {
        return dishEntryIndex;
    }

    public String getSearch() {
        return search;
    }

    public int getSearchIndex() {
        return searchIndex;
    }

    public String getDishName() {
        return dishName;
    }

    public int getDishNameIndex() {
        return dishNameIndex;
    }
}