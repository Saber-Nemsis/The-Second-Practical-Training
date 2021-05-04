package com.appium_plus.po.lmr;

public class AddPage {
    //添加页面的基本xpath（因为不像其他4个导航栏有content-desc，并且只能通过xpath来定位）
    private String BaseLocator="//android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View";
    //添加导航按钮的相对路径
    private String addButtonXpath="/android.view.View[2]/android.view.View";
    //物品名称的class名和索引位置
    private String goodsNameClassName="android.widget.EditText";
    private int goodsNameIndex=3;

    //保质期的class名和索引位置
    private String expDateClassName="android.widget.EditText";
    private int expDateIndex=4;

    //确认添加按钮的xpath和index位置
    private String confirmAddXpath="/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.view.View[6]/android.view.View/android.widget.TextView";
    private int confirmAddIndex=0;

    public String getBaseLocator() {
        return BaseLocator;
    }

    public String getAddButtonXpath() {
        return addButtonXpath;
    }

    public String getGoodsNameClassName() {
        return goodsNameClassName;
    }

    public int getGoodsNameIndex() {
        return goodsNameIndex;
    }

    public String getExpDateClassName() {
        return expDateClassName;
    }

    public int getExpDateIndex() {
        return expDateIndex;
    }

    public String getConfirmAddXpath() {
        return confirmAddXpath;
    }

    public int getConfirmAddIndex() {
        return confirmAddIndex;
    }
}
