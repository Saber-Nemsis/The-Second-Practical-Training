package com.appium_plus.testcase.wzj;

import com.appium_plus.core.BaseTest;
import com.appium_plus.po.wzj.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase extends BaseTest {
    /**
     * 1.测试正常登陆
     */
    @Test
    public void testLogin(){
        //入口页面,点击登录按钮
        EntrancePage entrancePage = new EntrancePage();
        entrancePage.click(super.engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录，1代表正常输入账号密码，0代表不输入，-1代表输入错误账号密码
        new LoginPage().login(super.engine, 1);

        //断言底部栏是否存在"主页"选项按钮
        MainPage mainPage = new MainPage();
        Assert.assertTrue(engine.isDisplayed(mainPage.getMainPageXapth() , mainPage.getMainPageIndex()));
    }

    /**
     * 2.测试注册
     */
    @Test
    public void testSignin(){
        //入口页面,点击登录按钮
        EntrancePage entrancePage = new EntrancePage();
        entrancePage.click(super.engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());
        //点击注册按钮
        entrancePage.click(super.engine , entrancePage.getSigninButtonClassName() , entrancePage.getSigninButtonIndex());

        //注册
        SigninPage signinPage = new SigninPage();

        //断言底部是否存在注册并登录按钮
        Assert.assertTrue(engine.isDisplayed(signinPage.getSigninButtonClassName() , signinPage.getSigninButtonIndex()));
    }

    /**
     * 3.测试添加功能
     */
    @Test
    public void testAdd(){
        //入口页面,点击登录按钮
        EntrancePage entrancePage = new EntrancePage();
        entrancePage.click(super.engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new LoginPage().login(super.engine, 1);

        //添加物品
        AddPage addPage = new AddPage();
        addPage.add(super.engine);

        //断言当前页面是否还存在添加页面里的添加按钮
        Assert.assertTrue(engine.isDisplayed(addPage.getAddButtonClassName() , addPage.getAddButtonIndex()));
    }

    /**
     * 4.测试搜索
     */
    @Test
    public void testSearch(){
        //入口页面,点击登录按钮
        com.appium_plus.po.wzj.EntrancePage entrancePage = new com.appium_plus.po.wzj.EntrancePage();
        entrancePage.click(super.engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new com.appium_plus.po.wzj.LoginPage().login(super.engine, 1);

        //输入内容
        com.appium_plus.po.wzj.MainPage mainPage = new com.appium_plus.po.wzj.MainPage();
        mainPage.clearAndType(super.engine , mainPage.getInputClassName() , mainPage.getInputIndex() , mainPage.getInputContent());

        Assert.assertTrue(mainPage.getInputContent().equals(engine.getText(mainPage.getInputClassName() , mainPage.getInputIndex())));
    }

    /**
     * 5.测试删除
     */
    @Test
    public void testDeleteMainPageFoods(){
        //入口页面,点击登录按钮
        com.appium_plus.po.wzj.EntrancePage entrancePage = new com.appium_plus.po.wzj.EntrancePage();
        entrancePage.click(super.engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new com.appium_plus.po.wzj.LoginPage().login(super.engine, 1);

        //先获取当前页面有多少个记录
        com.appium_plus.po.wzj.MainPage mainPage = new com.appium_plus.po.wzj.MainPage();
        int beforeDeleteCount = engine.findALlElement(mainPage.getAllGoodsClassName()).size();

        //点击第一条记录的删除
        mainPage.click(super.engine , mainPage.getFirstGoodsDeleteButtonClassName() , mainPage.getFirstGoodsDeleteButtonIndex());
        //点击删除弹窗的确定
        mainPage.click(super.engine , mainPage.getAlertButtonClassName() , mainPage.getAlertButtonIndex());

        //删除后的记录
        int afterDeleteCount = engine.findALlElement(mainPage.getAllGoodsClassName()).size();

        System.out.println(beforeDeleteCount + " " + afterDeleteCount);
        Assert.assertTrue(beforeDeleteCount == afterDeleteCount);
    }

    /**
     * 6.测试点击主页的速食冷冻按钮
     */
    @Test
    public void testClickFastFoodButton(){
        //入口页面,点击登录按钮
        com.appium_plus.po.wzj.EntrancePage entrancePage = new com.appium_plus.po.wzj.EntrancePage();
        entrancePage.click(super.engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new com.appium_plus.po.wzj.LoginPage().login(super.engine, 1);

        //获取主页所有记录
        com.appium_plus.po.wzj.MainPage mainPage = new com.appium_plus.po.wzj.MainPage();
        int beforeClickCount = engine.findALlElement(mainPage.getAllGoodsClassName()).size();

        //点击速食冷冻按钮
        mainPage.click(super.engine , mainPage.getFastFoodButtonClassName() , mainPage.getFastFoodButtonIndex());

        //获取主页所有记录
        int afterClickCount = engine.findALlElement(mainPage.getAllGoodsClassName()).size();

        Assert.assertTrue(beforeClickCount != afterClickCount);
    }

    /**
     * 7.测试点击主页的零食饮品
     */
    @Test
    public void testClickSnacksAndDrinkButton(){
        //入口页面,点击登录按钮
        com.appium_plus.po.wzj.EntrancePage entrancePage = new com.appium_plus.po.wzj.EntrancePage();
        entrancePage.click(super.engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new com.appium_plus.po.wzj.LoginPage().login(super.engine, 1);

        //获取主页所有记录
        com.appium_plus.po.wzj.MainPage mainPage = new com.appium_plus.po.wzj.MainPage();
        int beforeClickCount = engine.findALlElement(mainPage.getAllGoodsClassName()).size();

        //点击零食饮品按钮
        mainPage.click(super.engine , mainPage.getSnacksAndDrinkButtonClassName() , mainPage.getSnacksAndDrinkButtonIndex());

        //获取主页所有记录
        int afterClickCount = engine.findALlElement(mainPage.getAllGoodsClassName()).size();

        Assert.assertTrue(beforeClickCount != afterClickCount);
    }

    /**
     * 8.测试点击主页的海鲜水产按钮
     */
    @Test
    public void testClickSeafoodButton(){
        //入口页面,点击登录按钮
        com.appium_plus.po.wzj.EntrancePage entrancePage = new com.appium_plus.po.wzj.EntrancePage();
        entrancePage.click(super.engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new com.appium_plus.po.wzj.LoginPage().login(super.engine, 1);

        //获取主页所有记录
        com.appium_plus.po.wzj.MainPage mainPage = new com.appium_plus.po.wzj.MainPage();
        int beforeClickCount = engine.findALlElement(mainPage.getAllGoodsClassName()).size();

        //点击海鲜水产按钮
        mainPage.click(super.engine , mainPage.getSeafoodButtonClassName() , mainPage.getSeafoodButtonIndex());

        //获取主页所有记录
        int afterClickCount = engine.findALlElement(mainPage.getAllGoodsClassName()).size();

        Assert.assertTrue(beforeClickCount != afterClickCount);
    }

    /**
     * 9.测试点击主页的肉蛋食品按钮
     */
    @Test
    public void testClickMeatAndEggButton(){
        //入口页面,点击登录按钮
        com.appium_plus.po.wzj.EntrancePage entrancePage = new com.appium_plus.po.wzj.EntrancePage();
        entrancePage.click(super.engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new com.appium_plus.po.wzj.LoginPage().login(super.engine, 1);

        //获取主页所有记录
        com.appium_plus.po.wzj.MainPage mainPage = new com.appium_plus.po.wzj.MainPage();
        int beforeClickCount = engine.findALlElement(mainPage.getAllGoodsClassName()).size();

        //点击肉蛋食品按钮
        mainPage.click(super.engine , mainPage.getMeatAndEggButtonClassName() , mainPage.getMeatAndEggButtonIndex());

        //获取主页所有记录
        int afterClickCount = engine.findALlElement(mainPage.getAllGoodsClassName()).size();

        Assert.assertTrue(beforeClickCount != afterClickCount);
    }

    /**
     * 10.测试食品查看功能
     */
    @Test
    public void testClickGoods(){
        //入口页面,点击登录按钮
        com.appium_plus.po.wzj.EntrancePage entrancePage = new com.appium_plus.po.wzj.EntrancePage();
        entrancePage.click(super.engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new com.appium_plus.po.wzj.LoginPage().login(super.engine, 1);

        //点击一种物品
        com.appium_plus.po.wzj.MainPage mainPage = new com.appium_plus.po.wzj.MainPage();
        mainPage.click(super.engine , mainPage.getGoodsClassName() , mainPage.getGoodsIndex());

        //断言营养小贴士是否存在
        GoodsInfoPage goodsInfoPage = new GoodsInfoPage();
        Assert.assertTrue(engine.isDisplayed(goodsInfoPage.getRemainderClassName() , goodsInfoPage.getRemainderIndex()));
    }

    /**
     * 11.测试查看我的关注
     */
    @Test
    public void testMyFollower(){
        //入口页面,点击登录按钮
        com.appium_plus.po.wzj.EntrancePage entrancePage = new com.appium_plus.po.wzj.EntrancePage();
        entrancePage.click(super.engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new com.appium_plus.po.wzj.LoginPage().login(super.engine, 1);

        //点击我的页面
        com.appium_plus.po.wzj.MyPage myPage = new com.appium_plus.po.wzj.MyPage();
        myPage.click(super.engine , myPage.getMyXpath() , myPage.getMyIndex());

        //点击我的关注
        myPage.click(super.engine , myPage.getMyFollowerClassName() , myPage.getMyFollowerIndex());

        //断言顶部是否存在"你关注的人"这个元素
        com.appium_plus.po.wzj.MyFollowerPage myFollowerPage = new com.appium_plus.po.wzj.MyFollowerPage();
        Assert.assertTrue(engine.isDisplayed(myFollowerPage.getFollowButtonClassName() , myFollowerPage.getFollowButtonIndex()));
    }

    /**
     * 12.测试查看我的粉丝
     */
    @Test
    public void testMyFuns(){
        //入口页面,点击登录按钮
        com.appium_plus.po.wzj.EntrancePage entrancePage = new com.appium_plus.po.wzj.EntrancePage();
        entrancePage.click(super.engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new com.appium_plus.po.wzj.LoginPage().login(super.engine, 1);

        //点击我的页面
        com.appium_plus.po.wzj.MyPage myPage = new com.appium_plus.po.wzj.MyPage();
        myPage.click(super.engine , myPage.getMyXpath() , myPage.getMyIndex());

        //点击我的粉丝
        myPage.click(super.engine , myPage.getMyFunsClassName() , myPage.getMyFunsIndex());

        //断言标题
        com.appium_plus.po.wzj.MyFunsPage myFunsPage = new com.appium_plus.po.wzj.MyFunsPage();
        Assert.assertTrue(engine.isDisplayed(myFunsPage.getMyFunsTitleClassName() , myFunsPage.getMyFunsTitleIndex()));
    }

    /**
     * 13.测试我的心得
     */
    @Test
    public void testMyConclusion(){
        //入口页面,点击登录按钮
        com.appium_plus.po.wzj.EntrancePage entrancePage = new com.appium_plus.po.wzj.EntrancePage();
        entrancePage.click(super.engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new com.appium_plus.po.wzj.LoginPage().login(super.engine, 1);

        //点击我的页面
        com.appium_plus.po.wzj.MyPage myPage = new com.appium_plus.po.wzj.MyPage();
        myPage.click(super.engine , myPage.getMyXpath() , myPage.getMyIndex());

        //点击我的心得
        myPage.click(super.engine , myPage.getMyConclusionClassName() , myPage.getMyConclusionIndex());

        //断言是否还在"我的"页面
        Assert.assertTrue(engine.isDisplayed(myPage.getMyXpath() , myPage.getMyIndex()));
    }

    /**
     * 14.测试拍照
     */
    @Test
    public void testTakePhoto(){
        //入口页面,点击登录按钮
        com.appium_plus.po.wzj.EntrancePage entrancePage = new com.appium_plus.po.wzj.EntrancePage();
        entrancePage.click(super.engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new com.appium_plus.po.wzj.LoginPage().login(super.engine, 1);

        //点击我的页面
        com.appium_plus.po.wzj.MyPage myPage = new com.appium_plus.po.wzj.MyPage();
        myPage.click(super.engine , myPage.getMyXpath() , myPage.getMyIndex());

        //点击右上方的拍照
        myPage.click(super.engine , myPage.getTakePhotoButtonClassName() , myPage.getTakePhotoButtonIndex());

        //断言是否还在"我的"页面
        Assert.assertTrue(engine.isDisplayed(myPage.getMyXpath() , myPage.getMyIndex()));
    }

    /**
     * 15.测试设置功能
     */
    @Test
    public void testSetting(){
        //入口页面,点击登录按钮
        com.appium_plus.po.wzj.EntrancePage entrancePage = new com.appium_plus.po.wzj.EntrancePage();
        entrancePage.click(super.engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new com.appium_plus.po.wzj.LoginPage().login(super.engine, 1);

        //点击我的页面
        com.appium_plus.po.wzj.MyPage myPage = new com.appium_plus.po.wzj.MyPage();
        myPage.click(super.engine , myPage.getMyXpath() , myPage.getMyIndex());

        //点击右上方的设置
        myPage.click(super.engine , myPage.getSettingClassName() , myPage.getSettingIndex());

        //断言是否还在"我的"页面
        Assert.assertTrue(engine.isDisplayed(myPage.getMyXpath() , myPage.getMyIndex()));
    }

    /**
     * 16.测试爱吃列表的查看功能
     */
    @Test
    public void testDeleteFavorite(){
        //入口页面,点击登录按钮
        com.appium_plus.po.wzj.EntrancePage entrancePage = new com.appium_plus.po.wzj.EntrancePage();
        entrancePage.click(super.engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new com.appium_plus.po.wzj.LoginPage().login(super.engine, 1);

        //点击"爱吃"
        com.appium_plus.po.wzj.FavoritesPage favoritesPage = new com.appium_plus.po.wzj.FavoritesPage();
        favoritesPage.click(super.engine , favoritesPage.getFavoritesXpath() , favoritesPage.getFavoritesIndex());

        //点击菜谱
        favoritesPage.click(super.engine , favoritesPage.getClassName(), favoritesPage.getIndex());

    }

    /**
     *17.测试主页饭按钮
     */
    @Test
    public void testClickCook(){
        //入口页面,点击登录按钮
        com.appium_plus.po.wzj.EntrancePage entrancePage = new com.appium_plus.po.wzj.EntrancePage();
        entrancePage.click(super.engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new com.appium_plus.po.wzj.LoginPage().login(super.engine, 1);

        //点击饭按钮
        com.appium_plus.po.wzj.MainPage mainPage = new com.appium_plus.po.wzj.MainPage();
        mainPage.click(super.engine , mainPage.getCookButtonClassName(), mainPage.getCookButtonIndex());
    }

    /**
     * 18.测试做饭页面菜谱
     */
    @Test
    public void testCook(){
        //入口页面,点击登录按钮
        com.appium_plus.po.wzj.EntrancePage entrancePage = new com.appium_plus.po.wzj.EntrancePage();
        entrancePage.click(super.engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new com.appium_plus.po.wzj.LoginPage().login(super.engine, 1);

        //点击做饭列表第一个菜谱
        com.appium_plus.po.wzj.CookPage cookPage = new com.appium_plus.po.wzj.CookPage();
        cookPage.click(super.engine,cookPage.getFoodIntruductionXpath(),0);
    }

    /**
     * 19.测试动态功能
     */
    @Test
    public void testTrend(){
        //入口页面,点击登录按钮
        com.appium_plus.po.wzj.EntrancePage entrancePage = new com.appium_plus.po.wzj.EntrancePage();
        entrancePage.click(super.engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new com.appium_plus.po.wzj.LoginPage().login(super.engine, 1);

        //点击我的页面
        com.appium_plus.po.wzj.MyPage myPage = new com.appium_plus.po.wzj.MyPage();
        myPage.click(super.engine , myPage.getClassName() , myPage.getIndex());


    }

    /**
     * 20.测试查看爱吃的菜谱删除功能
     */
    @Test
    public void testFavoriteDelete(){
        //入口页面,点击登录按钮
        com.appium_plus.po.wzj.EntrancePage entrancePage = new com.appium_plus.po.wzj.EntrancePage();
        entrancePage.click(super.engine , entrancePage.getLoginButtonClassName() , entrancePage.getLoginButtonIndex());

        //输入账号密码，点击登录
        new com.appium_plus.po.wzj.LoginPage().login(super.engine, 1);

        //点击"爱吃"
        com.appium_plus.po.wzj.FavoritesPage favoritesPage = new com.appium_plus.po.wzj.FavoritesPage();
        favoritesPage.click(super.engine , favoritesPage.getFavoritesXpath() , favoritesPage.getFavoritesIndex());

        //点击菜谱删除
        favoritesPage.click(super.engine , favoritesPage.getClassName(), favoritesPage.getIndex());
    }
}
