package com.uiautomator_plus.testcase.ch;

import com.uiautomator_plus.core.BaseTest;
import com.uiautomator_plus.po.lmr.EntrancePage;
import com.uiautomator_plus.po.lmr.LoginPage;
import com.uiautomator_plus.po.lmr.MainPage;

import org.junit.Assert;
import org.junit.Test;

public class TestCase_loginPage extends BaseTest {
    EntrancePage entrancePage=new EntrancePage();
    LoginPage loginPage=new LoginPage();
    MainPage mainPage=new MainPage();


    //登陆01
    //测试步骤：输入正确的用户名和密码，查看能否登录成功
    @Test
    public void test_login01(){
        String uname="ch";
        String pwd="123456";
        getEngine().click("text="+entrancePage.getLoginButtonText(),entrancePage.getLoginButtonIndex());
        getEngine().clearAndType("class="+loginPage.getUnameETClassName(),loginPage.getUnameETIndex(),uname);
        getEngine().clearAndType("class="+loginPage.getPwdETClassName(),loginPage.getPwdETIndex(),pwd);
        getEngine().click("class="+loginPage.getRegisterButtonText(),loginPage.getRegisterButtonIndex());
        Assert.assertTrue(getEngine().isElementPresent("text="+mainPage.getMainPageButtonText(),mainPage.getMainPageButtonIndex()));
    }

    //登陆02
    //测试步骤：不输入用户名和密码，查看能否登录成功
    //bug描述：不输入也能登陆成功
    @Test
    public void test_login02(){

        getEngine().click("text="+entrancePage.getLoginButtonText(),entrancePage.getLoginButtonIndex());

        getEngine().click("class="+loginPage.getRegisterButtonText(),loginPage.getRegisterButtonIndex());
        Assert.assertFalse(getEngine().isElementPresent("text="+mainPage.getMainPageButtonText(),mainPage.getMainPageButtonIndex()));
    }

}
