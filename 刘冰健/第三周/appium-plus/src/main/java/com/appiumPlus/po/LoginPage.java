package com.appiumPlus.po;


//登录页面
public class LoginPage {

    //账号输入框的class和数组中下标
    private String username="class=android.widget.EditText";
    private int usernameIndex=0;

    //密码输入框的class和数组下标
    private String pwd="class=android.widget.EditText";
    private int pwdIndex=1;

    //登陆界面登录按钮的class和下标
    private String loginButton="class=android.widget.TextView";
    private int loginButtonIndex=4;

    //主页元素
    private String mainPageElem = "//android.widget.Button[@content-desc=\"主页, tab, 1 of 5\"]";

    public String getUsername() {
        return username;
    }

    public int getUsernameIndex() {
        return usernameIndex;
    }

    public String getPwd() {
        return pwd;
    }

    public int getPwdIndex() {
        return pwdIndex;
    }

    public String getLoginButton() {
        return loginButton;
    }

    public int getLoginButtonIndex() {
        return loginButtonIndex;
    }

    public String getMainPageElem() {
        return mainPageElem;
    }
}
