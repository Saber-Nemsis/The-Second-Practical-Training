package com.appium_plus.testcase.lmr;

import com.appium_plus.core.BaseTest;
import com.appium_plus.po.lmr.CookPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase_cookPage extends BaseTest {

    public CookPage cookPage;
    @BeforeClass
    public void initPage(){
        cookPage=new CookPage();
        //点击登录
        engine.click("class=android.widget.TextView" , 0);
        //输入账号
        engine.clearAndType("class=android.widget.EditText" , 0 , "123");
        //输入密码
        engine.clearAndType("class=android.widget.EditText" , 1 , "123");
        //点击登录
        engine.click("class=android.widget.TextView" , 4);
        engine.click("xpath="+cookPage.getCookButtonXpath(),0);

    }

    //点击一个做饭简介内容是否一致测试
    //步骤描述：点开一个做饭简介，看里面介绍的饭菜名字和做饭主页的名字是否一致
    //bug描述：做饭主页的饭菜名字和点进去的详细做饭步骤的饭菜名字不一样
    @Test
    public void test_foodName_equal(){
        engine.click("xpath="+cookPage.getFoodIntruductionXpath(),0);
        String actualFoodNameLocator="//android.widget.ScrollView/android.view.View/android.view.View/android.widget.TextView";
        String actualFoodName=engine.getText("xpath="+actualFoodNameLocator,0);
        System.out.println(actualFoodName);
        String foodNameLocator=cookPage.getBaseLocator()+"/android.widget.ScrollView/android.view.View/android.view.View[1]/android.widget.TextView";
        String foodName=engine.getText("xpath="+foodNameLocator,1);
        System.out.println(foodName);
        Assert.assertEquals(foodName,actualFoodName);
    }

    //查看做饭具体内容显示
    //步骤描述：点击任何一个做饭详细步骤，浏览查看内容是否存在问题，或者时候存在大量重复
    //bug描述：存在多个步骤描述内容相同的问题
    @Test
    public void test_foodIntroduction_step(){
        engine.click("xpath="+cookPage.getFoodIntruductionXpath(),0);
        String locator=cookPage.getBaseLocator()+"/android.widget.ScrollView/android.view.View/android.widget.TextView";
        String starStep=engine.getText("xpath="+locator,0);
        String startStr=engine.getText("xpath="+locator,1);
        engine.scrollToBottom(getDriver(),cookPage.getEndString());
        String endStep=engine.getText("xpath="+locator,0);
        String endStr=engine.getText("xpath="+locator,1);
        //步骤不同
        if(starStep!=endStep){
            //步骤内容相同
            Assert.assertNotEquals(startStr,endStr);
        }
    }


    //查看做饭详细步骤的返回键是否能真正返回
    //步骤描述：点击之前，判断在主页，任意点击一个做饭简介，判断切换到了做饭详细步骤页面，然后点击返回键，判断返回到了主页
    @Test
    public void test_foodIntroduction_back(){
        String mainFoodPageLocator="//android.widget.ScrollView/android.view.View/android.view.View/android.widget.TextView";
        Assert.assertTrue(engine.isElementPresent("xpath="+mainFoodPageLocator,0));
        engine.click("xpath="+cookPage.getFoodIntruductionXpath(),0);
        String secondFoodPageLocator=cookPage.getBaseLocator()+"/android.widget.ScrollView/android.view.View/android.view.View[1]/android.widget.TextView";
        Assert.assertTrue(engine.isElementPresent("xpath="+secondFoodPageLocator,1));
        String backLocator=cookPage.getBaseLocator()+"/android.widget.ScrollView/android.view.View/android.view.View[1]/android.view.View";
        engine.click("xpath="+backLocator,0);
        Assert.assertTrue(engine.isElementPresent("xpath="+mainFoodPageLocator,0));

    }



}
