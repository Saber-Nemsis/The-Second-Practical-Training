package com.appiumPlus.testcase.ch;

import com.appiumPlus.core.BaseTest;
import com.appiumPlus.po.ch.MainPage;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TeseCase_mainPage extends BaseTest {

    public MainPage mainPage;
    @BeforeClass
    public void initPage(){
        mainPage=new MainPage();
        //点击登录
        engine.click("class=android.widget.TextView" , 0);
        //输入账号
        engine.clearAndType("class=android.widget.EditText" , 0 , "ch");
        //输入密码
        engine.clearAndType("class=android.widget.EditText" , 1 , "123456");
        //点击登录
        engine.click("class=android.widget.TextView" , 4);

    }


    //主页-搜索01
    //步骤描述：搜索框输入一个类别回车，跳转页面之后查看显示的是否都是输入的类别
    //bug描述：输入框输入的内容并未起到筛选作用
    @Test
    public void test_search_show01(){
        engine.clearAndType("class=android.widget.EditText",2,"鸡蛋");
        engine.click("class=android.widget.EditText",2);
        getDriver().pressKey(new KeyEvent(AndroidKey.ENTER));
        String locator=mainPage.getBaseLocator()+"/android.view.View/android.widget.ScrollView/android.view.View/android.view.View/android.widget.TextView";
        String showResult=engine.getText("xpath="+locator,2);
        Assert.assertEquals(showResult,"鸡蛋");
    }

    //主页-搜索02
    //步骤描述：搜索框不输入直接回车，跳转页面之后查看显示
    //bug描述：输入框输入的内容并未起到筛选作用
    @Test
    public void test_search_show02(){
        
        engine.click("class=android.widget.EditText",2);
        getDriver().pressKey(new KeyEvent(AndroidKey.ENTER));
        String locator=mainPage.getBaseLocator()+"/android.view.View/android.widget.ScrollView/android.view.View/android.view.View/android.widget.TextView";
        String showResult=engine.getText("xpath="+locator,2);
        Assert.assertEquals(showResult,"芒果");
    }

    //主页-搜索03
    //步骤描述：搜索框输入特殊字符回车，跳转页面之后查看显示
    //bug描述：输入框对于特殊字符没有过滤
    @Test
    public void test_search_show03(){
        engine.clearAndType("class=android.widget.EditText",2,"%￥%#%￥");
        engine.click("class=android.widget.EditText",2);
        getDriver().pressKey(new KeyEvent(AndroidKey.ENTER));
        String locator=mainPage.getBaseLocator()+"/android.view.View/android.widget.ScrollView/android.view.View/android.view.View/android.widget.TextView";
        String showResult=engine.getText("xpath="+locator,2);
        Assert.assertEquals(showResult,"%￥%#%￥");
    }

    //主页-分类01
    //步骤描述：点击水果蔬菜，查看是否有不是水果蔬菜分类的东西显示
    //bug描述：分类有误
    @Test
    public void test_click_fruitsAndVegetablesButton(){
        String fruitsAndVegetablesButtonLoctor=mainPage.getFruitsAndVegetablesButtonClassName();
        engine.click("class="+fruitsAndVegetablesButtonLoctor,mainPage.getFruitsAndVegetablesButtonIndex());
        String textLocator="//android.widget.ScrollView/android.view.View/android.view.View[2]/android.widget.TextView";
        engine.scrollToBottom(getDriver(),mainPage.getEndString());
        String result=engine.getText("xpath="+textLocator,2);
        System.out.println(result);
        Assert.assertEquals(result,"苹果");
    }


    //主页-列表01
    //步骤描述：任意点击一个分类，点击第一个介绍类别中的删除按钮，查看这个按钮是否会触发事件，点击确定，查看点击确定之后是否能成功删除
    @Test
    public void test_main_introdution_button01(){
        String fruitsAndVegetablesButtonLoctor=mainPage.getFruitsAndVegetablesButtonClassName();
        engine.click("class="+fruitsAndVegetablesButtonLoctor,mainPage.getFruitsAndVegetablesButtonIndex());
        String buttonLocator="//android.widget.ScrollView/android.view.View/android.view.View/android.view.View";
        engine.click("xpath="+buttonLocator,0);
        //判断按钮可点击，会触发事件
        String confirm_message=engine.getText("id=android:id/message",0);
        Assert.assertEquals(confirm_message,"你确定要删除吗？");
        //点击确定
        engine.click("id=android:id/button1",0);
        //判断是否被删除
        String locator="//android.widget.ScrollView/android.view.View/android.view.View";
        Assert.assertFalse(engine.isElementPresent("xpath="+locator,1));
    }

    //主页-列表02
    //步骤描述：任意点击一个分类，点击第一个介绍类别中的饭按钮，查看是否起作用会触发事件
    //bug描述：点击饭按钮，可以点击但是不会触发事件
    @Test
    public void test_main_introdution_button02(){
        String fruitsAndVegetablesButtonLoctor=mainPage.getFruitsAndVegetablesButtonClassName();
        engine.click("class="+fruitsAndVegetablesButtonLoctor,mainPage.getFruitsAndVegetablesButtonIndex());
        String foodLocator="//android.widget.ScrollView/android.view.View/android.view.View/android.view.View";
        engine.click("xpath="+foodLocator,1);
        Assert.assertFalse(engine.isElementPresent("xpath="+foodLocator,1));
    }

    //主页-详情01
    //步骤描述：点击任意列表
    @Test
    public void test_controduction_button01(){
        String locator=mainPage.getSnacksAndDrinksButtonClassName();
        engine.click("class="+locator,mainPage.getSnacksAndDrinksButtonIndex());
        String viewLocator="//android.widget.ScrollView/android.view.View/android.view.View";
        engine.click("xpath="+viewLocator,0);
        String buttonLocator=mainPage.getBaseLocator()+"/android.widget.ScrollView/android.view.View/android.view.View";
        Assert.assertTrue(engine.isElementPresent("xpath="+buttonLocator,1));
    }

    //主页-详情02
    //步骤描述：进入类别具体介绍界面查看饭按钮是否可点击，是否起作用
    //bug描述：饭按钮无作用
    @Test
    public void test_controduction_button02(){
        String locator=mainPage.getSnacksAndDrinksButtonClassName();
        engine.click("class="+locator,mainPage.getSnacksAndDrinksButtonIndex());
        String viewLocator="//android.widget.ScrollView/android.view.View/android.view.View";
        engine.click("xpath="+viewLocator,0);
        String buttonLocator=mainPage.getBaseLocator()+"/android.widget.ScrollView/android.view.View/android.view.View";
        engine.click("xpath="+buttonLocator,1);
        Assert.assertFalse(engine.isElementPresent("xpath="+buttonLocator,1));

    }

    //主页-详情03
    //步骤描述：进入类别具体介绍界面查看删除按钮是否可点击，是否起作用
    //bug描述：删除按钮无作用
    @Test
    public void test_controduction_button03(){
        String locator=mainPage.getSnacksAndDrinksButtonClassName();
        engine.click("class="+locator,mainPage.getSnacksAndDrinksButtonIndex());
        String viewLocator="//android.widget.ScrollView/android.view.View/android.view.View";
        engine.click("xpath="+viewLocator,0);
        String buttonLocator=mainPage.getBaseLocator()+"/android.widget.ScrollView/android.view.View/android.view.View";
        engine.click("xpath="+buttonLocator,1);
        String confirm_message=engine.getText("id=android:id/message",0);
        Assert.assertEquals(confirm_message,"你确定要删除吗？");
        engine.click("xpath="+buttonLocator,2);

    }

}
