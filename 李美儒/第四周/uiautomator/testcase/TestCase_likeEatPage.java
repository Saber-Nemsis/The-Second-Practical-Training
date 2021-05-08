package com.uiautomator_plus.testcase.lmr;

import androidx.test.uiautomator.UiSelector;

import com.uiautomator_plus.core.BaseTest;
import com.uiautomator_plus.po.lmr.EntrancePage;
import com.uiautomator_plus.po.lmr.LikeEatPage;
import com.uiautomator_plus.po.lmr.LoginPage;

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
        getEngine().clearAndType("class="+loginPage.getUnameETClassName(),loginPage.getUnameETIndex(),"lmr");
        getEngine().clearAndType("class="+loginPage.getPwdETClassName(),loginPage.getPwdETIndex(),"123456");
        getEngine().click("text="+loginPage.getRegisterButtonText(),loginPage.getRegisterButtonIndex());
    }


    //搜索我的收藏搜索框测试
    //步骤描述：搜索框输入想要搜索的收藏，点击Enter进行搜索，查看搜索内容
    //bug描述：搜索框输入想要搜索的收藏之后点击Enter，跳转的界面中搜索框会显示默认值春菜
    @Test
    public void test_search_myFavorite(){
        String myFavorite="鸡蛋";
        getEngine().click("text="+likeEatPage.getLikePageText(),likeEatPage.getLikePageIndex());
        getEngine().clearAndType("text="+likeEatPage.getSearchMyFavoriteText(),likeEatPage.getSearchMyFavoriteIndex(),myFavorite);
        getEngine().click("text="+myFavorite,likeEatPage.getSearchMyFavoriteIndex());
        getDevice().pressEnter();
        Assert.assertFalse(getEngine().isElementPresent("text="+likeEatPage.getSearchDefaultText(),likeEatPage.getSearchDefaultIndex()));
    }

    //改变搜索框默认值测试
    //步骤描述：将搜索框的默认值改为想要进行搜索的收藏名字，点击并Enter，查看搜索结果
    //bug描述：搜索框未起到筛选作用，还有不是这个搜素名字的物品被显示
    @Test
    public void test_search_change_default(){
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


    @Test
    public void test(){
        getEngine().click("text="+likeEatPage.getLikePageText(),likeEatPage.getLikePageIndex());
//        UiSelector uiSelector=new UiSelector().fromParent(new UiSelector().text("西红柿炒鸡蛋")).childSelector(new UiSelector().className("android.view.View"));
        getEngine().click("class="+likeEatPage.getDeleteButtonClassName(),8);
    }
}
