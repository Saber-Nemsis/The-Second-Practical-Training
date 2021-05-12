package com.uiautomator_plus.testcase.lmr;

import android.view.KeyEvent;

import com.uiautomator_plus.core.BaseTest;
import com.uiautomator_plus.po.lmr.EntrancePage;
import com.uiautomator_plus.po.lmr.LoginPage;
import com.uiautomator_plus.po.lmr.MainPage;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCase_loginPage extends BaseTest {
    EntrancePage entrancePage=new EntrancePage();
    LoginPage loginPage=new LoginPage();
    MainPage mainPage=new MainPage();


    //登陆测试
    //测试步骤：输入正确的用户名和密码，查看能否登录成功
    @Test
    public void test_login_success(){
        String uname="admin";
        String pwd="123456";
        getEngine().click("text="+entrancePage.getLoginButtonText(),entrancePage.getLoginButtonIndex());
        getEngine().clearAndType("class="+loginPage.getUnameETClassName(),loginPage.getUnameETIndex(),uname);
        getEngine().clearAndType("class="+loginPage.getPwdETClassName(),loginPage.getPwdETIndex(),pwd);
        getEngine().click("text="+loginPage.getRegisterButtonText(),loginPage.getRegisterButtonIndex());
        Assert.assertTrue(getEngine().isElementPresent("text="+mainPage.getMainPageButtonText(),mainPage.getMainPageButtonIndex()));
        getDevice().pressKeyCode(KeyEvent.KEYCODE_BACK);
    }

    //登陆测试
    //测试步骤：输入正确的用户名和错误的密码，查看能否登录成功
    //bug描述：输入正确的用户名和错误的密码，可以登录成功
    @Test
    public void test_login_pwd_error(){
        String uname="admin";
        String pwd="111111";
        getEngine().click("text="+entrancePage.getLoginButtonText(),entrancePage.getLoginButtonIndex());
        getEngine().clearAndType("class="+loginPage.getUnameETClassName(),loginPage.getUnameETIndex(),uname);
        getEngine().clearAndType("class="+loginPage.getPwdETClassName(),loginPage.getPwdETIndex(),pwd);
        getEngine().click("class="+loginPage.getRegisterButtonText(),loginPage.getRegisterButtonIndex());
        Assert.assertFalse(getEngine().isElementPresent("text="+mainPage.getMainPageButtonText(),mainPage.getMainPageButtonIndex()));
    }

    //登陆测试
    //测试步骤：输入错误的用户名和错误的密码，查看能否登录成功
    //bug描述：输入错误的用户名和错误的密码可以登录成功
    @Test
    public void test_login_unameAndPwd_error(){
        String uname="11111";
        String pwd="111111";
        getEngine().click("text="+entrancePage.getLoginButtonText(),entrancePage.getLoginButtonIndex());
        getEngine().clearAndType("class="+loginPage.getUnameETClassName(),loginPage.getUnameETIndex(),uname);
        getEngine().clearAndType("class="+loginPage.getPwdETClassName(),loginPage.getPwdETIndex(),pwd);
        getEngine().click("class="+loginPage.getRegisterButtonText(),loginPage.getRegisterButtonIndex());
        Assert.assertFalse(getEngine().isElementPresent("text="+mainPage.getMainPageButtonText(),mainPage.getMainPageButtonIndex()));
    }

    //登陆测试
    //测试步骤：输入错误的用户名和错误的密码，查看能否登录成功
    //bug描述：不输入用户名和密码可以登陆成功
    @Test
    public void test_login_empty_login(){
        String uname="";
        String pwd="";
        getEngine().click("text="+entrancePage.getLoginButtonText(),entrancePage.getLoginButtonIndex());
        getEngine().clearAndType("class="+loginPage.getUnameETClassName(),loginPage.getUnameETIndex(),uname);
        getEngine().clearAndType("class="+loginPage.getPwdETClassName(),loginPage.getPwdETIndex(),pwd);
        getEngine().click("class="+loginPage.getRegisterButtonText(),loginPage.getRegisterButtonIndex());
        Assert.assertFalse(getEngine().isElementPresent("text="+mainPage.getMainPageButtonText(),mainPage.getMainPageButtonIndex()));
    }



}
