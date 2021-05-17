package com.uiautomator_plus.testcase.ch;

import com.uiautomator_plus.core.BaseTest;
import com.uiautomator_plus.po.ch.EntrancePage;
import com.uiautomator_plus.po.ch.MainPage;
import com.uiautomator_plus.po.ch.SigninPage;

import org.junit.Assert;
import org.junit.Test;

/**
 * 注册本身存在问题，点击注册并登录按钮会直接停止运行app
 */
public class TestCase_signinPage extends BaseTest {
    EntrancePage entrancePage=new EntrancePage();
    SigninPage signinPage=new SigninPage();
    MainPage mainPage=new MainPage();

    //注册01
    //步骤描述：输入符合条件的用户名和密码，然后再次输入密码与第一次输入密码一致，查看能否注册成功并登录
    //bug描述：输入符合条件的用户名和密码，再次输入密码与第一次输入密码一致，不能注册并登录成功
    @Test
    public void test_sigin01(){
        String uname="ch";
        String pwd="123456";
        getEngine().click("text="+entrancePage.getSigninButtonText(),entrancePage.getSigninButtonIndex());
        getEngine().clearAndType("class="+signinPage.getUnameETClassName(),signinPage.getUnameETIndex(),uname);
        getEngine().clearAndType("class="+signinPage.getPwdETClassName(),signinPage.getPwdETIndex(),pwd);
        getEngine().clearAndType("class="+signinPage.getAgainTypeETClassName(),signinPage.getAgainTypeETIndex(),pwd);
        getEngine().click("text="+signinPage.getLogonButtonText(),signinPage.getLogonButtonIndex());
        Assert.assertTrue(getEngine().isElementPresent("text="+mainPage.getMainPageButtonText(),mainPage.getMainPageButtonIndex()));
    }

    //注册02
    //步骤描述：输入符合条件的用户名和密码，然后再次输入密码与第一次输入密码一致，查看能否注册成功并登录
    //bug描述：输入符合条件的用户名和密码，再次输入密码与第一次输入密码一致，不能注册并登录成功
    @Test
    public void test_sigin02(){
        String uname="ch";
        String pwd="123456";
        String againTypePwd="654321";
        getEngine().click("text="+entrancePage.getSigninButtonText(),entrancePage.getSigninButtonIndex());
        getEngine().clearAndType("class="+signinPage.getUnameETClassName(),signinPage.getUnameETIndex(),uname);
        getEngine().clearAndType("class="+signinPage.getPwdETClassName(),signinPage.getPwdETIndex(),pwd);
        getEngine().clearAndType("class="+signinPage.getAgainTypeETClassName(),signinPage.getAgainTypeETIndex(),againTypePwd);
        getEngine().click("text="+signinPage.getLogonButtonText(),signinPage.getLogonButtonIndex());
        Assert.assertFalse(getEngine().isElementPresent("text="+mainPage.getMainPageButtonText(),mainPage.getMainPageButtonIndex()));
    }
}
