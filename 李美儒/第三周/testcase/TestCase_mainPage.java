package com.appium_plus.testcase.lmr;

import com.appium_plus.core.BaseTest;
import com.appium_plus.po.lmr.MainPage;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase_mainPage extends BaseTest {

    public MainPage mainPage;
    @BeforeClass
    public void initPage(){
        mainPage=new MainPage();
        //点击登录
        engine.click("class=android.widget.TextView" , 0);
        //输入账号
        engine.clearAndType("class=android.widget.EditText" , 0 , "123");
        //输入密码
        engine.clearAndType("class=android.widget.EditText" , 1 , "123");
        //点击登录
        engine.click("class=android.widget.TextView" , 4);

    }

    //搜索框
    //步骤描述：搜索框输入一个类别回车，跳转页面之后看输入框是否变化（可能会有输入框默认值）
    //bug描述：搜索框输入一个类别回车之后，跳转页面输入框变成默认值（春菜）
    @Test
    public void test_type_search(){
        engine.clearAndType("class=android.widget.EditText",2,"零食");
        engine.click("class=android.widget.EditText",2);
        getDriver().pressKey(new KeyEvent(AndroidKey.ENTER));
        String locator=mainPage.getBaseLocator()+"/android.view.View/android.view.View/android.widget.EditText";
        String searchText=engine.getText("xpath="+locator,0);
        System.out.println(searchText);
        Assert.assertEquals(searchText,"零食");
    }

    //搜索框
    //步骤描述：搜索框输入一个类别回车，跳转页面之后查看显示的是否都是输入的类别
    //bug描述：输入框输入的内容并未起到筛选作用
    @Test
    public void test_search_show(){
        engine.clearAndType("class=android.widget.EditText",2,"零食");
        engine.click("class=android.widget.EditText",2);
        getDriver().pressKey(new KeyEvent(AndroidKey.ENTER));
        String locator=mainPage.getBaseLocator()+"/android.view.View/android.widget.ScrollView/android.view.View/android.view.View/android.widget.TextView";
        String showResult=engine.getText("xpath="+locator,2);
        Assert.assertEquals(showResult,"零食");
    }

    //点击水果蔬菜
    //步骤描述：点击水果蔬菜，查看是否有不是水果蔬菜分类的东西显示
    //bug描述：点击水果蔬菜，存在不是水果蔬菜分类的其他类型
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


    //点击肉蛋食品
    //步骤描述：点击肉蛋食品，查看是否有不是肉蛋食品分类的东西显示
    @Test
    public void test_click_meatsAndEggButton(){
        String locator=mainPage.getMeatsAndEggButtonClassName();
        engine.click("class="+locator,mainPage.getMeatsAndEggButtonIndex());
        String textLocator="//android.widget.ScrollView/android.view.View/android.view.View[2]/android.widget.TextView";
        engine.scrollToBottom(getDriver(),mainPage.getEndString());
        String result=engine.getText("xpath="+textLocator,2);
        System.out.println(result);
        Assert.assertEquals(result,"鸡蛋");
    }
    //点击海鲜水产
    //步骤描述：点击海鲜水产，查看是否有不是海鲜水产分类的东西显示
    @Test
    public void test_click_seafoodButton(){
        String locator=mainPage.getSeafoodButtonClassName();
        engine.click("class="+locator,mainPage.getSeafoodButtonIndex());
        String textLocator="//android.widget.ScrollView/android.view.View/android.view.View[2]/android.widget.TextView";
        engine.scrollToBottom(getDriver(),mainPage.getEndString());
        String result=engine.getText("xpath="+textLocator,2);
        System.out.println(result);
        Assert.assertEquals(result,"海鲜");

    }
    //点击速食冷冻
    //步骤描述：点击速食冷冻，查看是否有不是速食冷冻分类的东西显示
    @Test
    public void test_click_instantAndFrozenFoodButton(){
        String locator=mainPage.getInstantAndFrozenFoodButtonClassName();
        engine.click("class="+locator,mainPage.getInstantAndFrozenFoodButtonIndex());
        String textLocator="//android.widget.ScrollView/android.view.View/android.view.View[2]/android.widget.TextView";
        engine.scrollToBottom(getDriver(),mainPage.getEndString());
        String result=engine.getText("xpath="+textLocator,2);
        System.out.println(result);
        Assert.assertEquals(result,"速食");
    }
    //点击零食饮品
    //步骤描述：点击零食饮品，查看是否有不是零食饮品分类的东西显示
    @Test
    public void test_click_snacksAndDrinksButton(){
        String locator=mainPage.getSnacksAndDrinksButtonClassName();
        engine.click("class="+locator,mainPage.getSnacksAndDrinksButtonIndex());
        String textLocator="//android.widget.ScrollView/android.view.View/android.view.View[2]/android.widget.TextView";
        engine.scrollToBottom(getDriver(),mainPage.getEndString());
        String result=engine.getText("xpath="+textLocator,2);
        System.out.println(result);
        Assert.assertEquals(result,"零食");
    }

    //查看属于水果蔬菜分类下面的苹果，点开的有关内容是否是有关苹果的内容
    //步骤描述：点击水果蔬菜分类，点击分类下的第一个类别，查看里面的标题是否是苹果
    @Test
    public void test_click_fruitsAndVegetablesType_view(){
        String locator=mainPage.getFruitsAndVegetablesButtonClassName();
        engine.click("class="+locator,mainPage.getFruitsAndVegetablesButtonIndex());
        String viewLocator="//android.widget.ScrollView/android.view.View/android.view.View";
        engine.click("xpath="+viewLocator,0);
        String resultLocator=mainPage.getBaseLocator()+"/android.widget.ScrollView/android.view.View/android.widget.TextView";
        String result=engine.getText("xpath="+resultLocator,0);
        System.out.println(result);
        Assert.assertEquals(result,"苹果");
    }

    //查看属于肉蛋食品分类下面的鸡蛋，点开的有关内容是否是有关鸡蛋的内容
    //步骤描述：点击肉蛋食品分类，点击分类下的第一个类别，查看里面的标题是否是鸡蛋
    //bug描述：类别介绍是鸡蛋，但是点开内容是有关苹果的简介
    @Test
    public void test_click_meatsAndEggType_view(){
        String locator=mainPage.getMeatsAndEggButtonClassName();
        engine.click("class="+locator,mainPage.getMeatsAndEggButtonIndex());
        String viewLocator="//android.widget.ScrollView/android.view.View/android.view.View";
        engine.click("xpath="+viewLocator,0);
        String resultLocator=mainPage.getBaseLocator()+"/android.widget.ScrollView/android.view.View/android.widget.TextView";
        String result=engine.getText("xpath="+resultLocator,0);
        System.out.println(result);
        Assert.assertEquals(result,"鸡蛋");
    }

    //查看属于海鲜水产分类下面的海鲜，点开的有关内容是否是有关海鲜的内容
    //步骤描述：点击海鲜水产分类，点击分类下的第一个类别，查看里面的标题是否是海鲜
    //bug描述：类别介绍是海鲜，但是点开内容是有关苹果的简介
    @Test
    public void test_click_seafoodType_view(){
        String locator=mainPage.getSeafoodButtonClassName();
        engine.click("class="+locator,mainPage.getSeafoodButtonIndex());
        String viewLocator="//android.widget.ScrollView/android.view.View/android.view.View";
        engine.click("xpath="+viewLocator,0);
        String resultLocator=mainPage.getBaseLocator()+"/android.widget.ScrollView/android.view.View/android.widget.TextView";
        String result=engine.getText("xpath="+resultLocator,0);
        System.out.println(result);
        Assert.assertEquals(result,"海鲜");
    }


    //查看属于速食冷冻分类下面的速食，点开的有关内容是否是有关速食的内容
    //步骤描述：点击速食冷冻分类，点击分类下的第一个类别，查看里面的标题是否是速食
    //bug描述：类别介绍是速食，但是点开内容是有关苹果的简介
    @Test
    public void test_click_instantAndFrozenFoodType_view(){
        String locator=mainPage.getInstantAndFrozenFoodButtonClassName();
        engine.click("class="+locator,mainPage.getInstantAndFrozenFoodButtonIndex());
        String viewLocator="//android.widget.ScrollView/android.view.View/android.view.View";
        engine.click("xpath="+viewLocator,0);
        String resultLocator=mainPage.getBaseLocator()+"/android.widget.ScrollView/android.view.View/android.widget.TextView";
        String result=engine.getText("xpath="+resultLocator,0);
        System.out.println(result);
        Assert.assertEquals(result,"速食");
    }

    //查看属于零食饮品分类下面的零食，点开的有关内容是否是有关零食的内容
    //步骤描述：点击零食饮品分类，点击分类下的第一个类别，查看里面的标题是否是零食
    //bug描述：类别介绍是零食，但是点开内容是有关苹果的简介
    @Test
    public void test_click_snacksAndDrinksType_view(){
        String locator=mainPage.getSnacksAndDrinksButtonClassName();
        engine.click("class="+locator,mainPage.getSnacksAndDrinksButtonIndex());
        String viewLocator="//android.widget.ScrollView/android.view.View/android.view.View";
        engine.click("xpath="+viewLocator,0);
        String resultLocator=mainPage.getBaseLocator()+"/android.widget.ScrollView/android.view.View/android.widget.TextView";
        String result=engine.getText("xpath="+resultLocator,0);
        System.out.println(result);
        Assert.assertEquals(result,"零食");
    }

    //查看类别具体简介里面按钮是否可点击，是否有对应事件触发
    //步骤描述：随意点击一个分类，点击下面一个类别，进入类别具体介绍界面查看按钮是否可点击，是否起作用
    //bug描述：删除按钮可点击，但是按钮不起作用
    @Test
    public void test_controduction_button(){
        String locator=mainPage.getSnacksAndDrinksButtonClassName();
        engine.click("class="+locator,mainPage.getSnacksAndDrinksButtonIndex());
        String viewLocator="//android.widget.ScrollView/android.view.View/android.view.View";
        engine.click("xpath="+viewLocator,0);
        String buttonLocator=mainPage.getBaseLocator()+"/android.widget.ScrollView/android.view.View/android.view.View";
        engine.click("xpath="+buttonLocator,1);
        String confirm_message=engine.getText("id=android:id/message",0);
        System.out.println(confirm_message);
        Assert.assertEquals(confirm_message,"你确定要删除吗？");

        engine.click("xpath="+buttonLocator,2);

    }

    //查看主显示类别中的删除按钮是否起作用
    //步骤描述：任意点击一个分类，点击第一个介绍类别中的删除按钮，查看这个按钮是否会触发事件，点击取消，查看点击取消之后是否能进行取消删除
    @Test
    public void test_main_introduction_button_cancel(){
        String fruitsAndVegetablesButtonLoctor=mainPage.getFruitsAndVegetablesButtonClassName();
        engine.click("class="+fruitsAndVegetablesButtonLoctor,mainPage.getFruitsAndVegetablesButtonIndex());
        String buttonLocator="//android.widget.ScrollView/android.view.View/android.view.View/android.view.View";
        engine.click("xpath="+buttonLocator,0);
        String confirm_message=engine.getText("id=android:id/message",0);
        System.out.println(confirm_message);
        Assert.assertEquals(confirm_message,"你确定要删除吗？");
        //点击取消
        engine.click("id=android:id/button2",0);
        String textLocator="//android.widget.ScrollView/android.view.View/android.view.View[2]/android.widget.TextView";
        String result=engine.getText("xpath="+textLocator,2);
        System.out.println(result);
        Assert.assertEquals(result,"苹果");
    }

    //查看主显示类别中的删除按钮是否起作用
    //步骤描述：任意点击一个分类，点击第一个介绍类别中的删除按钮，查看这个按钮是否会触发事件，点击确定，查看点击确定之后是否能成功删除
    @Test
    public void test_main_introdution_button_confirm(){
        String fruitsAndVegetablesButtonLoctor=mainPage.getFruitsAndVegetablesButtonClassName();
        engine.click("class="+fruitsAndVegetablesButtonLoctor,mainPage.getFruitsAndVegetablesButtonIndex());
        String buttonLocator="//android.widget.ScrollView/android.view.View/android.view.View/android.view.View";
        engine.click("xpath="+buttonLocator,0);
        String confirm_message=engine.getText("id=android:id/message",0);
        System.out.println(confirm_message);
        //判断按钮可点击，会触发事件
        Assert.assertEquals(confirm_message,"你确定要删除吗？");
        //点击确定
        engine.click("id=android:id/button1",0);
        String locator="//android.widget.ScrollView/android.view.View/android.view.View";
        //判断是否被删除
        Assert.assertFalse(engine.isElementPresent("xpath="+locator,1));
    }

    //查看主类别中的饭按钮是否起作用，触发事件
    //步骤描述：任意点击一个分类，点击第一个介绍类别中的饭按钮，查看是否起作用会触发事件
    //bug描述：点击饭按钮，可以点击但是不会触发事件
    @Test
    public void test_main_introduction_button_food(){
        String fruitsAndVegetablesButtonLoctor=mainPage.getFruitsAndVegetablesButtonClassName();
        engine.click("class="+fruitsAndVegetablesButtonLoctor,mainPage.getFruitsAndVegetablesButtonIndex());
        String foodLocator="//android.widget.ScrollView/android.view.View/android.view.View/android.view.View";
        engine.click("xpath="+foodLocator,1);
    }

}
