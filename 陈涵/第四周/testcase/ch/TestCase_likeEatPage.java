package com.appiumPlus.testcase.ch;
import com.appiumPlus.core.BaseTest;
import com.appiumPlus.po.ch.LikeEatPage;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase_likeEatPage extends BaseTest {
    public LikeEatPage likeEatPage;
    @BeforeClass
    public void initPage(){
        likeEatPage=new LikeEatPage();
        //点击登录
        engine.click("class=android.widget.TextView" , 0);
        //输入账号
        engine.clearAndType("class=android.widget.EditText" , 0 , "ch");
        //输入密码
        engine.clearAndType("class=android.widget.EditText" , 1 , "123456");
        //点击登录
        engine.click("class=android.widget.TextView" , 4);
        engine.click("xpath="+likeEatPage.getLikeEatButtonXpath(),0);

    }

    //爱吃-搜索01
    //步骤描述：在搜索框输入食物名称，点击回车，查看显示
    //bug描述：出现搜索内容之外内容
    @Test
    public void test_search_myFavotite01(){
        String searchLikeFoodName="苹果";
        engine.clearAndType("class="+likeEatPage.getSearchStarFoodClassName(),likeEatPage.getSearchStarFoodIndex(),searchLikeFoodName);
        engine.click("class="+likeEatPage.getSearchStarFoodClassName(),likeEatPage.getSearchStarFoodIndex());
        getDriver().pressKey(new KeyEvent(AndroidKey.ENTER));
        String locator=likeEatPage.getBaseLocator()+"/android.view.View/android.widget.ScrollView/android.view.View/android.view.View/android.widget.TextView";
        String showResult=engine.getText("xpath="+locator,2);
        Assert.assertEquals(showResult,"苹果");
    }

    //爱吃-搜索02
    //步骤描述：在搜索框不输入，点击回车，查看显示
    //bug描述：显示全部
    @Test
    public void test_search_myFavotite02(){
        String searchLikeFoodName="";
        engine.clearAndType("class="+likeEatPage.getSearchStarFoodClassName(),likeEatPage.getSearchStarFoodIndex(),searchLikeFoodName);
        engine.click("class="+likeEatPage.getSearchStarFoodClassName(),likeEatPage.getSearchStarFoodIndex());
        getDriver().pressKey(new KeyEvent(AndroidKey.ENTER));
        String locator=likeEatPage.getBaseLocator()+"/android.view.View/android.widget.ScrollView/android.view.View/android.view.View/android.widget.TextView";
        String showResult=engine.getText("xpath="+locator,2);
        Assert.assertEquals(showResult,"苹果");
    }

}
