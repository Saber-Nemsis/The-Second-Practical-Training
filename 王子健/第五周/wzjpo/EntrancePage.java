package com.uiautomator_plus.po.wzj;


/**
 * 入口页面，有登陆和注册按钮的页面
 */
public class EntrancePage extends BasePage {
    //登录按钮的text和在数组中的下标
    private String loginButtonText = "text=登录";
    private int loginButtonIndex = 0;

    //注册按钮的class和在数组中的下标
    private String signinButtonClassName = "text=注册";
    private int signinButtonIndex = 0;

    public String getLoginButtonClassName() {
        return loginButtonText;
    }

    public void setLoginButtonClassName(String loginButtonText) {
        this.loginButtonText = loginButtonText;
    }

    public int getLoginButtonIndex() {
        return loginButtonIndex;
    }

    public void setLoginButtonIndex(int loginButtonIndex) {
        this.loginButtonIndex = loginButtonIndex;
    }

    public String getSigninButtonClassName() {
        return signinButtonClassName;
    }

    public void setSigninButtonClassName(String signinButtonClassName) {
        this.signinButtonClassName = signinButtonClassName;
    }

    public int getSigninButtonIndex() {
        return signinButtonIndex;
    }

    public void setSigninButtonIndex(int signinButtonIndex) {
        this.signinButtonIndex = signinButtonIndex;
    }
}
