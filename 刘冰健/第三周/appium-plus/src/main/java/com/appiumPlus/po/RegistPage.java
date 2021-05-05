package com.appiumPlus.po;


/**
 * 注册界面
 */
public class RegistPage {

    //用户名输入框的class和下标
    private String username = "class=android.widget.EditText";
    private int usenameIndex = 0;
    //密码输入框的class和下标
    private String pwd = "class=android.widget.EditText";
    private int pwdIndex = 1;
    //确认密码输入框的class和下标
    private String confirm = "class=android.widget.EditText";
    private int confirmIndex = 2;
    //注册并登录按钮的class和下标
    private String regAndLog = "class=android.view.View";
    private int regAndLogIndex = 10;
    //主页元素
    private String mainPageElem = "//android.widget.Button[@content-desc=\"主页, tab, 1 of 5\"]";

    public String getUsername() {
        return username;
    }

    public int getUsenameIndex() {
        return usenameIndex;
    }

    public String getPwd() {
        return pwd;
    }

    public int getPwdIndex() {
        return pwdIndex;
    }

    public String getConfirm() {
        return confirm;
    }

    public int getConfirmIndex() {
        return confirmIndex;
    }

    public String getRegAndLog() {
        return regAndLog;
    }

    public int getRegAndLogIndex() {
        return regAndLogIndex;
    }

    public String getMainPageElem() {
        return mainPageElem;
    }
}
