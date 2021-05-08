package com.uiautomator_plus.po.lmr;

public class SigninPage {
    //注册界面
    //用户名输入框的class和index
    private String unameETClassName="android.widget.EditText";
    private int unameETIndex=0;

    //密码输入框的class和index
    private String pwdETClassName="android.widget.EditText";
    private int pwdETIndex=1;

    //再次输入框的class和index
    private String againTypeETClassName="android.widget.EditText";
    private int againTypeETIndex=2;

    //注册并登录按钮的text和index
    private String logonButtonText="注册并登录";
    private int logonButtonIndex=0;

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

    public String getAgainTypeETClassName() {
        return againTypeETClassName;
    }

    public int getAgainTypeETIndex() {
        return againTypeETIndex;
    }

    public String getLogonButtonText() {
        return logonButtonText;
    }

    public int getLogonButtonIndex() {
        return logonButtonIndex;
    }
}
