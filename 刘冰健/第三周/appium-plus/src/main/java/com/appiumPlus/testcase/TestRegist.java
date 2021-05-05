package com.appiumPlus.testcase;

import com.appiumPlus.core.BaseTest;
import com.appiumPlus.po.EntrancePage;
import com.appiumPlus.po.LoginPage;
import com.appiumPlus.po.RegistPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestRegist extends BaseTest {

    private EntrancePage entrancePage;
    private RegistPage registPage;

    @BeforeClass
    public void selectLogin(){
        entrancePage = new EntrancePage();
        engine.click(entrancePage.getRegistButton(),entrancePage.getRegistButtonIndex());
        registPage = new RegistPage();
    }

    //打开注册界面，输入用户名，密码，确认密码，点击注册并登录
    @Test
    public void test01(){
        engine.type(registPage.getUsername(),registPage.getUsenameIndex(),"lbj");
        engine.type(registPage.getPwd(),registPage.getPwdIndex(),"123");
        engine.type(registPage.getConfirm(),registPage.getConfirmIndex(),"123");
        engine.click(registPage.getRegAndLog(),registPage.getRegAndLogIndex());
        Assert.assertTrue(engine.isElementPresent(registPage.getMainPageElem(),0));
    }

    //打开注册界面，输入用户名，密码，确认密码不同，点击注册并登录
    @Test
    public void test02(){
        engine.type(registPage.getUsername(),registPage.getUsenameIndex(),"lbj");
        engine.type(registPage.getPwd(),registPage.getPwdIndex(),"123");
        engine.type(registPage.getConfirm(),registPage.getConfirmIndex(),"lbj");
        engine.click(registPage.getRegAndLog(),registPage.getRegAndLogIndex());
        Assert.assertTrue(engine.isElementPresent(registPage.getMainPageElem(),0));
    }
}
