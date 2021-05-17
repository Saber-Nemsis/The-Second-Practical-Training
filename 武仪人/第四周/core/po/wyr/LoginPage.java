package com.uiautomator_plus.po.wyr;

import com.uiautomator_plus.core.Engine;


/**
 * 登录页面，输入账号密码那个
 */
public class LoginPage  extends BasePage{

    //用户名输入框的class和在数组中的下标以及登录用的用户名
    private String usernameEditTextClassName = "class=android.widget.EditText";
    private int usernameEditTextIndex = 0;
    private String username = "123";

    //密码输入框class和在数组中的下标以及登陆的密码
    private String passwordEditTextClassName = "class=android.widget.EditText";
    private int passwordEditTextIndex = 1;
    private String password = "123";

    //登录按钮的class和在数组中的下标
    private String loginButtonClassName = "text=登录";
    private int loginButtonIndex = 1;


    public void login(Engine engine, int flag){
        if(flag == 0){//不使用账号密码登录
            this.click(engine , loginButtonClassName , loginButtonIndex);
        } else if(flag == 1){//试用账号密码登录
            this.clearAndType(engine , usernameEditTextClassName , usernameEditTextIndex , username);
            this.clearAndType(engine , passwordEditTextClassName , passwordEditTextIndex , password);
            this.click(engine , loginButtonClassName , loginButtonIndex);

        } else{//使用错误账号密码登录
            this.clearAndType(engine , usernameEditTextClassName , usernameEditTextIndex , username + "12131");
            this.clearAndType(engine , passwordEditTextClassName , passwordEditTextIndex , password + "12131");
            this.click(engine , loginButtonClassName , loginButtonIndex);

        }

        engine.pause(3000L);
    }

    public String getUsernameEditTextClassName() {
        return usernameEditTextClassName;
    }

    public void setUsernameEditTextClassName(String usernameEditTextClassName) {
        this.usernameEditTextClassName = usernameEditTextClassName;
    }

    public int getUsernameEditTextIndex() {
        return usernameEditTextIndex;
    }

    public void setUsernameEditTextIndex(int usernameEditTextIndex) {
        this.usernameEditTextIndex = usernameEditTextIndex;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordEditTextClassName() {
        return passwordEditTextClassName;
    }

    public void setPasswordEditTextClassName(String passwordEditTextClassName) {
        this.passwordEditTextClassName = passwordEditTextClassName;
    }

    public int getPasswordEditTextIndex() {
        return passwordEditTextIndex;
    }

    public void setPasswordEditTextIndex(int passwordEditTextIndex) {
        this.passwordEditTextIndex = passwordEditTextIndex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginButtonClassName() {
        return loginButtonClassName;
    }

    public void setLoginButtonClassName(String loginButtonClassName) {
        this.loginButtonClassName = loginButtonClassName;
    }

    public int getLoginButtonIndex() {
        return loginButtonIndex;
    }

    public void setLoginButtonIndex(int loginButtonIndex) {
        this.loginButtonIndex = loginButtonIndex;
    }
}
