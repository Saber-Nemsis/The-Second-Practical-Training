package com.appiumPlus.po.ch;

public class SigninPage {
    //注册按钮的class和index
    private String signinButtonClassName="android.widget.TextView";
    private int signinButtonIndex=1;

    //用户名输入的class和index
    private String unameETClassName="android.widget.EditText";
    private int unameETIndex=0;

    //密码输入的class和index
    private String pwdETClassName="android.widget.EditText";
    private int pwdETIndex=1;

    //再次输入的class和index
    private String pwdAgainETClassName="android.widget.EditText";
    private int pwdAgainETIndex=2;

    //注册并登录的class和index
    private String logonButtonClassName="android.widget.TextView";
    private int logonButtonIndex=5;

    //主页的xpath和index
    private String mainPageButtonXpath="//android.widget.Button[@content-desc=\"主页, tab, 1 of 5\"]";
    private int mainPageButtonIndex=0;

    public String getSigninButtonClassName() {
        return signinButtonClassName;
    }

    public int getSigninButtonIndex() {
        return signinButtonIndex;
    }

    public String getUnameETClassName() {
        return unameETClassName;
    }

    public int getUnameETIndex() {
        return unameETIndex;
    }

    public String getPwdETClassName() {
        return pwdETClassName;
    }

    public int getPwdETIndex() {
        return pwdETIndex;
    }

    public String getPwdAgainETClassName() {
        return pwdAgainETClassName;
    }

    public int getPwdAgainETIndex() {
        return pwdAgainETIndex;
    }

    public String getLogonButtonClassName() {
        return logonButtonClassName;
    }

    public int getLogonButtonIndex() {
        return logonButtonIndex;
    }

    public String getMainPageButtonXpath() {
        return mainPageButtonXpath;
    }

    public int getMainPageButtonIndex() {
        return mainPageButtonIndex;
    }
}
