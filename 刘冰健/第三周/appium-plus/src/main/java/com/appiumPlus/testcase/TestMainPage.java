package com.appiumPlus.testcase;

import com.appiumPlus.core.BaseTest;
import com.appiumPlus.po.EntrancePage;
import com.appiumPlus.po.LoginPage;
import com.appiumPlus.po.MainPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestMainPage extends BaseTest {

    private EntrancePage entrancePage;
    private LoginPage loginPage;
    private MainPage mainPage;

    @BeforeClass
    public void selectLogin(){
        entrancePage = new EntrancePage();
        engine.click(entrancePage.getLoginButton(),entrancePage.getLoginButtonIndex());
        loginPage = new LoginPage();
        engine.type(loginPage.getUsername(),loginPage.getUsernameIndex(),"lbj");
        engine.type(loginPage.getPwd(),loginPage.getPwdIndex(),"123");
        engine.click(loginPage.getLoginButton(),loginPage.getLoginButtonIndex());
        mainPage = new MainPage();
    }

    //冰箱里有苹果，搜索苹果，查看搜索结果
    @Test
    public void test01(){
        engine.type(mainPage.getSearch(),mainPage.getSearchIndex(),"苹果");
        engine.click(mainPage.getSearch(),mainPage.getSearchIndex());
        engine.pressEnter();
        String res = engine.getText("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[3]/android.widget.TextView"
        ,2);
        Assert.assertEquals(res,"苹果");
    }

    //首次点击水果蔬菜，查看内容是否全部是水果蔬菜
    @Test
    public void test02(){
        engine.click(mainPage.getFruitsAndVegetablesButton(),mainPage.getFruitsAndVegetablesButtonIndex());
        String res = engine.getText("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/" +
                "android.view.View/android.view.View[3]/android.widget.TextView[1]",0);
        Assert.assertEquals(res,"苹果");
    }

    //点击肉蛋食品，查看内容是否全部是肉蛋食品
    @Test
    public void test03(){
        engine.click(mainPage.getMeatsAndEggButton(),mainPage.getMeatsAndEggButtonIndex());
        String res = engine.getText("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.widget.TextView[1]",0);
        Assert.assertEquals(res,"鸡蛋");
    }
    //点击海鲜水产，查看内容是否全部是海鲜水产
    @Test
    public void test04(){
        engine.click(mainPage.getSeafoodButton(),mainPage.getSeafoodButtonIndex());
        String res = engine.getText("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.widget.TextView[1]",0);
        Assert.assertEquals(res,"海鲜");
    }
    //点击素食冷冻，查看内容是否全部是素食冷冻
    @Test
    public void test05(){
        engine.click(mainPage.getInstantAndFrozenFoodButton(),mainPage.getInstantAndFrozenFoodButtonIndex());
        String res = engine.getText("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.widget.TextView[1]",0);
        Assert.assertEquals(res,"速食");
    }
    //点击零食饮品，查看内容是否全部是零食饮品
    @Test
    public void test06(){
        engine.click(mainPage.getSnacksAndDrinksButton(),mainPage.getSnacksAndDrinksButtonIndex());
        String res = engine.getText("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.widget.TextView[1]",0);
        Assert.assertEquals(res,"零食");
    }
    //再次点击水果蔬菜，查看内容是否全部是水果蔬菜
    @Test
    public void test07(){
        engine.click(mainPage.getFruitsAndVegetablesButton(),mainPage.getFruitsAndVegetablesButtonIndex());
        String res = engine.getText("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/" +
                "android.view.View/android.view.View[2]/android.widget.TextView[1]",0);
        Assert.assertEquals(res,"苹果");
    }
    //将水果蔬菜中的物品删除，查看能否成功删除
    @Test
    public void test08(){
        engine.click(mainPage.getFruitsAndVegetablesButton(),mainPage.getFruitsAndVegetablesButtonIndex());
        engine.click("class=android.widget.ImageView",9);
        engine.click("id=android:id/button1",0);
        engine.click("class=android.widget.ImageView",9);
        engine.click("id=android:id/button1",0);
    }
    //冰箱里没有苹果，搜索苹果，查看搜索结果
    @Test
    public void test09(){
        engine.type(mainPage.getSearch(),mainPage.getSearchIndex(),"苹果");
        engine.click(mainPage.getSearch(),mainPage.getSearchIndex());
        engine.pressEnter();
        String res = engine.getText("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[3]/android.widget.TextView"
                ,2);
        Assert.assertNotEquals(res,"苹果");
    }
    //搜索框输入纯数字，查看结果
    @Test
    public void test10(){
        engine.type(mainPage.getSearch(),mainPage.getSearchIndex(),"123");
        engine.click(mainPage.getSearch(),mainPage.getSearchIndex());
        engine.pressEnter();
        String res = engine.getText("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[3]/android.widget.TextView"
                ,0);
        Assert.assertEquals(res,"123");
    }
    //进入肉类食品分区，点击显示全部分类，查看是否显示全部的物品
    @Test
    public void test11(){
        engine.click(mainPage.getMeatsAndEggButton(),mainPage.getMeatsAndEggButtonIndex());
        engine.click("class=android.widget.TextView",21);
    }
    //在全部分类中，选择一个物品点击删除，查看是否成功删除
    @Test
    public void test12(){
        engine.click("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/" +
                "android.view.View[4]/android.view.View[1]/android.widget.ImageView",0);
        engine.click("id=android:id/button1",0);
        String res = engine.getText("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/" +
                "android.view.View[4]/android.widget.TextView[1]",0);
        Assert.assertNotEquals(res,"鸡蛋");
    }
    //在全部分类中，选择一个物品点击删除，然后进入物品对应的分区，查看是否成功删除
    @Test
    public void test13(){
        engine.click("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/" +
                "android.view.View[3]/android.view.View[1]/android.widget.ImageView",0);
        engine.click("id=android:id/button1",0);
        engine.click(mainPage.getMeatsAndEggButton(),mainPage.getMeatsAndEggButtonIndex());
        String res = engine.getText("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.TextView",0);
        Assert.assertEquals(res,"——显示全部分类——");
    }
    //选择一个物品，点击，查看词条是否属于对应物品
    @Test
    public void test14(){
        String entry = "xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[3]";
        String res = engine.getText(entry+"/android.widget.TextView[1]",0);
        engine.click(entry,0);
        String res1 = engine.getText("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.TextView[1]",0);
        Assert.assertEquals(res,res1);
    }
    //点击饭按钮，查看作用
    @Test
    public void test15(){
        engine.click("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.TextView",0);
        Assert.assertFalse(engine.isElementPresent(loginPage.getMainPageElem(),0));
    }

}
