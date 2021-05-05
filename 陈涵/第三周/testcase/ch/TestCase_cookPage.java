package com.appiumPlus.testcase.ch;

import com.appiumPlus.core.BaseTest;
import com.appiumPlus.po.ch.CookPage;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
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
        engine.clearAndType("class=android.widget.EditText" , 0 , "ch");
        //输入密码
        engine.clearAndType("class=android.widget.EditText" , 1 , "123456");
        //点击登录
        engine.click("class=android.widget.TextView" , 4);
        engine.click("xpath="+cookPage.getCookButtonXpath(),0);

    }

    //做饭-搜索01
    //步骤描述：搜索框输入存在食物回车，跳转页面之后查看显示
    //bug描述：输入框输入的内容并未起到筛选作用
    @Test
    public void test_search_show01(){
        engine.clearAndType("class=android.widget.EditText",2,"苹果");
        engine.click("class=android.widget.EditText",2);
        getDriver().pressKey(new KeyEvent(AndroidKey.ENTER));
        String locator=cookPage.getBaseLocator()+"/android.view.View/android.widget.ScrollView/android.view.View/android.view.View/android.widget.TextView";
        String showResult=engine.getText("xpath="+locator,2);
        Assert.assertEquals(showResult,"苹果");
    }

    //做饭-搜索02
    //步骤描述：搜索框输入不存在食物回车，跳转页面之后查看显示
    //bug描述：输出全部类容
    @Test
    public void test_search_show02(){
        engine.click("xpath="+cookPage.getCookButtonXpath(),0);
        engine.clearAndType("class=android.widget.EditText",2,"馒头");
        engine.click("class=android.widget.EditText",2);
        getDriver().pressKey(new KeyEvent(AndroidKey.ENTER));
        String locator=cookPage.getBaseLocator()+"/android.view.View/android.widget.ScrollView/android.view.View/android.view.View/android.widget.TextView";
        String showResult=engine.getText("xpath="+locator,2);
        Assert.assertEquals(showResult,"馒头");
    }

    //做饭-搜索03
    //步骤描述：搜索框输入特殊字符回车，跳转页面之后查看显示
    //bug描述：输出全部类容
    @Test
    public void test_search_show03(){
        engine.click("xpath="+cookPage.getCookButtonXpath(),0);
        engine.clearAndType("class=android.widget.EditText",2,"……￥%…………&");
        engine.click("class=android.widget.EditText",2);
        getDriver().pressKey(new KeyEvent(AndroidKey.ENTER));
        String locator=cookPage.getBaseLocator()+"/android.view.View/android.widget.ScrollView/android.view.View/android.view.View/android.widget.TextView";
        String showResult=engine.getText("xpath="+locator,2);
        Assert.assertEquals(showResult,"……￥%…………&");
    }
}
