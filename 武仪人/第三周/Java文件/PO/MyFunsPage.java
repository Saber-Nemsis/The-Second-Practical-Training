package com.appium_plus.po.wyr;

import lombok.Data;

/**
 * 我的粉丝页面
 */
@Data
public class MyFunsPage  extends BasePage{
    //我的粉丝标题class和index
    private String myFunsTitleClassName = "class=android.widget.TextView";
    private int myFunsTitleIndex = 31;
}
