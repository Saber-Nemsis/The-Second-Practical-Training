package com.uiautomator_plus.testcase.ch;

import com.uiautomator_plus.core.BaseTest;
import com.uiautomator_plus.core.Engine;
import com.uiautomator_plus.po.ch.EntrancePage;
import com.uiautomator_plus.po.ch.LoginPage;
import com.uiautomator_plus.po.ch.MainPage;
import com.uiautomator_plus.po.ch.GoodsInfoPage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestCase_mainPage extends BaseTest {
    EntrancePage entrancePage=new EntrancePage();
    LoginPage loginPage=new LoginPage();
    MainPage mainPage=new MainPage();

    @Before
    public void login(){
        getEngine().click("text="+entrancePage.getLoginButtonText(),entrancePage.getLoginButtonIndex());
        getEngine().clearAndType("class="+loginPage.getUnameETClassName(),loginPage.getUnameETIndex(),"ch");
        getEngine().clearAndType("class="+loginPage.getPwdETClassName(),loginPage.getPwdETIndex(),"123456");
        getEngine().click("text="+loginPage.getRegisterButtonText(),loginPage.getRegisterButtonIndex());
    }

    //主页-搜索01
    //步骤：输入名字，搜索，查看搜索结果
    //bug；搜索结果未过滤
    @Test
    public void testSearch01(){
        //输入内容
        String inputContent = "苹果";
        mainPage.clearAndType(getEngine() , mainPage.getInputClassName() , mainPage.getInputIndex() , inputContent);
        getEngine().click(mainPage.getInputClassName(),mainPage.getInputIndex());
        getDevice().pressEnter();
        Assert.assertFalse(getEngine().isElementPresent("海鲜",1));
    }

    //主页-搜索02
    //步骤：不输入，搜索，查看搜索结果
    //bug；显示全部内容
    @Test
    public void testSearch03(){
        //输入内容
        String inputContent = "橘子";
        mainPage.clearAndType(getEngine() , mainPage.getInputClassName() , mainPage.getInputIndex() , inputContent);
        getEngine().click(mainPage.getInputClassName(),mainPage.getInputIndex());
        getDevice().pressEnter();
        Assert.assertFalse(getEngine().isElementPresent("海鲜",1));
    }

    //主页-搜索03
    //步骤：输入特殊字符，搜索，查看搜索结果
    //bug；显示全部内容
    @Test
    public void testSearch02(){
        //输入内容
        String inputContent = "&…………&%……%";
        mainPage.clearAndType(getEngine() , mainPage.getInputClassName() , mainPage.getInputIndex() , inputContent);
        getEngine().click(mainPage.getInputClassName(),mainPage.getInputIndex());
        getDevice().pressEnter();
        Assert.assertTrue(getEngine().isElementPresent("&…………&%……%",1));
    }

    //主页-分类01
    //步骤：点击蔬菜分类
    //bug；分类有误
    @Test
    public void testClickFruitAndVegetableButton(){

        //获取主页所有记录
        com.uiautomator_plus.po.wyr.MainPage mainPage = new com.uiautomator_plus.po.wyr.MainPage();
        int beforeClickCount = getEngine().findElements(mainPage.getAllGoodsClassName()).size();
        //点击水果蔬菜按钮
        mainPage.click(getEngine() , mainPage.getFruitAndVegetableButtonClassName() , mainPage.getFruitAndVegetableButtonIndex());
        //获取主页所有记录
        int afterClickCount = getEngine().findElements(mainPage.getAllGoodsClassName()).size();
        Assert.assertTrue(beforeClickCount == afterClickCount);
    }

    //主页-分类02
    //步骤：点击肉蛋分类
    //bug；分类有误
    @Test
    public void testClickMeatAndEggButton(){

        //获取主页所有记录
        com.uiautomator_plus.po.wyr.MainPage mainPage = new com.uiautomator_plus.po.wyr.MainPage();
        int beforeClickCount = getEngine().findElements(mainPage.getAllGoodsClassName()).size();
        //点击按钮
        mainPage.click(getEngine() , mainPage.getMeatAndEggButtonClassName() , mainPage.getMeatAndEggButtonIndex());
        //获取主页所有记录
        int afterClickCount = getEngine().findElements(mainPage.getAllGoodsClassName()).size();
        Assert.assertTrue(beforeClickCount == afterClickCount);
    }

    //主页-分类03
    //步骤：点击海鲜分类
    //bug；分类有误
    @Test
    public void testClickSeafoodButton(){

        //获取主页所有记录
        com.uiautomator_plus.po.wyr.MainPage mainPage = new com.uiautomator_plus.po.wyr.MainPage();
        int beforeClickCount = getEngine().findElements(mainPage.getAllGoodsClassName()).size();
        //点击按钮
        mainPage.click(getEngine() , mainPage.getSeafoodButtonClassName() , mainPage.getSeafoodButtonIndex());
        //获取主页所有记录
        int afterClickCount = getEngine().findElements(mainPage.getAllGoodsClassName()).size();
        Assert.assertTrue(beforeClickCount == afterClickCount);
    }

    //主页-列表01
    //步骤：点击删除按钮
    @Test
    public void testDeleteButton(){

        //先获取当前页面有多少个记录
        com.uiautomator_plus.po.wyr.MainPage mainPage = new com.uiautomator_plus.po.wyr.MainPage();
        int beforeDeleteCount = getEngine().findElements(mainPage.getAllGoodsClassName()).size();

        //点击第一条记录的删除
        mainPage.click(getEngine() , mainPage.getFirstGoodsDeleteButtonClassName() , mainPage.getFirstGoodsDeleteButtonIndex());
        //点击删除弹窗的确定
        mainPage.click(getEngine() , mainPage.getAlertButtonClassName() , mainPage.getAlertButtonIndex());

        //删除后的记录
        int afterDeleteCount = getEngine().findElements(mainPage.getAllGoodsClassName()).size();

        Assert.assertTrue(beforeDeleteCount == afterDeleteCount);
    }

    //主页-列表02
    //步骤：点击饭按钮
    //bug：点击无效果
    @Test
    public void testFanButton(){
        getEngine().click("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.TextView",0);
        Assert.assertFalse(getEngine().isElementPresent(mainPage.getMainPageXapth(),0));
    }

    //主页-详情01
    //步骤：点击列表进入详情页面
    @Test
    public void clickList(){
        //点击一种物品
        mainPage.click(getEngine() , mainPage.getGoodsClassName() , mainPage.getGoodsIndex());

        //断言营养小贴士是否存在
        GoodsInfoPage goodsInfoPage = new GoodsInfoPage();
        Assert.assertTrue(getEngine().isDisplayed(goodsInfoPage.getRemainderClassName() , goodsInfoPage.getRemainderIndex()));
    }
}
