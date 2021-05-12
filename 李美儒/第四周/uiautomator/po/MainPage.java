package com.uiautomator_plus.po.lmr;

public class MainPage {
    //主页

    //主页下面导航栏的主页按钮的text和index
    private String mainPageButtonText="主页";
    private int mainPageButtonIndex=0;

    //分类导航栏的水果蔬菜按钮的class和index
    private String fruitsAndVagetavlesButtonText="水果蔬菜";
    private int fruitAndVegetablesButtonIndex=0;

    //分类导航栏的肉蛋食品按钮的class和index
    private String meatsAndEggButtonText="肉蛋食品";
    private int meatsAndEggButtonIndex=0;

    //分类导航栏的海鲜水产按钮的class和index
    private String seafoodButtonText="海鲜水产";
    private int seafoodButtonIndex=0;

    //分类导航栏的速食冷冻按钮的class和index
    private String instantAndFrozenFoodButtonText="速食冷冻";
    private int instantAndFrozenFoodButtonIndex=0;

    //分类导航栏的零食饮品按钮的class和index
    private String snacksAndDrinksButtonText="零食饮品";
    private int snacksAndDrinksButtonIndex=0;

    //点击导航栏按钮之后的分类显示列表
    private String clickButtonScrollViewClassName="android.widget.ScrollView";

    //点击导航栏水果蔬菜按钮出现的分类显示列表最后一个的text和index
    private String clickFruitAndVegetablesButtonScrollLastViewText="零食";
    private int clickFruitAndVegeTablesButtonScrollLastViewIndex=0;

    //点击导航栏肉蛋食品按钮出现的分类显示列表最后一个的text和index
    private String clickMeatsAndEggButtonScrollLastViewText="鸡蛋";
    private int clickMeatAndEggButtonScrollLastViewIndex=1;

    //点击导航栏海鲜水产按钮出现的分类显示列表最后一个的text和index
    private String clickSeafoodButtonScrollLastViewText="海鲜";
    private int clickSeafoodButtonScrollLastViewIndex=1;

    //点击导航栏速食冷冻按钮出现的分类显示列表最后一个的text和index
    private String clickInstanceAndFrozenButtonScrollLastViewText="速食";
    private int clickInstanceAndFrozenButtonScrollLastViewIndex=1;

    //点击导航栏零食饮品按钮出现的分类显示列表最后一个的text和index
    private String clickSnacksAndDrinksButtonScrollLastViewText="零食";
    private int clickSnacksAndDrinksButtonScrollLastViewIndex=1;

    //返回键的text和index
    private String backButtonText="<";
    private int backButtonIndex=0;

    //进入到具体介绍页面的text和index
    private String introducePageText="营养小贴士";
    private int introducePageIndex=0;

    //查找输入框的text和index
    private String searchETText="芒果";
    private int searchETIndex=0;

    //搜索框默认内容
    private String searchETDefaultText="春菜";
    private int searchETDefaultIndex=0;

    public String getMainPageButtonText() {
        return mainPageButtonText;
    }

    public int getMainPageButtonIndex() {
        return mainPageButtonIndex;
    }

    public String getFruitsAndVagetavlesButtonText() {
        return fruitsAndVagetavlesButtonText;
    }

    public String getMeatsAndEggButtonText() {
        return meatsAndEggButtonText;
    }

    public String getSeafoodButtonText() {
        return seafoodButtonText;
    }

    public String getInstantAndFrozenFoodButtonText() {
        return instantAndFrozenFoodButtonText;
    }

    public String getSnacksAndDrinksButtonText() {
        return snacksAndDrinksButtonText;
    }

    public int getFruitAndVegetablesButtonIndex() {
        return fruitAndVegetablesButtonIndex;
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

    public String getClickButtonScrollViewClassName() {
        return clickButtonScrollViewClassName;
    }

    public String getClickFruitAndVegetablesButtonScrollLastViewText() {
        return clickFruitAndVegetablesButtonScrollLastViewText;
    }

    public int getClickFruitAndVegeTablesButtonScrollLastViewIndex() {
        return clickFruitAndVegeTablesButtonScrollLastViewIndex;
    }

    public String getClickMeatsAndEggButtonScrollLastViewText() {
        return clickMeatsAndEggButtonScrollLastViewText;
    }

    public int getClickMeatAndEggButtonScrollLastViewIndex() {
        return clickMeatAndEggButtonScrollLastViewIndex;
    }

    public String getClickSeafoodButtonScrollLastViewText() {
        return clickSeafoodButtonScrollLastViewText;
    }

    public int getClickSeafoodButtonScrollLastViewIndex() {
        return clickSeafoodButtonScrollLastViewIndex;
    }

    public String getClickInstanceAndFrozenButtonScrollLastViewText() {
        return clickInstanceAndFrozenButtonScrollLastViewText;
    }

    public int getClickInstanceAndFrozenButtonScrollLastViewIndex() {
        return clickInstanceAndFrozenButtonScrollLastViewIndex;
    }

    public String getClickSnacksAndDrinksButtonScrollLastViewText() {
        return clickSnacksAndDrinksButtonScrollLastViewText;
    }

    public int getClickSnacksAndDrinksButtonScrollLastViewIndex() {
        return clickSnacksAndDrinksButtonScrollLastViewIndex;
    }

    public String getBackButtonText() {
        return backButtonText;
    }

    public int getBackButtonIndex() {
        return backButtonIndex;
    }

    public String getIntroducePageText() {
        return introducePageText;
    }

    public int getIntroducePageIndex() {
        return introducePageIndex;
    }

    public String getSearchETText() {
        return searchETText;
    }

    public int getSearchETIndex() {
        return searchETIndex;
    }

    public String getSearchETDefaultText() {
        return searchETDefaultText;
    }

    public int getSearchETDefaultIndex() {
        return searchETDefaultIndex;
    }
}
