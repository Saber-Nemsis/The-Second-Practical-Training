package com.appium_plus.po.wyr;

import com.appium_plus.core.AndroidDriverEngine;
import lombok.Data;

/**
 * 注册页面
 */
@Data
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
    public void signin(AndroidDriverEngine engine){
        engine.clearAndType(usernameEditTextClassName , usernameEditTextIndex , username);
        engine.clearAndType(passwordEditTextClassName , passwordAgainEditTextIndex , password);
        engine.clearAndType(passwordAgainEditTextClassName , passwordAgainEditTextIndex , passwordAgain);
        engine.click(signinButtonClassName , signinButtonIndex);
    }
}
