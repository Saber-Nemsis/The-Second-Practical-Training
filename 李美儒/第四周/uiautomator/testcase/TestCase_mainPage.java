package com.uiautomator_plus.testcase.lmr;

import android.util.Log;

import androidx.test.uiautomator.UiCollection;
import androidx.test.uiautomator.UiObject;
import androidx.test.uiautomator.UiObject2;
import androidx.test.uiautomator.UiObjectNotFoundException;
import androidx.test.uiautomator.UiScrollable;
import androidx.test.uiautomator.UiSelector;

import com.uiautomator_plus.core.BaseTest;
import com.uiautomator_plus.po.lmr.EntrancePage;
import com.uiautomator_plus.po.lmr.LoginPage;
import com.uiautomator_plus.po.lmr.MainPage;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestCase_mainPage extends BaseTest {
    EntrancePage entrancePage=new EntrancePage();
    LoginPage loginPage=new LoginPage();
    MainPage mainPage=new MainPage();

    @Before
    public void login(){
        getEngine().click("text="+entrancePage.getLoginButtonText(),entrancePage.getLoginButtonIndex());
        getEngine().clearAndType("class="+loginPage.getUnameETClassName(),loginPage.getUnameETIndex(),"lmr");
        getEngine().clearAndType("class="+loginPage.getPwdETClassName(),loginPage.getPwdETIndex(),"123456");
        getEngine().click("text="+loginPage.getRegisterButtonText(),loginPage.getRegisterButtonIndex());
    }

    //点击导航栏分类测试
    //步骤描述：点击导航栏中的水果蔬菜，查看所有显示的view是否满足水果蔬菜分类
    //bug描述：存在不是水果蔬菜的类型被显示
    @Test
    public void test_click_fruitsAndVegetablesButton() throws UiObjectNotFoundException {
        getEngine().click("text="+mainPage.getFruitsAndVagetavlesButtonText(),mainPage.getFruitAndVegetablesButtonIndex());
        UiScrollable scrollable=new UiScrollable(new UiSelector().className(mainPage.getClickButtonScrollViewClassName()).scrollable(true));
        scrollable.flingToEnd(5);
        String result=getEngine().getText("text="+mainPage.getClickFruitAndVegetablesButtonScrollLastViewText(),mainPage.getClickFruitAndVegeTablesButtonScrollLastViewIndex());
        System.out.println(result);
        Assert.assertEquals(result,"苹果");
    }

    //查看具体内容测试
    //步骤描述：点击导航栏中的水果蔬菜，点击分类下的一个view，看具体介绍是否满足对应
    @Test
    public void test_click_fruitsAndVegetablesButton_content() throws UiObjectNotFoundException {
        getEngine().click("text="+mainPage.getFruitsAndVagetavlesButtonText(),mainPage.getFruitAndVegetablesButtonIndex());
        Assert.assertTrue(getEngine().isElementPresent("text="+mainPage.getClickFruitAndVegetablesButtonScrollLastViewText(),0));
        UiCollection collection=new UiCollection(new UiSelector().className(mainPage.getClickButtonScrollViewClassName()).instance(0));
        int count=collection.getChildCount(new UiSelector().className("android.view.View"));
        UiObject uiObject =collection.getChildByInstance(new UiSelector().className("android.view.View"),count-1);
        getEngine().click("class=android.view.View",count-1);
        Assert.assertTrue(getEngine().isElementPresent("text=苹果",0));
    }
    //点击导航栏分类和具体介绍测试
    //步骤描述：点击导航栏中的肉蛋食品，查看所有显示的view是否满足肉蛋食品分类,并且点击进去查看是否是有关肉蛋食品的介绍
    //bug描述：点击导航栏中的肉蛋食品下的有关肉蛋食品的view，发现具体介绍不是有关肉蛋食品的，是苹果的
    @Test
    public void test_click_meatsAndEggButton() throws UiObjectNotFoundException {
        getEngine().click("text="+mainPage.getMeatsAndEggButtonText(),mainPage.getMeatsAndEggButtonIndex());
        Assert.assertTrue(getEngine().isElementPresent("text="+mainPage.getClickMeatsAndEggButtonScrollLastViewText(),mainPage.getClickMeatAndEggButtonScrollLastViewIndex()));
        UiCollection collection=new UiCollection(new UiSelector().className(mainPage.getClickButtonScrollViewClassName()).instance(0));
        int count=collection.getChildCount(new UiSelector().className("android.view.View"));
        UiObject uiObject =collection.getChildByInstance(new UiSelector().className("android.view.View"),count-1);
        getEngine().click("class=android.view.View",count-1);
        Assert.assertFalse(getEngine().isElementPresent("text=苹果",0));
    }

    //点击导航栏分类和具体介绍测试
    //步骤描述：点击导航栏中的海鲜水产，查看所有显示的view是否满足海鲜水产分类,并且点击进去查看是否是有关海鲜水产的介绍
    //bug描述：点击导航栏中的海鲜水产下的有关海鲜水产的view，发现具体介绍不是有关海鲜水产的，是苹果的
    @Test
    public void test_click_seafoodButton() throws UiObjectNotFoundException {
        getEngine().click("text="+mainPage.getSeafoodButtonText(),mainPage.getSeafoodButtonIndex());
        Assert.assertTrue(getEngine().isElementPresent("text="+mainPage.getClickSeafoodButtonScrollLastViewText(),mainPage.getClickSeafoodButtonScrollLastViewIndex()));
        UiCollection collection=new UiCollection(new UiSelector().className(mainPage.getClickButtonScrollViewClassName()).instance(0));
        int count=collection.getChildCount(new UiSelector().className("android.view.View"));
        UiObject uiObject =collection.getChildByInstance(new UiSelector().className("android.view.View"),count-1);
        getEngine().click("class=android.view.View",count-1);
        Assert.assertFalse(getEngine().isElementPresent("text=苹果",0));
    }

    //点击导航栏分类和具体介绍测试
    //步骤描述：点击导航栏中的速食冷冻，查看所有显示的view是否满足速食冷冻分类,并且点击进去查看是否是有关速食冷冻的介绍
    //bug描述：点击导航栏中的下的有关速食冷冻的类别，发现具体介绍不是有关速食冷冻的，是苹果的
    @Test
    public void test_click_instantAndFrozenFoodButton() throws UiObjectNotFoundException {
        getEngine().click("text="+mainPage.getInstantAndFrozenFoodButtonText(),mainPage.getInstantAndFrozenFoodButtonIndex());
        Assert.assertTrue(getEngine().isElementPresent("text="+mainPage.getClickInstanceAndFrozenButtonScrollLastViewText(),mainPage.getInstantAndFrozenFoodButtonIndex()));
        UiCollection collection=new UiCollection(new UiSelector().className(mainPage.getClickButtonScrollViewClassName()).instance(0));
        int count=collection.getChildCount(new UiSelector().className("android.view.View"));
        UiObject uiObject =collection.getChildByInstance(new UiSelector().className("android.view.View"),count-1);
        getEngine().click("class=android.view.View",count-1);
        Assert.assertFalse(getEngine().isElementPresent("text=苹果",0));
    }

    //点击导航栏分类和具体介绍测试
    //步骤描述：点击导航栏中的零食饮品，查看所有显示的view是否满足零食饮品分类,并且点击进去查看是否是有关零食饮品的介绍
    //bug描述：点击导航栏中的下的有关零食饮品的类别，发现具体介绍不是有关零食饮品的，是苹果的
    @Test
    public void test_click_snacksAndDrinksButton() throws UiObjectNotFoundException {
        getEngine().click("text="+mainPage.getSnacksAndDrinksButtonText(),mainPage.getSnacksAndDrinksButtonIndex());
        Assert.assertTrue(getEngine().isElementPresent("text="+mainPage.getClickSnacksAndDrinksButtonScrollLastViewText(),mainPage.getSnacksAndDrinksButtonIndex()));
        UiCollection collection=new UiCollection(new UiSelector().className(mainPage.getClickButtonScrollViewClassName()).instance(0));
        int count=collection.getChildCount(new UiSelector().className("android.view.View"));
        UiObject uiObject =collection.getChildByInstance(new UiSelector().className("android.view.View"),count-1);
        getEngine().click("class=android.view.View",count-1);
        Assert.assertFalse(getEngine().isElementPresent("text=苹果",0));
    }

    //返回键测试
    //步骤描述:点击导航栏的水果蔬菜分类，点击分类下的一个view，进入具体界面的详细介绍，查看返回键是否起作用
    @Test
    public void test_click_fruitsAndVegetablesButton_back() throws UiObjectNotFoundException {
        getEngine().click("text="+mainPage.getFruitsAndVagetavlesButtonText(),mainPage.getFruitAndVegetablesButtonIndex());
        UiCollection collection=new UiCollection(new UiSelector().className(mainPage.getClickButtonScrollViewClassName()).instance(0));
        int count=collection.getChildCount(new UiSelector().className("android.view.View"));
        UiObject uiObject =collection.getChildByInstance(new UiSelector().className("android.view.View"),count-1);
        getEngine().click("class=android.view.View",count-1);
        Assert.assertTrue(getEngine().isElementPresent("text="+mainPage.getIntroducePageText(),mainPage.getIntroducePageIndex()));
        getEngine().click("text="+mainPage.getBackButtonText(),mainPage.getBackButtonIndex());
        Assert.assertTrue(getEngine().isElementPresent("text="+mainPage.getMainPageButtonText(),mainPage.getMainPageButtonIndex()));
    }

    //返回键测试
    //步骤描述:点击导航栏的肉蛋食品分类，点击分类下的一个view，进入具体界面的详细介绍，查看返回键是否起作用
    @Test
    public void test_click_meatsAndEggButton_back() throws UiObjectNotFoundException {
        getEngine().click("text="+mainPage.getMeatsAndEggButtonText(),mainPage.getMeatsAndEggButtonIndex());
        UiCollection collection=new UiCollection(new UiSelector().className(mainPage.getClickButtonScrollViewClassName()).instance(0));
        int count=collection.getChildCount(new UiSelector().className("android.view.View"));
        UiObject uiObject =collection.getChildByInstance(new UiSelector().className("android.view.View"),count-1);
        getEngine().click("class=android.view.View",count-1);
        Assert.assertTrue(getEngine().isElementPresent("text="+mainPage.getIntroducePageText(),mainPage.getIntroducePageIndex()));
        getEngine().click("text="+mainPage.getBackButtonText(),mainPage.getBackButtonIndex());
        Assert.assertTrue(getEngine().isElementPresent("text="+mainPage.getMainPageButtonText(),mainPage.getMainPageButtonIndex()));
    }

    //返回键测试
    //步骤描述:点击导航栏的海鲜水产分类，点击分类下的一个view，进入具体界面的详细介绍，查看返回键是否起作用
    @Test
    public void test_click_seafoodButton_back() throws UiObjectNotFoundException {
        getEngine().click("text="+mainPage.getSeafoodButtonText(),mainPage.getSeafoodButtonIndex());
        UiCollection collection=new UiCollection(new UiSelector().className(mainPage.getClickButtonScrollViewClassName()).instance(0));
        int count=collection.getChildCount(new UiSelector().className("android.view.View"));
        UiObject uiObject =collection.getChildByInstance(new UiSelector().className("android.view.View"),count-1);
        getEngine().click("class=android.view.View",count-1);
        Assert.assertTrue(getEngine().isElementPresent("text="+mainPage.getIntroducePageText(),mainPage.getIntroducePageIndex()));
        getEngine().click("text="+mainPage.getBackButtonText(),mainPage.getBackButtonIndex());
        Assert.assertTrue(getEngine().isElementPresent("text="+mainPage.getMainPageButtonText(),mainPage.getMainPageButtonIndex()));
    }

    //返回键测试
    //步骤描述:点击导航栏的速食冷冻分类，点击分类下的一个view，进入具体界面的详细介绍，查看返回键是否起作用
    @Test
    public void test_click_instanceAndFrozenFoodButton_back() throws UiObjectNotFoundException {
        getEngine().click("text="+mainPage.getInstantAndFrozenFoodButtonText(),mainPage.getInstantAndFrozenFoodButtonIndex());
        UiCollection collection=new UiCollection(new UiSelector().className(mainPage.getClickButtonScrollViewClassName()).instance(0));
        int count=collection.getChildCount(new UiSelector().className("android.view.View"));
        UiObject uiObject =collection.getChildByInstance(new UiSelector().className("android.view.View"),count-1);
        getEngine().click("class=android.view.View",count-1);
        Assert.assertTrue(getEngine().isElementPresent("text="+mainPage.getIntroducePageText(),mainPage.getIntroducePageIndex()));
        getEngine().click("text="+mainPage.getBackButtonText(),mainPage.getBackButtonIndex());
        Assert.assertTrue(getEngine().isElementPresent("text="+mainPage.getMainPageButtonText(),mainPage.getMainPageButtonIndex()));
    }

    //返回键测试
    //步骤描述:点击导航栏的零食饮品分类，点击分类下的一个view，进入具体界面的详细介绍，查看返回键是否起作用
    @Test
    public void test_click_snacksAndDrinksButton_back() throws UiObjectNotFoundException {
        getEngine().click("text="+mainPage.getSnacksAndDrinksButtonText(),mainPage.getSnacksAndDrinksButtonIndex());
        UiCollection collection=new UiCollection(new UiSelector().className(mainPage.getClickButtonScrollViewClassName()).instance(0));
        int count=collection.getChildCount(new UiSelector().className("android.view.View"));
        UiObject uiObject =collection.getChildByInstance(new UiSelector().className("android.view.View"),count-1);
        getEngine().click("class=android.view.View",count-1);
        Assert.assertTrue(getEngine().isElementPresent("text="+mainPage.getIntroducePageText(),mainPage.getIntroducePageIndex()));
        getEngine().click("text="+mainPage.getBackButtonText(),mainPage.getBackButtonIndex());
        Assert.assertTrue(getEngine().isElementPresent("text="+mainPage.getMainPageButtonText(),mainPage.getMainPageButtonIndex()));
    }

    //搜索框测试
    //步骤描述：搜索框输入搜索内容，按Enter进行搜索
    //bug描述：按Enter进行搜索后，搜索框默认内容为春菜
    @Test
    public void test_search_type(){
        String searchText="黄瓜";
        getEngine().clearAndType("text="+mainPage.getSearchETText(),mainPage.getSearchETIndex(),searchText);
        getEngine().click("text="+searchText,mainPage.getSearchETIndex());
        getDevice().pressEnter();
        Assert.assertFalse(getEngine().isElementPresent("text="+mainPage.getSearchETDefaultText(),mainPage.getSearchETDefaultIndex()));
    }

    //搜索框测试
    //步骤描述：搜索框输入搜索内容，按Enter进行搜索,将搜索框的默认值春菜改为应定的搜索框内容，查看搜索结果
    //bug描述：搜索框的默认内容改为既定搜索内容时，还是不能起到搜索作用
    @Test
    public void test_search_Again_type(){
        String searchText="黄瓜";
        getEngine().clearAndType("text="+mainPage.getSearchETText(),mainPage.getSearchETIndex(),searchText);
        getEngine().click("text="+searchText,mainPage.getSearchETIndex());
        getDevice().pressEnter();
        getEngine().clearAndType("text="+mainPage.getSearchETDefaultText(),mainPage.getSearchETDefaultIndex(),searchText);
        Assert.assertFalse(getEngine().isElementPresent("text=苹果",0));
    }

    @After
    public void doAfterClass() {
        if (getDevice() != null) {
        }
    }
}
