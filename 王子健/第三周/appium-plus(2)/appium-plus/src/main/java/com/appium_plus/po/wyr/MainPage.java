package com.appium_plus.po.wyr;

import lombok.Data;

/**
 * 登录后的主页页面
 */
@Data
public class MainPage  extends BasePage{

    //底部栏的主页的xpath和下标
    private String mainPageXapth = "xpath=//android.widget.Button[@content-desc=\"主页, tab, 1 of 5\"]";
    private int mainPageIndex = 0;

    //一种物品的class和下标
    private String goodsClassName = "class=android.widget.ImageView";
    private int goodsIndex = 8;

    //右上角个人头像的class和下标
    private String personalPhotoClassName = "class=android.widget.ImageView";
    private int personalPhotoIndex = 2;

    //第一条记录的删除按钮className和下标
    private String firstGoodsDeleteButtonClassName = "class=android.widget.ImageView";
    private int firstGoodsDeleteButtonIndex = 9;

    //每条记录的className
    private String allGoodsClassName = "class=android.view.ViewGroup";

    //弹窗确定的class和index
    private String alertButtonClassName = "class=android.widget.Button";
    private int alertButtonIndex = 1;

    //搜索框的class和index以及内容
    private String inputClassName = "class=android.widget.EditText";
    private int inputIndex = 2;
    private String inputContent = "苹果";

    //水果蔬菜按钮的class和index
    private String fruitAndVegetableButtonClassName = "class=android.widget.ImageView";
    private int fruitAndVegetableButtonIndex = 3;

    //肉蛋按钮的class和index
    private String meatAndEggButtonClassName = "class=android.widget.ImageView";
    private int meatAndEggButtonIndex = 4;

    //海鲜水产按钮的class和index
    private String seafoodButtonClassName = "class=android.widget.ImageView";
    private int seafoodButtonIndex = 5;

    //速食冷冻按钮的class和index
    private String fastFoodButtonClassName = "class=android.widget.ImageView";
    private int fastFoodButtonIndex = 6;

    //零食饮品按钮的class和index
    private String snacksAndDrinkButtonClassName = "class=android.widget.ImageView";
    private int snacksAndDrinkButtonIndex = 7;
}
