package com.uiautomator_plus.po.lbj;

public class MainPage {
    //水果蔬菜
    private String fruitsAndVegetablesButton = "text=水果蔬菜";

    //肉蛋食品
    private String meatsAndEggButton = "text=肉蛋食品";

    //海鲜水产
    private String seafoodButton = "text=海鲜水产";

    //速食冷冻
    private String instantAndFrozenFoodButton = "text=速食冷冻";

    //零食饮品
    private String snacksAndDrinksButton = "text=零食饮品";

    //搜索框class和index
    private String search = "class=android.widget.EditText";
    private int searchIndex = 2;

    //显示全部分类
    private String all = "text=显示全部分类";

    public String getFruitsAndVegetablesButton() {
        return fruitsAndVegetablesButton;
    }

    public String getMeatsAndEggButton() {
        return meatsAndEggButton;
    }

    public String getSeafoodButton() {
        return seafoodButton;
    }

    public String getInstantAndFrozenFoodButton() {
        return instantAndFrozenFoodButton;
    }

    public String getSnacksAndDrinksButton() {
        return snacksAndDrinksButton;
    }

    public String getSearch() {
        return search;
    }

    public int getSearchIndex() {
        return searchIndex;
    }

    public String getAll() {
        return all;
    }
}
