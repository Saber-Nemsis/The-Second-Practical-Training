package com.appiumPlus.testcase;

import com.appiumPlus.core.BaseTest;
import com.appiumPlus.po.EntrancePage;
import com.appiumPlus.po.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestLogin extends BaseTest {
    private EntrancePage entrancePage;
    private LoginPage loginPage;

    @BeforeClass
    public void selectLogin(){
        entrancePage = new EntrancePage();
        engine.click(entrancePage.getLoginButton(),entrancePage.getLoginButtonIndex());
        loginPage = new LoginPage();
    }

    //打开登录界面，输入用户名和密码，查看能否成功登录
    @Test
    public void test01(){
        engine.type(loginPage.getUsername(),loginPage.getUsernameIndex(),"lbj");
        engine.type(loginPage.getPwd(),loginPage.getPwdIndex(),"123");
        engine.click(loginPage.getLoginButton(),loginPage.getLoginButtonIndex());
        Assert.assertTrue(engine.isElementPresent(loginPage.getMainPageElem(),0));
    }

    //打开登录界面，输入用户名，输入不同密码，查看是否能登录
    @Test
    public void test02(){
        engine.type(loginPage.getUsername(),loginPage.getUsernameIndex(),"lbj");
        engine.type(loginPage.getPwd(),loginPage.getPwdIndex(),"lbj");
        engine.click(loginPage.getLoginButton(),loginPage.getLoginButtonIndex());
        Assert.assertFalse(engine.isElementPresent(loginPage.getMainPageElem(),0));
    }

    //打开登录界面，不输入用户名密码，查看是否能登录
    @Test
    public void test03(){
        engine.click(loginPage.getLoginButton(),loginPage.getLoginButtonIndex());
        Assert.assertFalse(engine.isElementPresent(loginPage.getMainPageElem(),0));
    }
}
