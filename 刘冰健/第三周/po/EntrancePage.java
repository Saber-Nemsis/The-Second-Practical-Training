package com.appiumPlus.po;

/**
 * 入口页面
 */
public class EntrancePage {

    //登录按钮的class和下标
    private String loginButton = "class=android.widget.TextView";
    private int loginButtonIndex = 0;

    private String registButton = "class=android.widget.TextView";
    private int registButtonIndex = 1;

    public String getLoginButton() {
        return loginButton;
    }

    public int getLoginButtonIndex() {
        return loginButtonIndex;
    }

    public String getRegistButton() {
        return registButton;
    }

    public int getRegistButtonIndex() {
        return registButtonIndex;
    }
}
