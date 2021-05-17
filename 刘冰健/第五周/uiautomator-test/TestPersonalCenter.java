package com.uiautomator_plus.testcase.lbj;

import com.uiautomator_plus.core.BaseTest;
import com.uiautomator_plus.core.Engine;
import com.uiautomator_plus.po.lbj.EntrancePage;
import com.uiautomator_plus.po.lbj.LoginPage;
import com.uiautomator_plus.po.lbj.PersonalCenterPage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPersonalCenter extends BaseTest {

    private EntrancePage entrancePage;
    private LoginPage loginPage;
    private PersonalCenterPage personalCenterPage;
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
        personalCenterPage = new PersonalCenterPage();
        engine.click(personalCenterPage.getMineButton(),0);
    }

    //点击设置按钮，查看能否进入设置界面
    @Test
    public void test01(){
        engine.click(personalCenterPage.getSetX(),personalCenterPage.getSetY());
        Assert.assertFalse(engine.isElementPresent(personalCenterPage.getSubscription(),0));
    }

    //进入关注界面，查看关注用户数量是否和显示的数量一致
    @Test
    public void test02(){
        engine.click(personalCenterPage.getSubscription(),0);
        boolean present = engine.isElementPresent("text=已关注",3);
        Assert.assertTrue(present);
    }

    //进入关注界面，点击一个已关注用户，再次点击已关注，查看能否取消关注
    @Test
    public void test03(){
        engine.click("text=已关注",0);
        engine.click("text=已关注",0);
        Assert.assertTrue(engine.isElementPresent("text=关注",0));
    }

    //进入粉丝界面，查看粉丝数量是否和显示数量一致
    @Test
    public void test04(){
        engine.click(personalCenterPage.getMineButton(),0);
        engine.click(personalCenterPage.getMyFuns(),0);
        boolean present = engine.isElementPresent("text=关注",3);
        Assert.assertFalse(present);
    }

    //选择一个未关注的粉丝，点击关注，查看能否关注
    @Test
    public void test05(){
        engine.click("text=关注",0);
        engine.click(730,300);
        Assert.assertTrue(engine.isElementPresent("text=关注",0));
    }
}
