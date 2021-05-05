package com.appiumPlus.po.ch;

import com.appiumPlus.core.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.util.List;

public class MainPage {
    //导航栏中水果蔬菜的class和index
    private String fruitsAndVegetablesButtonClassName = "android.widget.ImageView";
    private int fruitsAndVegetablesButtonIndex = 3;

    //导航栏中肉蛋食品的class和index
    private String meatsAndEggButtonClassName = "android.widget.ImageView";
    private int meatsAndEggButtonIndex = 4;

    //导航栏中海鲜水产的class和index
    private String seafoodButtonClassName = "android.widget.ImageView";
    private int seafoodButtonIndex = 5;

    //导航栏中速食冷冻的class和index
    private String instantAndFrozenFoodButtonClassName = "android.widget.ImageView";
    private int instantAndFrozenFoodButtonIndex = 6;

    //导航栏中零食饮品的class和index
    private String snacksAndDrinksButtonClassName = "android.widget.ImageView";
    private int snacksAndDrinksButtonIndex = 7;


    //主页面点击任何或者输入任何进行跳转的基本xpath定位
    private String baseLocator="//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View";


    //页面到达最后的标志
    private String endString = "显示全部分类";

    public int getFruitsAndVegetablesButtonIndex() {
        return fruitsAndVegetablesButtonIndex;
    }

    public int getMeatsAndEggButtonIndex() {
        return meatsAndEggButtonIndex;
    }

    public int getSeafoodButtonIndex() {
        return seafoodButtonIndex;
    }

    public int getInstantAndFrozenFoodButtonIndex() {
        return instantAndFrozenFoodButtonIndex;
    }

    public int getSnacksAndDrinksButtonIndex() {
        return snacksAndDrinksButtonIndex;
    }

    public String getFruitsAndVegetablesButtonClassName() {
        return fruitsAndVegetablesButtonClassName;
    }

    public String getMeatsAndEggButtonClassName() {
        return meatsAndEggButtonClassName;
    }

    public String getSeafoodButtonClassName() {
        return seafoodButtonClassName;
    }

    public String getInstantAndFrozenFoodButtonClassName() {
        return instantAndFrozenFoodButtonClassName;
    }

    public String getSnacksAndDrinksButtonClassName() {
        return snacksAndDrinksButtonClassName;
    }

    public String getBaseLocator() {
        return baseLocator;
    }

    public String getEndString() {
        return endString;
    }
}

