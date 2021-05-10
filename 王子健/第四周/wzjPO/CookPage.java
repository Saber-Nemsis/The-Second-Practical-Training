package com.appium_plus.po.wzj;

import lombok.Data;

@Data
public class CookPage extends BasePage{
    //下面导航栏做饭的xpath
    private String cookButtonXpath="//android.widget.Button[@content-desc='做饭, tab, 2 of 5']";

    //第一个做饭简介的xpath
    private String foodIntruductionXpath="//android.widget.ScrollView/android.view.View/android.view.View";

    //页面到达底部的信息提示
    private String endString="最终成品";

    //做饭主页面点击任何或者输入任何进行跳转的基本xpath定位（用其他方法定位不到所以才能用这个方法，因为两个页面的代码都嵌套在一起）
    private String baseLocator="//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View";



}
