package com.uiautomator_plus.testcase.lbj;

import androidx.test.uiautomator.By;

import com.uiautomator_plus.core.BaseTest;
import com.uiautomator_plus.core.Engine;
import com.uiautomator_plus.po.lbj.CookPage;
import com.uiautomator_plus.po.lbj.EntrancePage;
import com.uiautomator_plus.po.lbj.LoginPage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCookPage extends BaseTest {

    private EntrancePage entrancePage;
    private LoginPage loginPage;
    private CookPage cookPage;
    private Engine engine;

    @Before
    public void selectLogin() throws InterruptedException {
        engine = this.getEngine();
        entrancePage = new EntrancePage();
        engine.click(entrancePage.getLoginButton(),0);
        Thread.sleep(1000);
        loginPage = new LoginPage();
        engine.clearAndType(loginPage.getUsername(),loginPage.getUsernameIndex(),"lbj");
        engine.clearAndType(loginPage.getPwd(),loginPage.getPwdIndex(),"123");
        Thread.sleep(1000);
        engine.click(loginPage.getLoginButton(),loginPage.getLoginButtonIndex());
        cookPage = new CookPage();
        engine.click(cookPage.getCookButton(),0);
    }

    //点击菜名，查看进入后显示的做法是否属于对应的菜
    @Test
    public void test01(){
        String res = engine.getText(cookPage.getDishName(),0);
        System.out.println("菜名"+res);
        engine.click(cookPage.getDishEntry(),cookPage.getDishEntryIndex());
        String res1 = engine.getText("text=外加里嫩~炸豆腐丸子",0);
        engine.back();
        Assert.assertEquals(res,res1);
    }

    //点击菜名，进入词条后点击关闭，查看能否关闭
    @Test
    public void test02(){
        engine.click(450,800);
        engine.pause(1000);
        engine.click(765,136);
        Assert.assertTrue(engine.isElementPresent(cookPage.getDishEntry(),cookPage.getDishEntryIndex()));
    }

    //搜索框搜索西红柿炒鸡蛋，查看是否有对应的词条
    @Test
    public void test03(){
        engine.clearAndType(cookPage.getSearch(),cookPage.getSearchIndex(),"西红柿炒鸡蛋");
        engine.click(cookPage.getSearch(),cookPage.getSearchIndex());
        engine.pressEnter();
//        String res = engine.getText("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.widget.TextView", 0);
        Assert.assertTrue(engine.isElementPresent("text=西红柿炒鸡蛋",0));
    }
}
