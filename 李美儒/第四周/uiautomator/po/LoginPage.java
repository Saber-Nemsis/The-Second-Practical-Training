package com.uiautomator_plus.po.lmr;

public class LoginPage {

    //登陆界面
    //用户名的class和index
    private String unameETClassName="android.widget.EditText";
    private int unameETIndex=0;

    //密码的class和index
    private String pwdETClassName="android.widget.EditText";
    private int pwdETIndex=1;

    //登录按钮的class和index
    private String registerButtonText="登录";
    private int registerButtonIndex=1;

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

    public String getRegisterButtonText() {
        return registerButtonText;
    }

    public int getRegisterButtonIndex() {
        return registerButtonIndex;
    }
}
