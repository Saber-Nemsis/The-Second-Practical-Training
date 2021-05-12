package com.uiautomator_plus.testcase.lbj;

import com.uiautomator_plus.core.BaseTest;
import com.uiautomator_plus.core.Engine;
import com.uiautomator_plus.po.lbj.EntrancePage;
import com.uiautomator_plus.po.lbj.FavoriteFoodPage;
import com.uiautomator_plus.po.lbj.LoginPage;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFavoriteFood extends BaseTest {

    private EntrancePage entrancePage;
    private LoginPage loginPage;
    private FavoriteFoodPage favoriteFoodPage;
    private Engine engine;

    @BeforeClass
    public void selectLogin(){
        engine = this.getEngine();
        entrancePage = new EntrancePage();
        engine.click(entrancePage.getLoginButton(),0);
        loginPage = new LoginPage();
        engine.clearAndType(loginPage.getUsername(),loginPage.getUsernameIndex(),"lbj");
        engine.clearAndType(loginPage.getPwd(),loginPage.getPwdIndex(),"123");
        engine.click(loginPage.getLoginButton(),loginPage.getLoginButtonIndex());
        favoriteFoodPage = new FavoriteFoodPage();
        engine.click(favoriteFoodPage.getFavoriteFoodButton(),0);
    }

    //选择一个菜，点击删除，查看是否删除成功
    @Test
    public void test01(){
        engine.click(favoriteFoodPage.getX(),favoriteFoodPage.getY());
        engine.click(favoriteFoodPage.getConfirmButton(),0);
        boolean a = engine.isElementPresent("text=西红柿炒鸡蛋", 0);
        Assert.assertFalse(a);
    }

    //选择一个菜，点击删除，点击取消，看能否取消
    @Test
    public void test02(){
        engine.click(favoriteFoodPage.getX(),favoriteFoodPage.getY());
        engine.click(favoriteFoodPage.getCancelButton(),0);
        boolean a = engine.isElementPresent("text=西红柿炒鸡蛋", 0);
        Assert.assertTrue(a);
    }
    //搜索框搜索西红柿炒鸡蛋，查看是否能搜索到爱吃的菜
    @Test
    public void test03(){
        engine.clearAndType(favoriteFoodPage.getSearch(),favoriteFoodPage.getSearchIndex(),"西红柿炒鸡蛋");
        engine.click(favoriteFoodPage.getSearch(),favoriteFoodPage.getSearchIndex());
        engine.pressEnter();
        Assert.assertTrue(engine.isElementPresent("text=西红柿炒鸡蛋",0));
    }
}
