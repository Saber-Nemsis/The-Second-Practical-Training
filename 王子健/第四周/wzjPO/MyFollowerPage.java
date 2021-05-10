package com.appium_plus.po.wzj;

import lombok.Data;

/**
 * 我的关注页面
 */
@Data
public class MyFollowerPage  extends BasePage {

    //顶部你关注的人的class和下标
    private String followButtonClassName = "class=android.widget.TextView";
    private int followButtonIndex = 21;

}
