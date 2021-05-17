package com.uiautomator_plus.po.wyr;

import com.uiautomator_plus.core.Engine;


/**
 * 注册页面
 */
public class SigninPage  extends BasePage{

    //用户名输入框
    private String usernameEditTextClassName = "class=android.widget.EditText";
    private int usernameEditTextIndex = 0;
    private String username = "123123";

    //密码输入框
    private String passwordEditTextClassName  = "class=android.widget.EditText";
    private int passwordEditTextIndex = 1;
    private String password = "123123";

    //再次输入密码框
    private String passwordAgainEditTextClassName = "class=android.widget.EditText";
    private int passwordAgainEditTextIndex = 2;
    private String passwordAgain = "123123";

    private String signinButtonClassName = "class=android.widget.TextView";
    private int signinButtonIndex = 0;

    /**
     * 注册方法
     * @param engine
     */
    public void signin(Engine engine){
        engine.clearAndType(usernameEditTextClassName , usernameEditTextIndex , username);
        engine.clearAndType(passwordEditTextClassName , passwordAgainEditTextIndex , password);
        engine.clearAndType(passwordAgainEditTextClassName , passwordAgainEditTextIndex , passwordAgain);
        engine.click(signinButtonClassName , signinButtonIndex);
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

    public String getPasswordAgainEditTextClassName() {
        return passwordAgainEditTextClassName;
    }

    public void setPasswordAgainEditTextClassName(String passwordAgainEditTextClassName) {
        this.passwordAgainEditTextClassName = passwordAgainEditTextClassName;
    }

    public int getPasswordAgainEditTextIndex() {
        return passwordAgainEditTextIndex;
    }

    public void setPasswordAgainEditTextIndex(int passwordAgainEditTextIndex) {
        this.passwordAgainEditTextIndex = passwordAgainEditTextIndex;
    }

    public String getPasswordAgain() {
        return passwordAgain;
    }

    public void setPasswordAgain(String passwordAgain) {
        this.passwordAgain = passwordAgain;
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
