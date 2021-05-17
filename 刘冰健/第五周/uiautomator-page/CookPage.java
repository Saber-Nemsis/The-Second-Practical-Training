package com.uiautomator_plus.po.lbj;

public class CookPage {

    //做饭按钮xpath
    private String cookButton = "text=做饭";

    //菜品标签的class和下标
    private String dishEntry = "class=android.widget.ImageView";
    private int dishEntryIndex = 3;

    //菜品名称
    private String dishName = "text=西红柿炒鸡蛋";
//    private int dishNameIndex = 11;
    //搜索框的class和下标
    private String search = "class=android.widget.EditText";
    private int searchIndex = 2;

    public String getCookButton() {
        return cookButton;
    }

    public String getDishEntry() {
        return dishEntry;
    }

    public int getDishEntryIndex() {
        return dishEntryIndex;
    }

    public String getDishName() {
        return dishName;
    }

//    public int getDishNameIndex() {
//        return dishNameIndex;
//    }

    public String getSearch() {
        return search;
    }

    public int getSearchIndex() {
        return searchIndex;
    }
}
