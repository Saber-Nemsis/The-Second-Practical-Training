package com.appium_plus.po.wyr;

import com.appium_plus.core.AndroidDriverEngine;
import lombok.Data;

/**
 * 登录页面，输入账号密码那个
 */
@Data
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
    private String loginButtonClassName = "class=android.widget.TextView";
    private int loginButtonIndex = 4;


    public void login(AndroidDriverEngine engine , int flag){
        if(flag == 0){//不使用账号密码登录
            engine.click(loginButtonClassName , loginButtonIndex);
        } else if(flag == 1){//试用账号密码登录
            engine.clearAndType(usernameEditTextClassName , usernameEditTextIndex , username);
            engine.clearAndType(passwordEditTextClassName , passwordEditTextIndex , password);
            engine.click(loginButtonClassName , loginButtonIndex);

        } else{//使用错误账号密码登录
            engine.clearAndType(usernameEditTextClassName , usernameEditTextIndex , username + "12131");
            engine.clearAndType(passwordEditTextClassName , passwordEditTextIndex , password + "12131");
            engine.click(loginButtonClassName , loginButtonIndex);

        }
    }
}
