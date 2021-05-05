package com.appium_plus.po.lmr;

public class LoginPage {
    //登录按钮的class和index
    private String loginButtonClassName="android.widget.TextView";
    private int loginButtonIndex=0;

    //账号输入框的class和数组中下标
    private String unameEditTextClassName="android.widget.EditText";
    private int unameEditTextIndex=0;

    //密码输入框的class和数组下标
    private String pwdEditTextClassName="android.widget.EditText";
    private int pwdEditTextIndex=1;

    //登陆界面登录按钮的class和index
    private String regButtonClassName="android.widget.TextView";
    private int regButtonIndex=4;

    public String getLoginButtonClassName() {
        return loginButtonClassName;
    }

    //主页的xpath和index
    private String mainPageButtonXpath="//android.widget.Button[@content-desc=\"主页, tab, 1 of 5\"]";
    private int mainPageButtonIndex=0;

    public int getLoginButtonIndex() {
        return loginButtonIndex;
    }


    public String getUnameEditTextClassName() {
        return unameEditTextClassName;
    }

    public int getUnameEditTextIndex() {
        return unameEditTextIndex;
    }

    public String getPwdEditTextClassName() {
        return pwdEditTextClassName;
    }

    public int getPwdEditTextIndex() {
        return pwdEditTextIndex;
    }

    public String getRegButtonClassName() {
        return regButtonClassName;
    }

    public int getRegButtonIndex() {
        return regButtonIndex;
    }

    public String getMainPageButtonXpath() {
        return mainPageButtonXpath;
    }

    public int getMainPageButtonIndex() {
        return mainPageButtonIndex;
    }
}
