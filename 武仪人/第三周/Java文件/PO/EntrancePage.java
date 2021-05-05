package com.appium_plus.po.wyr;

import lombok.Data;

/**
 * 入口页面，有登陆和注册按钮的页面
 */
@Data
public class EntrancePage  extends BasePage{
    //登录按钮的class和在数组中的下标
    private String loginButtonClassName = "class=android.widget.TextView";
    private int loginButtonIndex = 0;

    //注册按钮的class和在数组中的下标
    private String signinButtonClassName = "class=android.widget.TextView";
    private int signinButtonIndex = 1;



}
