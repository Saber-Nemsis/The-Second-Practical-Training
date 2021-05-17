package com.uiautomator_plus.testcase.lbj;

import com.uiautomator_plus.core.BaseTest;
import com.uiautomator_plus.core.Engine;
import com.uiautomator_plus.po.lbj.EntrancePage;
import com.uiautomator_plus.po.lbj.RegistPage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestRegist extends BaseTest {

    private EntrancePage entrancePage;
    private RegistPage registPage;
    private Engine engine;

    @Before
    public void select(){
        engine = this.getEngine();
        entrancePage = new EntrancePage();
        engine.click(entrancePage.getRegistButton(),0);
        registPage = new RegistPage();
    }

    //打开注册界面，输入用户名，密码，确认密码，点击注册并登录
    @Test
    public void test01(){
        engine.clearAndType(registPage.getUsername(),registPage.getUsenameIndex(),"lbj");
        engine.clearAndType(registPage.getPwd(),registPage.getPwdIndex(),"123");
        engine.clearAndType(registPage.getConfirm(),registPage.getConfirmIndex(),"123");
        engine.click(registPage.getRegAndLog(),registPage.getRegAndLogIndex());
        Assert.assertTrue(engine.isElementPresent(registPage.getMainPageElem(),0));
    }

    //打开注册界面，输入用户名，密码，确认密码不同，点击注册并登录
    @Test
    public void test02(){
        engine.clearAndType(registPage.getUsername(),registPage.getUsenameIndex(),"lbj");
        engine.clearAndType(registPage.getPwd(),registPage.getPwdIndex(),"123");
        engine.clearAndType(registPage.getConfirm(),registPage.getConfirmIndex(),"lbj");
        engine.click(registPage.getRegAndLog(),registPage.getRegAndLogIndex());
        Assert.assertTrue(engine.isElementPresent(registPage.getMainPageElem(),0));
    }

}
