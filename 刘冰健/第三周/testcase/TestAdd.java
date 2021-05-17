package com.appiumPlus.testcase;

import com.appiumPlus.core.BaseTest;
import com.appiumPlus.po.AddPage;
import com.appiumPlus.po.CookPage;
import com.appiumPlus.po.EntrancePage;
import com.appiumPlus.po.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAdd extends BaseTest {
    private EntrancePage entrancePage;
    private LoginPage loginPage;
    private AddPage addPage;

    @BeforeClass
    public void selectLogin(){
        entrancePage = new EntrancePage();
        engine.click(entrancePage.getLoginButton(),entrancePage.getLoginButtonIndex());
        loginPage = new LoginPage();
        engine.type(loginPage.getUsername(),loginPage.getUsernameIndex(),"lbj");
        engine.type(loginPage.getPwd(),loginPage.getPwdIndex(),"123");
        engine.click(loginPage.getLoginButton(),loginPage.getLoginButtonIndex());
        addPage = new AddPage();
        engine.click(addPage.getAddButton(),addPage.getAddButtonIndex());
    }

    //输入物品名称，保质期，点击确认添加
    @Test
    public void test01(){
        engine.type(addPage.getName(),addPage.getNameIndex(),"可乐");
        engine.type(addPage.getLife(),addPage.getLifeIndex(),"30");
        engine.click(addPage.getConfirm(),0);
    }
}
