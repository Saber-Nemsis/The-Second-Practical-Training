package com.uiautomator_plus.po.wzj;

public class CookPage extends BasePage{


    //下面导航栏做饭的xpath
    private String cookButtonXpath="//android.widget.Button[@content-desc='做饭, tab, 2 of 5']";

    //第一个做饭简介的xpath
    private String foodIntruductionXpath="//android.widget.ScrollView/android.view.View/android.view.View";

    //做饭主页面点击任何或者输入任何进行跳转的基本xpath定位
    private String baseLocator="//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View";

    public String getCookButtonXpath() {
        return cookButtonXpath;
    }

    public void setCookButtonXpath(String cookButtonXpath) {
        this.cookButtonXpath = cookButtonXpath;
    }

    public String getFoodIntruductionXpath() {
        return foodIntruductionXpath;
    }

    public void setFoodIntruductionXpath(String foodIntruductionXpath) {
        this.foodIntruductionXpath = foodIntruductionXpath;
    }

    public String getBaseLocator() {
        return baseLocator;
    }

    public void setBaseLocator(String baseLocator) {
        this.baseLocator = baseLocator;
    }
}
