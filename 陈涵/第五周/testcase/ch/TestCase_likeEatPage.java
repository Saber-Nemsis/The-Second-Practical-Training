package com.uiautomator_plus.testcase.ch;

import com.uiautomator_plus.core.BaseTest;
import com.uiautomator_plus.po.ch.EntrancePage;
import com.uiautomator_plus.po.ch.LikeEatPage;
import com.uiautomator_plus.po.ch.LoginPage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCase_likeEatPage extends BaseTest {
    EntrancePage entrancePage=new EntrancePage();
    LoginPage loginPage=new LoginPage();
    LikeEatPage likeEatPage=new LikeEatPage();
    @Before
    public void login(){
        getEngine().click("text="+entrancePage.getLoginButtonText(),entrancePage.getLoginButtonIndex());
        getEngine().clearAndType("class="+loginPage.getUnameETClassName(),loginPage.getUnameETIndex(),"ch");
        getEngine().clearAndType("class="+loginPage.getPwdETClassName(),loginPage.getPwdETIndex(),"123456");
        getEngine().click("text="+loginPage.getRegisterButtonText(),loginPage.getRegisterButtonIndex());
    }



    //爱吃-搜索01
    //步骤描述：输入，点击并Enter，查看搜索结果
    //bug描述：搜索框未起到筛选作用，还有不是这个搜素名字的物品被显示
    @Test
    public void test_search01{
        String myFavorite="鸡蛋";
        getEngine().click("text="+likeEatPage.getLikePageText(),likeEatPage.getLikePageIndex());
        getEngine().clearAndType("text="+likeEatPage.getSearchMyFavoriteText(),likeEatPage.getSearchMyFavoriteIndex(),myFavorite);
        getEngine().click("text="+myFavorite,likeEatPage.getSearchMyFavoriteIndex());
        getDevice().pressEnter();
        getEngine().clearAndType("text"+likeEatPage.getSearchDefaultText(),likeEatPage.getSearchDefaultIndex(),myFavorite);
        getEngine().click("text="+likeEatPage.getSearchDefaultText(),likeEatPage.getSearchDefaultIndex());
        getDevice().pressEnter();
        Assert.assertFalse(getEngine().isElementPresent("text=苹果",0));
    }

	//爱吃-搜索02
    //步骤描述：不输入，点击并Enter，查看搜索结果
    //bug描述：搜索框未起到筛选作用
    @Test
    public void test_search02{
        getEngine().click("text="+myFavorite,likeEatPage.getSearchMyFavoriteIndex());
        getDevice().pressEnter();
        getEngine().clearAndType("text"+likeEatPage.getSearchDefaultText(),likeEatPage.getSearchDefaultIndex(),myFavorite);
        getEngine().click("text="+likeEatPage.getSearchDefaultText(),likeEatPage.getSearchDefaultIndex());
        getDevice().pressEnter();
        Assert.assertFalse(getEngine().isElementPresent("text=苹果",0));
    }
    
}
