package com.appiumPlus.testcase;

import com.appiumPlus.core.BaseTest;
import com.appiumPlus.po.CookPage;
import com.appiumPlus.po.EntrancePage;
import com.appiumPlus.po.FavoriteFoodPage;
import com.appiumPlus.po.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestFavoriteFood extends BaseTest {

    private EntrancePage entrancePage;
    private LoginPage loginPage;
    private FavoriteFoodPage favoriteFoodPage;

    @BeforeClass
    public void selectLogin(){
        entrancePage = new EntrancePage();
        engine.click(entrancePage.getLoginButton(),entrancePage.getLoginButtonIndex());
        loginPage = new LoginPage();
        engine.type(loginPage.getUsername(),loginPage.getUsernameIndex(),"lbj");
        engine.type(loginPage.getPwd(),loginPage.getPwdIndex(),"123");
        engine.click(loginPage.getLoginButton(),loginPage.getLoginButtonIndex());
        favoriteFoodPage = new FavoriteFoodPage();
        engine.click(favoriteFoodPage.getFavoriteFoodButton(),favoriteFoodPage.getFavoriteFoodButtonIndex());
    }

    //选择一个菜，点击删除，查看是否删除成功
    @Test
    public void test01(){
        engine.click(favoriteFoodPage.getDeleteButton(),0);
        engine.click(favoriteFoodPage.getConfirmButton(),0);
        boolean a = engine.isElementPresent("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[4]/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[4]", 0);
        Assert.assertFalse(a);
    }

    //选择一个菜，点击删除，点击取消，看能否取消
    @Test
    public void test02(){
        engine.click(favoriteFoodPage.getDeleteButton(),0);
        engine.click(favoriteFoodPage.getCancelButton(),0);
        boolean a = engine.isElementPresent("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[4]/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[4]", 0);
        Assert.assertTrue(a);
    }
    //搜索框搜索西红柿炒鸡蛋，查看是否能搜索到爱吃的菜
    @Test
    public void test03(){
        engine.type(favoriteFoodPage.getSearch(),favoriteFoodPage.getSearchIndex(),"西红柿炒鸡蛋");
        engine.click(favoriteFoodPage.getSearch(),favoriteFoodPage.getSearchIndex());
        engine.pressEnter();
        String res = engine.getText("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.widget.TextView", 0);
        Assert.assertEquals(res,"西红柿炒鸡蛋");
    }
}
