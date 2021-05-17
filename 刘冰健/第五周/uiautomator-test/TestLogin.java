package com.uiautomator_plus.testcase.lbj;

import com.uiautomator_plus.core.BaseTest;
import com.uiautomator_plus.core.Engine;
import com.uiautomator_plus.po.lbj.EntrancePage;
import com.uiautomator_plus.po.lbj.LoginPage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestLogin extends BaseTest {

    private EntrancePage entrancePage;
    private LoginPage loginPage;
    private Engine engine;

    @Before
    public void selectLogin(){
        engine = this.getEngine();
        entrancePage = new EntrancePage();
        engine.click(entrancePage.getLoginButton(),0);
        loginPage = new LoginPage();
    }

    //打开登录界面，输入用户名和密码，查看能否成功登录
    @Test
    public void test01() throws InterruptedException {
        Thread.sleep(2000);
        engine.clearAndType(loginPage.getUsername(),loginPage.getUsernameIndex(),"lbj");
        engine.clearAndType(loginPage.getPwd(),loginPage.getPwdIndex(),"123");
        engine.click(loginPage.getLoginButton(),loginPage.getLoginButtonIndex());
        boolean present = engine.isElementPresent(loginPage.getMainPageElem(), 0);
        engine.back();
        Assert.assertTrue(present);
    }

    //打开登录界面，输入用户名，输入不同密码，查看是否能登录
    @Test
    public void test02(){

        engine.clearAndType(loginPage.getUsername(),loginPage.getUsernameIndex(),"lbj");
        engine.clearAndType(loginPage.getPwd(),loginPage.getPwdIndex(),"lbj");
        engine.click(loginPage.getLoginButton(),loginPage.getLoginButtonIndex());
        boolean present = engine.isElementPresent(loginPage.getMainPageElem(), 0);
        engine.back();
        Assert.assertFalse(present);
    }

    //打开登录界面，不输入用户名密码，查看是否能登录
    @Test
    public void test03(){
        engine.clearAndType(loginPage.getUsername(),loginPage.getUsernameIndex(),"");
        engine.clearAndType(loginPage.getPwd(),loginPage.getPwdIndex(),"");
        engine.click(loginPage.getLoginButton(),loginPage.getLoginButtonIndex());
        Assert.assertFalse(engine.isElementPresent(loginPage.getMainPageElem(),0));
    }
}
