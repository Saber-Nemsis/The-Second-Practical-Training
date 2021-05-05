package com.appiumPlus.testcase;

import com.appiumPlus.core.BaseTest;
import com.appiumPlus.po.CookPage;
import com.appiumPlus.po.EntrancePage;
import com.appiumPlus.po.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCookPage extends BaseTest {

    private EntrancePage entrancePage;
    private LoginPage loginPage;
    private CookPage cookPage;

    @BeforeClass
    public void selectLogin(){
        entrancePage = new EntrancePage();
        engine.click(entrancePage.getLoginButton(),entrancePage.getLoginButtonIndex());
        loginPage = new LoginPage();
        engine.type(loginPage.getUsername(),loginPage.getUsernameIndex(),"lbj");
        engine.type(loginPage.getPwd(),loginPage.getPwdIndex(),"123");
        engine.click(loginPage.getLoginButton(),loginPage.getLoginButtonIndex());
        cookPage = new CookPage();
        engine.click(cookPage.getCookButton(),cookPage.getCookButtonIndex());
    }

    //点击菜名，查看进入后显示的做法是否属于对应的菜
    @Test
    public void test01(){
        String res = engine.getText(cookPage.getDishName(),cookPage.getDishNameIndex());
        engine.click(cookPage.getDishEntry(),cookPage.getDishEntryIndex());
        String res1 = engine.getText("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.widget.TextView[2]", 0);
        Assert.assertEquals(res,res1);
    }

    //搜索框搜索西红柿炒鸡蛋，查看是否有对应的词条
    @Test
    public void test02(){
        engine.type(cookPage.getSearch(),cookPage.getSearchIndex(),"西红柿炒鸡蛋");
        engine.click(cookPage.getSearch(),cookPage.getSearchIndex());
        engine.pressEnter();
        String res = engine.getText("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.widget.TextView", 0);
        Assert.assertEquals(res,"西红柿炒鸡蛋");
    }
    //点击菜名，进入词条后点击关闭，查看能否关闭
    @Test
    public void test03(){
        engine.click(cookPage.getDishEntry(),cookPage.getDishEntryIndex());
        engine.click("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.view.View/android.widget.TextView",0);
        Assert.assertTrue(engine.isElementPresent(cookPage.getDishEntry(),cookPage.getDishEntryIndex()));
    }
}
