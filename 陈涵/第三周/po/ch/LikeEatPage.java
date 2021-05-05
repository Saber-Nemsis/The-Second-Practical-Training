package com.appiumPlus.po.ch;

public class LikeEatPage {
    private String LikeEatButtonXpath="//android.widget.Button[@content-desc=\"爱吃, tab, 4 of 5\"]";
    private String searchStarFoodClassName="android.widget.EditText";
    private int searchStarFoodIndex=2;

    //爱吃主页默认的一个食物介绍xpath
    private String likeEatFoodListXpath="//android.widget.ScrollView/android.view.View/android.view.View";
    private int likeEatFoodIndex=0;

    //当进行搜索之后跳转的页面的基本路径
    private String BaseLocator="//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View";

    //跳转之后的搜索框xpath
    private String searchAfterEnterTextXpath="/android.view.View/android.view.View/android.widget.EditText";

    //跳转之后的食物列表xpath
    private String searchAfterEnterFoodListXpath="/android.view.View/android.widget.ScrollView/android.view.View/android.view.View";

    //跳转之后的食物列表中第一个食物名称的xpath
    private String searchAfterEnterFirstFoodNameXpath="/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.widget.TextView";

    //点击跳转之后的食物列表的第一个跳转之后名字的xpath
    private String searchClickDefaultFirstFoodNameXpath="//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.widget.TextView";

    //点击主页的第一个默认食物跳转之后名字xpath
    private String clickMainDefaultFirstNameXpath="//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.widget.TextView";

    public String getLikeEatButtonXpath() {
        return LikeEatButtonXpath;
    }

    public String getSearchStarFoodClassName() {
        return searchStarFoodClassName;
    }

    public int getSearchStarFoodIndex() {
        return searchStarFoodIndex;
    }

    public String getLikeEatFoodListXpath() {
        return likeEatFoodListXpath;
    }

    public int getLikeEatFoodIndex() {
        return likeEatFoodIndex;
    }

    public String getBaseLocator() {
        return BaseLocator;
    }

    public String getSearchAfterEnterTextXpath() {
        return searchAfterEnterTextXpath;
    }

    public String getSearchAfterEnterFoodListXpath() {
        return searchAfterEnterFoodListXpath;
    }

    public String getSearchAfterEnterFirstFoodNameXpath() {
        return searchAfterEnterFirstFoodNameXpath;
    }

    public String getSearchClickDefaultFirstFoodNameXpath() {
        return searchClickDefaultFirstFoodNameXpath;
    }

    public String getClickMainDefaultFirstNameXpath() {
        return clickMainDefaultFirstNameXpath;
    }
}
