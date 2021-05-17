package com.uiautomator_plus.po.ch;

public class AddPage {

    //导航栏添加的text和index
    private String addPageText="添加";
    private int addPageIndex=0;

    //物品名称的text和index
    private String goodsNameText="物品名称";
    private int goodsNameIndex=0;

    //保质期的class和index
    private String EXPClassName="android.widget.EditText";
    private int EXPIndex=4;

    //确认添加的text和index
    private String confirmAddText="确认添加";
    private int confirmAddIndex=0;

    public String getAddPageText() {
        return addPageText;
    }

    public int getAddPageIndex() {
        return addPageIndex;
    }

    public String getGoodsNameText() {
        return goodsNameText;
    }

    public int getGoodsNameIndex() {
        return goodsNameIndex;
    }

    public String getEXPClassName() {
        return EXPClassName;
    }

    public int getEXPIndex() {
        return EXPIndex;
    }

    public String getConfirmAddText() {
        return confirmAddText;
    }

    public int getConfirmAddIndex() {
        return confirmAddIndex;
    }
}
