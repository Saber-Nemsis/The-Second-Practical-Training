package com.appiumPlus.po;

public class MainPage {
    //导航栏中水果蔬菜的class和index
    private String fruitsAndVegetablesButton = "class=android.widget.ImageView";
    private int fruitsAndVegetablesButtonIndex = 3;

    //导航栏中肉蛋食品的class和index
    private String meatsAndEggButton = "class=android.widget.ImageView";
    private int meatsAndEggButtonIndex = 4;

    //导航栏中海鲜水产的class和index
    private String seafoodButton = "class=android.widget.ImageView";
    private int seafoodButtonIndex = 5;

    //导航栏中速食冷冻的class和index
    private String instantAndFrozenFoodButton = "class=android.widget.ImageView";
    private int instantAndFrozenFoodButtonIndex = 6;

    //导航栏中零食饮品的class和index
    private String snacksAndDrinksButton = "class=android.widget.ImageView";
    private int snacksAndDrinksButtonIndex = 7;

    //搜索框class和index
    private String search = "class=android.widget.EditText";
    private int searchIndex = 2;


    public String getFruitsAndVegetablesButton() {
        return fruitsAndVegetablesButton;
    }

    public int getFruitsAndVegetablesButtonIndex() {
        return fruitsAndVegetablesButtonIndex;
    }

    public String getMeatsAndEggButton() {
        return meatsAndEggButton;
    }

    public int getMeatsAndEggButtonIndex() {
        return meatsAndEggButtonIndex;
    }

    public String getSeafoodButton() {
        return seafoodButton;
    }

    public int getSeafoodButtonIndex() {
        return seafoodButtonIndex;
    }

    public String getInstantAndFrozenFoodButton() {
        return instantAndFrozenFoodButton;
    }

    public int getInstantAndFrozenFoodButtonIndex() {
        return instantAndFrozenFoodButtonIndex;
    }

    public String getSnacksAndDrinksButton() {
        return snacksAndDrinksButton;
    }

    public int getSnacksAndDrinksButtonIndex() {
        return snacksAndDrinksButtonIndex;
    }

    public String getSearch() {
        return search;
    }

    public int getSearchIndex() {
        return searchIndex;
    }
}
