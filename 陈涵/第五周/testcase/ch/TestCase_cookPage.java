package com.uiautomator_plus.testcase.ch;

import androidx.test.uiautomator.UiObjectNotFoundException;
import androidx.test.uiautomator.UiScrollable;
import androidx.test.uiautomator.UiSelector;

import com.uiautomator_plus.core.BaseTest;
import com.uiautomator_plus.po.ch.CookPage;
import com.uiautomator_plus.po.ch.EntrancePage;
import com.uiautomator_plus.po.ch.LoginPage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCase_cookPage extends BaseTest {
    EntrancePage entrancePage=new EntrancePage();
    LoginPage loginPage=new LoginPage();
    CookPage cookPage=new CookPage();
    @Before
    public void login(){
        getEngine().click("text="+entrancePage.getLoginButtonText(),entrancePage.getLoginButtonIndex());
        getEngine().clearAndType("class="+loginPage.getUnameETClassName(),loginPage.getUnameETIndex(),"ch");
        getEngine().clearAndType("class="+loginPage.getPwdETClassName(),loginPage.getPwdETIndex(),"123456");
        getEngine().click("text="+loginPage.getRegisterButtonText(),loginPage.getRegisterButtonIndex());
    }

    //做饭-详情01
    //步骤描述：点击做饭列表的一个食物介绍查看里面内容是否与点击的食物名称一致
    //bug描述：做饭简介的名字和做饭详细介绍的食物名字不一致
    @Test
    public void test_foodDetail01(){
        getEngine().click("text="+cookPage.getCookPageText(),cookPage.getCookPageIndex());
        getEngine().click("text="+cookPage.getFirstFoodText(),cookPage.getFirstFoodIndex());
        getEngine().click("class=android.widget.TextView",8);
        Assert.assertEquals(cookPage.getFirstFoodText(),"外加里嫩~炸豆腐丸子");
    }


    //做饭-详情02
    //步骤描述：滑动查看做饭步骤的具体内容
    //bug描述：存在相同内容重复的做饭步骤
    @Test
    public void test_foodDetail02() throws UiObjectNotFoundException {
        getEngine().click("text="+cookPage.getCookPageText(),cookPage.getCookPageIndex());
        getEngine().click("text="+cookPage.getFirstFoodText(),cookPage.getFirstFoodIndex());
        Assert.assertTrue(getEngine().isElementPresent("text="+cookPage.getStepText(),cookPage.getStepIndex()));
        UiScrollable scrollable=new UiScrollable(new UiSelector().className(cookPage.getCookPageScrollViewClassName()).scrollable(true));
        scrollable.scrollIntoView(new UiSelector().text("步骤4："));
        Assert.assertTrue(getEngine().isElementPresent("text="+cookPage.getStepText(),cookPage.getStepIndex()));

    }

}
