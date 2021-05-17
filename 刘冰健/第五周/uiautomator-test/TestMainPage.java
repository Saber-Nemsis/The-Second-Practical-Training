package com.uiautomator_plus.testcase.lbj;

import com.uiautomator_plus.core.BaseTest;
import com.uiautomator_plus.core.Engine;
import com.uiautomator_plus.po.lbj.EntrancePage;
import com.uiautomator_plus.po.lbj.LoginPage;
import com.uiautomator_plus.po.lbj.MainPage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMainPage extends BaseTest {

    private EntrancePage entrancePage;
    private LoginPage loginPage;
    private MainPage mainPage;
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
        mainPage = new MainPage();
    }

    //冰箱里有苹果，搜索苹果，查看搜索结果
    @Test
    public void test01(){
        engine.clearAndType(mainPage.getSearch(),mainPage.getSearchIndex(),"苹果");
        engine.click(mainPage.getSearch(),mainPage.getSearchIndex());
        engine.pressEnter();
        Assert.assertFalse(engine.isElementPresent("text=鸡蛋",0));
    }

    //首次点击水果蔬菜，查看内容是否全部是水果蔬菜
    @Test
    public void test02(){
        engine.back();
        engine.click(mainPage.getFruitsAndVegetablesButton(),0);
        Assert.assertFalse(engine.isElementPresent("text=保质期还剩4天",0));
    }

    //点击肉蛋食品，查看内容是否全部是肉蛋食品
    @Test
    public void test03(){
        engine.click(mainPage.getMeatsAndEggButton(),0);
        Assert.assertFalse(engine.isElementPresent("text=海鲜",0));
    }
    //点击海鲜水产，查看内容是否全部是海鲜水产
    @Test
    public void test04(){
        engine.click(mainPage.getSeafoodButton(),0);
        Assert.assertFalse(engine.isElementPresent("text=鸡蛋",0));
    }
    //点击素食冷冻，查看内容是否全部是素食冷冻
    @Test
    public void test05(){
        engine.click(mainPage.getInstantAndFrozenFoodButton(),0);
        Assert.assertFalse(engine.isElementPresent("text=鸡蛋",0));
    }
    //点击零食饮品，查看内容是否全部是零食饮品
    @Test
    public void test06(){
        engine.click(mainPage.getSnacksAndDrinksButton(),0);
        Assert.assertFalse(engine.isElementPresent("text=鸡蛋",0));
    }
    //再次点击水果蔬菜，查看内容是否全部是水果蔬菜
    @Test
    public void test07(){
        engine.click(mainPage.getFruitsAndVegetablesButton(),0);
        Assert.assertFalse(engine.isElementPresent("text=鸡蛋",0));
    }
    //将水果蔬菜中的物品删除，查看能否成功删除
    @Test
    public void test08(){
        engine.click(mainPage.getFruitsAndVegetablesButton(),0);
        engine.click("class=android.widget.ImageView",9);
        engine.click(750,925);
        engine.click("class=android.widget.ImageView",9);
        engine.click(750,925);
    }
    //冰箱里没有苹果，搜索苹果，查看搜索结果
    @Test
    public void test09(){
        engine.clearAndType(mainPage.getSearch(),mainPage.getSearchIndex(),"苹果");
        engine.click(mainPage.getSearch(),mainPage.getSearchIndex());
        engine.pressEnter();
        Assert.assertFalse(engine.isElementPresent("text=苹果",0));
    }
    //搜索框输入纯数字，查看结果
    @Test
    public void test10(){
        engine.clearAndType(mainPage.getSearch(),mainPage.getSearchIndex(),"123");
        engine.click(mainPage.getSearch(),mainPage.getSearchIndex());
        engine.pressEnter();
        Assert.assertFalse(engine.isElementPresent("text=苹果",0));
    }
    //进入肉类食品分区，点击显示全部分类，查看是否显示全部的物品
    @Test
    public void test11(){
        engine.click(mainPage.getMeatsAndEggButton(),0);
        engine.click("text=显示全部分类",0);
    }
    //在全部分类中，选择一个物品点击删除，查看是否成功删除
    @Test
    public void test12(){
        engine.click(725,575);
        engine.click("id=android:id/button1",0);
        engine.click(725,575);
        engine.click("id=android:id/button1",0);
        Assert.assertFalse(engine.isElementPresent("text=鸡蛋",0));
    }
    //点击饭按钮，查看作用
    @Test
    public void test13(){
        engine.click(730,700);
        Assert.assertFalse(engine.isElementPresent(loginPage.getMainPageElem(),0));
    }
}
