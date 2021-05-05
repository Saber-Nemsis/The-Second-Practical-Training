package com.appium_plus.testcase.lmr;

import com.appium_plus.core.BaseTest;
import com.appium_plus.po.lmr.SigninPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * 注册本身存在问题，不能进行点击
 */
public class TestCase_signinPage extends BaseTest {
    private SigninPage signinPage;
    @BeforeClass
    public void selectSignIn(){
        signinPage=new SigninPage();
        engine.click("class="+signinPage.getSigninButtonClassName(),signinPage.getSigninButtonIndex());
    }

    //注册测试
    //步骤描述：点击注册，输入正确的用户名和密码，再次输入密码一致，点击注册并登录
    //bug描述：不能进行注册
    @Test
    public void test_logon(){
        String uname="lmr";
        String pwd="123456";
        String pwd_again="123456";
        engine.clearAndType("class="+signinPage.getUnameETClassName(),signinPage.getUnameETIndex(),uname);
        engine.clearAndType("class="+signinPage.getPwdETClassName(),signinPage.getPwdETIndex(),pwd);
        engine.clearAndType("class="+signinPage.getPwdAgainETClassName(),signinPage.getPwdAgainETIndex(),pwd_again);
        engine.click("class="+signinPage.getLogonButtonClassName(),signinPage.getLogonButtonIndex());
        Assert.assertTrue(engine.isElementPresent("xpath="+signinPage.getMainPageButtonXpath(),signinPage.getMainPageButtonIndex()));
    }

    //注册测试
    //步骤描述：点击注册按钮，输入用户名和密码，再次出入密码时与上一次密码不一致，点击注册并登录
    @Test
    public void test_logon_pwd_again_different(){
        String uname="lmr";
        String pwd="123456";
        String pwd_again="12345";
        engine.clearAndType("class="+signinPage.getUnameETClassName(),signinPage.getUnameETIndex(),uname);
        engine.clearAndType("class="+signinPage.getPwdETClassName(),signinPage.getPwdETIndex(),pwd);
        engine.clearAndType("class="+signinPage.getPwdAgainETClassName(),signinPage.getPwdAgainETIndex(),pwd_again);
        engine.click("class="+signinPage.getLogonButtonClassName(),signinPage.getLogonButtonIndex());
        Assert.assertFalse(engine.isElementPresent("xpath="+signinPage.getMainPageButtonXpath(),signinPage.getMainPageButtonIndex()));

    }




}
