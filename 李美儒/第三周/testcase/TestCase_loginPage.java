package com.appium_plus.testcase.lmr;

import com.appium_plus.core.BaseTest;
import com.appium_plus.po.lmr.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase_loginPage extends BaseTest {
    private LoginPage loginPage;
    @BeforeClass
    public void selectLogin(){
        loginPage=new LoginPage();
        //点击登录
        engine.click("class="+loginPage.getLoginButtonClassName() , loginPage.getLoginButtonIndex());
    }

    //登录测试
    //步骤描述：输入正确的用户名和密码，点击登录按钮
    @Test
    public void testLogin(){
        String uname="admin";
        String pwd="123456";
        //输入账号
        engine.clearAndType("class="+loginPage.getUnameEditTextClassName() ,loginPage.getUnameEditTextIndex() , uname);
        //输入密码
        engine.clearAndType("class="+loginPage.getPwdEditTextClassName() , loginPage.getPwdEditTextIndex() , pwd);
        //点击登录
        engine.click("class="+loginPage.getRegButtonClassName() , loginPage.getRegButtonIndex());
        Assert.assertTrue(engine.isElementPresent("xpath="+loginPage.getMainPageButtonXpath(),loginPage.getMainPageButtonIndex()));
    }

    //登录测试
    //步骤描述：输入用户名，不输入密码，点击登录
    //bug描述：只输入用户名，不输入密码，也能进行登录，存在bug
    @Test
    public void test_login_no_password(){
        String uname="admin";
        String pwd="";
        //输入账号
        engine.clearAndType("class="+loginPage.getUnameEditTextClassName() ,loginPage.getUnameEditTextIndex() , uname);
        //输入密码
        engine.clearAndType("class="+loginPage.getPwdEditTextClassName() , loginPage.getPwdEditTextIndex() , pwd);
        //点击登录
        engine.click("class="+loginPage.getRegButtonClassName() , loginPage.getRegButtonIndex());
        Assert.assertFalse(engine.isElementPresent("xpath="+loginPage.getMainPageButtonXpath(),loginPage.getMainPageButtonIndex()));
    }

    //登陆测试
    //步骤描述：输入错误的用户名和密码，点击登录
    //bug描述：输入错误的用户名和密码也能进行登录，存在bug
    @Test
    public void test_login_error_unameAndPwd(){
        String uname="111";
        String pwd="111";
        //输入账号
        engine.clearAndType("class="+loginPage.getUnameEditTextClassName() ,loginPage.getUnameEditTextIndex() , uname);
        //输入密码
        engine.clearAndType("class="+loginPage.getPwdEditTextClassName() , loginPage.getPwdEditTextIndex() , pwd);
        //点击登录
        engine.click("class="+loginPage.getRegButtonClassName() , loginPage.getRegButtonIndex());
        Assert.assertFalse(engine.isElementPresent("xpath="+loginPage.getMainPageButtonXpath(),loginPage.getMainPageButtonIndex()));
    }
}
