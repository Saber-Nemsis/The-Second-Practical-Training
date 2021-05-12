package com.uiautomator_plus.testcase.lbj;

import com.uiautomator_plus.core.BaseTest;
import com.uiautomator_plus.core.Engine;
import com.uiautomator_plus.po.lbj.AddPage;
import com.uiautomator_plus.po.lbj.EntrancePage;
import com.uiautomator_plus.po.lbj.LoginPage;

import org.junit.Before;
import org.junit.Test;

public class TestAdd extends BaseTest {

    private EntrancePage entrancePage;
    private LoginPage loginPage;
    private AddPage addPage;
    private Engine engine;

    @Before
    public void selectLogin(){
        engine = this.getEngine();
        entrancePage = new EntrancePage();
        engine.click(entrancePage.getLoginButton(),0);
        loginPage = new LoginPage();
        engine.clearAndType(loginPage.getUsername(),loginPage.getUsernameIndex(),"lbj");
        engine.clearAndType(loginPage.getPwd(),loginPage.getPwdIndex(),"123");
        engine.click(loginPage.getLoginButton(),loginPage.getLoginButtonIndex());
        addPage = new AddPage();
        engine.click(addPage.getAddButton(),0);
    }

    //输入物品名称，保质期，点击确认添加
    @Test
    public void test01(){
        engine.clearAndType(addPage.getName(),addPage.getNameIndex(),"可乐");
        engine.clearAndType(addPage.getLife(),addPage.getLifeIndex(),"30");
        engine.click(addPage.getConfirm(),0);
    }
}
